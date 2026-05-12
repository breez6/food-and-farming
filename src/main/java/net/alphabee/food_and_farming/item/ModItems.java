package net.alphabee.food_and_farming.item;


import net.alphabee.food_and_farming.FoodAndFarming;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.alphabee.food_and_farming.food.ModFoods;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item STRAWBERRY = registerItem("strawberry", properties -> new Item(properties
            .food(ModFoods.STRAWBERRY, ModFoods.STRAWBERRY_CONSUMABLE)));
    public static final Item TOMATO = registerItem("tomato", properties -> new Item(properties
            .food(ModFoods.TOMATO, ModFoods.TOMATO_CONSUMABLE)));
    public static final Item ONION = registerItem("onion", properties -> new Item(properties
            .food(ModFoods.ONION, ModFoods.ONION_CONSUMABLE)));


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(FoodAndFarming.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FoodAndFarming.MOD_ID, name)))));
    }

    public static void registerModItems() {
        FoodAndFarming.LOGGER.info("Registering Mod Items for " + FoodAndFarming.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(STRAWBERRY);
            output.accept(TOMATO);
            output.accept(ONION);
        });
    }
}