package com.teampotato.piglinsafety.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PiglinBruteEntity.class)
public abstract class MixinPiglinBruteEntity extends Entity {
    public MixinPiglinBruteEntity(EntityType<?> pType, World pLevel) {
        super(pType, pLevel);
    }

    @Override
    public boolean fireImmune() {
        return true;
    }
}
