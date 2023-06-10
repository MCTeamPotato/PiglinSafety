package com.teampotato.piglinsafety.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PiglinBrute.class)
public abstract class MixinPiglinBrute extends Entity {

    public MixinPiglinBrute(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public boolean fireImmune() {
        return true;
    }
}
