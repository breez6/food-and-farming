package net.alphabee.food_and_farming.datagen;

import net.alphabee.food_and_farming.block.ModBlocks;
import net.alphabee.food_and_farming.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.model.Model;

import static net.minecraft.client.data.models.model.ModelTemplates.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        //blockModelGenerators.createCrossBlock(ModBlocks.SALT_ROCK, CROSS);
        //figure code out
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.STRAWBERRY, FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOMATO, FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ONION, FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HARD_BOILED_EGG, FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SCRAMBLED_EGGS, FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FRIED_EGG , FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BOILED_EGG , FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EGG_SHELL , FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SALT , FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BLACK_PEPPER , FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.UNRIPENED_PEPPERCORN , FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DRIED_PEPPERCORN , FLAT_ITEM);
         //this supposed to be block
    }
}
