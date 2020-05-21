package net.mcreator.beescuit.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.beescuit.BeescuitModElements;

@BeescuitModElements.ModElement.Tag
public class CiomagLivingEntityIsHitWithToolProcedure extends BeescuitModElements.ModElement {
	public CiomagLivingEntityIsHitWithToolProcedure(BeescuitModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CiomagLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 40, (int) 2));
	}
}
