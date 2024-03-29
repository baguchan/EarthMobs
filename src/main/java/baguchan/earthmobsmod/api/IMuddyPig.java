package baguchan.earthmobsmod.api;

import baguchan.earthmobsmod.registry.ModTags;
import net.minecraft.world.entity.LivingEntity;

public interface IMuddyPig {
	boolean isMuddy();

	void setMuddy(boolean playing);

	float getBodyRollAngle(float p_30433_, float p_30434_);

    void setColorData(byte colorData);

    byte getColorData();

	default boolean canMuddy(LivingEntity livingEntity) {
		return livingEntity.getType().is(ModTags.Entities.CAN_MUDDY);
	}
}
