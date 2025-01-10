package com.teampotato.piglinsafety.mixin;

import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class MixinEntity {
    @SuppressWarnings("CancellableInjectionUsage")
    @Inject(method = "fireImmune", at = @At("HEAD"), cancellable = true)
    protected void checkFireImmune(CallbackInfoReturnable<Boolean> cir) {}
}
