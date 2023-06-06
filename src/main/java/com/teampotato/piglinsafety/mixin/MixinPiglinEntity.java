package com.teampotato.piglinsafety.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PiglinEntity.class)
public abstract class MixinPiglinEntity extends Entity {
    public MixinPiglinEntity(EntityType<?> pType, World pLevel) {
        super(pType, pLevel);
    }

    @Override
    public boolean fireImmune() {
        return true;
    }
}