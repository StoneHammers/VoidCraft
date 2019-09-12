package com.StoneHammers.voidcraft.blocks;

import java.util.Random;

import com.StoneHammers.voidcraft.Main;
import com.StoneHammers.voidcraft.init.ModBlocks;
import com.StoneHammers.voidcraft.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class Dolomite extends BlockBase 
{
public Dolomite(String name, Material material) {
	super(name, material);
	setSoundType(SoundType.STONE);
	setHardness(5.0F);
	setResistance(15.0F);
	setHarvestLevel("pickaxe", 2);
	}

@Override
public Item getItemDropped(IBlockState state, Random rand, int fortune){
	return Item.getItemFromBlock(ModBlocks.DOLOMITE_COBBLE_BLOCK);
	
}


	
}


