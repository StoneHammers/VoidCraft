package com.StoneHammers.voidcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.StoneHammers.voidcraft.items.ItemBase;
import com.StoneHammers.voidcraft.items.armor.ArmorBase;
import com.StoneHammers.voidcraft.items.food.FoodBase;
import com.StoneHammers.voidcraft.items.food.FoodEffectBase;
import com.StoneHammers.voidcraft.items.tools.ToolSpade;
import com.StoneHammers.voidcraft.items.tools.ToolSword;
import com.StoneHammers.voidcraft.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	 public static final ToolMaterial MATERIAL_CRYSTAL = EnumHelper.addToolMaterial("material_crystal", 3, 59, 4.0F, 3.0F, 22);
	 public static final ToolMaterial MATERIAL_CLAY = EnumHelper.addToolMaterial("material_clay", 1, 350, 4.0F, 1, 5);
	 
	 public static final ArmorMaterial ARMOR_MATERIAL_CLAY = EnumHelper.addArmorMaterial("armor_material_clay", Reference.MOD_ID + ":clay", 5,
	 		new int[]{1, 3, 5, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	 
	//items
	public static final Item CRYSTAL_FRAGMENT = new ItemBase("crystal_fragment");
	public static final Item MINT_LEAVES = new ItemBase("mint_leaves");
	public static final Item UNFIRED_CLAY_PLATE = new ItemBase("unfired_clay_plate");
	public static final Item FIRED_CLAY_PLATE = new ItemBase("fired_clay_plate");
	
	//tools
	public static final ItemSword CRYSTAL_SWORD = new ToolSword("crystal_sword", MATERIAL_CRYSTAL);
	public static final ItemSpade CERAMIC_SHOVEL = new ToolSpade("ceramic_shovel", MATERIAL_CLAY);
	
	//Armor
	public static final Item CERAMIC_HELMET = new ArmorBase("ceramic_helmet", ARMOR_MATERIAL_CLAY,1, EntityEquipmentSlot.HEAD);
	public static final Item CERAMIC_CHESTPLATE = new ArmorBase("ceramic_chestplate", ARMOR_MATERIAL_CLAY,1, EntityEquipmentSlot.CHEST);
	public static final Item CERAMIC_LEGGINGS = new ArmorBase("ceramic_leggings", ARMOR_MATERIAL_CLAY,2, EntityEquipmentSlot.LEGS);
	public static final Item CERAMIC_BOOTS = new ArmorBase("ceramic_boots", ARMOR_MATERIAL_CLAY, 1, EntityEquipmentSlot.FEET);
	
	//Food
	//public static final Item SLURM_BALL = new FoodBase("slurm_ball", 1, 1.4f, false);
	public static final Item SLURM_BALL = new FoodEffectBase("slurm_ball", 1, 1.4f, false, new PotionEffect(MobEffects.SPEED, (60 * 20), 0, false, false));
	
}
