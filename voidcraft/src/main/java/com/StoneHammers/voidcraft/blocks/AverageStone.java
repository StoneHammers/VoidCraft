package com.StoneHammers.voidcraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AverageStone extends BlockBase
{

public AverageStone(String name, Material material)
{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
		//setLightLevel(0.0F);
		// setLightOpacity(1);
		// setBlockUnbreakable();
	}

}