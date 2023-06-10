package com.teampotato.piglinsafety.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PiglinBruteEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PiglinBruteEntity.class)
public abstract class MixinPiglinBruteEntity extends Entity {
    public MixinPiglinBruteEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    public boolean isFireImmune() {
        return true;
    }
}
