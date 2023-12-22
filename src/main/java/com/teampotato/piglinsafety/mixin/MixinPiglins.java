package com.teampotato.piglinsafety.mixin;

import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PiglinBrute.class, Piglin.class})
public class MixinPiglins extends MixinEntity {
    protected void checkFireImmune(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(Boolean.TRUE);
    }
}
