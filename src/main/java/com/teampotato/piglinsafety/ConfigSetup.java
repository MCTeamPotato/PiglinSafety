package com.teampotato.piglinsafety;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.io.*;
import java.util.List;
import java.util.Set;

public class ConfigSetup implements IMixinConfigPlugin {

    private static boolean piglin, hoglin, piglinBrute;

    public ConfigSetup() {
        File file = FMLPaths.CONFIGDIR.get().resolve("piglinsafety.json").toFile();
        if (!file.exists()) {
            try {
                FileWriter writer = writeFile(file);
                writer.close();
            } catch (IOException e) {
                LogManager.getLogger().error("Error writing config", e);
            }
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            JsonObject config = new JsonParser().parse(reader).getAsJsonObject();
            piglin = config.get("Piglin").getAsBoolean();
            hoglin = config.get("Hoglin").getAsBoolean();
            piglinBrute = config.get("PiglinBrute").getAsBoolean();
            reader.close();
        } catch (IOException e) {
            LogManager.getLogger().error("Error reading config", e);
        }
    }

    private static FileWriter writeFile(File file) throws IOException {
        JsonObject defaultConfig = new JsonObject();
        defaultConfig.addProperty("Piglin", true);
        defaultConfig.addProperty("Hoglin", true);
        defaultConfig.addProperty("PiglinBrute", true);
        FileWriter writer = new FileWriter(file);
        writer.write(defaultConfig.toString());
        return writer;
    }


    @Override
    public boolean shouldApplyMixin(String s, String mixinClassName) {
        if (mixinClassName.contains("PiglinBrute")) return piglinBrute;
        if (mixinClassName.contains("Piglin")) return piglin;
        if (mixinClassName.contains("Hoglin")) return hoglin;
        return true;
    }


    @Override public void onLoad(String s) {}
    @Override public String getRefMapperConfig() {return null;}
    @Override public void acceptTargets(Set<String> set, Set<String> set1) {}
    @Override public List<String> getMixins() {return null;}
    @Override public void preApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {}
    @Override public void postApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {}
}
