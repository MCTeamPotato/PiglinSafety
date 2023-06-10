package com.teampotato.piglinsafety.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Piglin.class)
public abstract class MixinPiglin extends Entity {
    public MixinPiglin(EntityType<?> pType, Level pLevel) {
        super(pType, pLevel);
    }

    @Override
    public boolean fireImmune() {
        return true;
    }
}