package com.StoneHammers.voidcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.StoneHammers.voidcraft.blocks.AverageStone;
import com.StoneHammers.voidcraft.blocks.BlockBase;
import com.StoneHammers.voidcraft.blocks.Dolomite;
import com.StoneHammers.voidcraft.blocks.VoidOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block DOLOMITE_RAW_BLOCK = new Dolomite("dolomite_raw_block", Material.IRON);
	public static final Block DOLOMITE_BRICK_BLOCK = new AverageStone("dolomite_brick_block", Material.IRON);
	public static final Block DOLOMITE_COBBLE_BLOCK = new AverageStone("dolomite_cobble_block", Material.IRON);
	public static final Block VOID_ORE = new VoidOre("void_ore", Material.ROCK);
	
}
