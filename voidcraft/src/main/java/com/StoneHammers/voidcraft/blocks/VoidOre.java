package com.StoneHammers.voidcraft.blocks;

import java.util.Random;

import com.StoneHammers.voidcraft.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class VoidOre extends BlockBase 
{
public VoidOre(String name, Material material) {
	super(name, material);
	setSoundType(SoundType.STONE);
	setHardness(5.0F);
	setResistance(15.0F);
	setHarvestLevel("pickaxe", 2);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return ModItems.CRYSTAL_FRAGMENT;
		
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
	}
	
}
