package net.alphabee.food_and_farming.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.alphabee.food_and_farming.FoodAndFarming;
import net.alphabee.food_and_farming.block.ModBlocks;
import net.alphabee.food_and_farming.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab FOOD_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(FoodAndFarming.MOD_ID, "fluorite_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STRAWBERRY))
                    .title(Component.translatable("creativemodetab.tutorialmod.fluorite_items"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModItems.STRAWBERRY);
                        output.accept(ModItems.TOMATO);
                        output.accept(ModItems.ONION);
                        output.accept(ModItems.HARD_BOILED_EGG);
                        output.accept(ModItems.SCRAMBLED_EGGS);
                        output.accept(ModItems.FRIED_EGG);
                        output.accept(ModItems.BOILED_EGG);
                        output.accept(ModItems.EGG_SHELL);

                    }).build());

    public static final CreativeModeTab BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(FoodAndFarming.MOD_ID, "fluorite_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.FLUORITE_BLOCK))
                    .title(Component.translatable("creativemodetab.tutorialmod.fluorite_blocks"))
                    .displayItems((parameters, output) -> {

                        //for adding blocks


                    }).build());


    public static void registerModCreativeModeTabs() {
        FoodAndFarming.LOGGER.info("Registering Creative Mode Tabs for " + FoodAndFarming.MOD_ID);
    }
}
