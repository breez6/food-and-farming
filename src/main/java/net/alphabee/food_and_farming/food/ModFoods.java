package net.alphabee.food_and_farming.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build();
    public static final FoodProperties ONION = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build();

    public static final Consumable STRAWBERRY_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).build();
    public static final Consumable TOMATO_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).build();
                                                                                                                    //20 ticks = 1 second
    public static final Consumable ONION_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 10 * 20, 255), 0.30f))
            .build();


}