package com.teampotato.piglinsafety.mixin;

import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PiglinBrute.class)
public class MixinPiglinBrute extends MixinEntity {
    protected void checkFireImmune(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(Boolean.TRUE);
    }
}
