package com.teampotato.piglinsafety.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PiglinEntity.class)
public abstract class MixinPiglinEntity extends Entity {
    public MixinPiglinEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    public boolean isFireImmune() {
        return true;
    }
}
