package com.StoneHammers.voidcraft.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{

	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.DOLOMITE_COBBLE_BLOCK, new ItemStack(ModBlocks.DOLOMITE_RAW_BLOCK, 1),  0.5f);
		GameRegistry.addSmelting(ModItems.UNFIRED_CLAY_PLATE, new ItemStack(ModItems.FIRED_CLAY_PLATE, 1),  0.5f);	
	}
}
