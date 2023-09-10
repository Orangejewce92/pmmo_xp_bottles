
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pmmoxpbottles.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.pmmoxpbottles.item.WoodCuttingBottleItem;
import net.mcreator.pmmoxpbottles.item.TamingbottleItem;
import net.mcreator.pmmoxpbottles.item.SwimmingbottleItem;
import net.mcreator.pmmoxpbottles.item.SmithingbottleItem;
import net.mcreator.pmmoxpbottles.item.SlayerbottleItem;
import net.mcreator.pmmoxpbottles.item.SailingbottleItem;
import net.mcreator.pmmoxpbottles.item.MiningbottleItem;
import net.mcreator.pmmoxpbottles.item.MagicbottleItem;
import net.mcreator.pmmoxpbottles.item.HunterbottleItem;
import net.mcreator.pmmoxpbottles.item.GunslingingbottleItem;
import net.mcreator.pmmoxpbottles.item.FishingbottleItem;
import net.mcreator.pmmoxpbottles.item.FarmingItem;
import net.mcreator.pmmoxpbottles.item.ExcavationbottleItem;
import net.mcreator.pmmoxpbottles.item.EngineeringbottleItem;
import net.mcreator.pmmoxpbottles.item.EndurancebottleItem;
import net.mcreator.pmmoxpbottles.item.CraftingbottleItem;
import net.mcreator.pmmoxpbottles.item.CookingbottleItem;
import net.mcreator.pmmoxpbottles.item.CombatbottleItem;
import net.mcreator.pmmoxpbottles.item.BuildingItem;
import net.mcreator.pmmoxpbottles.item.ArcherybottleItem;
import net.mcreator.pmmoxpbottles.item.AlchemybottleItem;
import net.mcreator.pmmoxpbottles.item.AgilitybottleItem;
import net.mcreator.pmmoxpbottles.PmmoXpBottlesMod;

public class PmmoXpBottlesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PmmoXpBottlesMod.MODID);
	public static final RegistryObject<Item> WOOD_CUTTING_BOTTLE = REGISTRY.register("wood_cutting_bottle", () -> new WoodCuttingBottleItem());
	public static final RegistryObject<Item> MININGBOTTLE = REGISTRY.register("miningbottle", () -> new MiningbottleItem());
	public static final RegistryObject<Item> BUILDINGBOTTLE = REGISTRY.register("buildingbottle", () -> new BuildingItem());
	public static final RegistryObject<Item> EXCAVATIONBOTTLE = REGISTRY.register("excavationbottle", () -> new ExcavationbottleItem());
	public static final RegistryObject<Item> FARMINGBOTTLE = REGISTRY.register("farmingbottle", () -> new FarmingItem());
	public static final RegistryObject<Item> AGILITYBOTTLE = REGISTRY.register("agilitybottle", () -> new AgilitybottleItem());
	public static final RegistryObject<Item> ENDURANCEBOTTLE = REGISTRY.register("endurancebottle", () -> new EndurancebottleItem());
	public static final RegistryObject<Item> COMBATBOTTLE = REGISTRY.register("combatbottle", () -> new CombatbottleItem());
	public static final RegistryObject<Item> GUNSLINGINGBOTTLE = REGISTRY.register("gunslingingbottle", () -> new GunslingingbottleItem());
	public static final RegistryObject<Item> ARCHERYBOTTLE = REGISTRY.register("archerybottle", () -> new ArcherybottleItem());
	public static final RegistryObject<Item> SMITHINGBOTTLE = REGISTRY.register("smithingbottle", () -> new SmithingbottleItem());
	public static final RegistryObject<Item> CRAFTINGBOTTLE = REGISTRY.register("craftingbottle", () -> new CraftingbottleItem());
	public static final RegistryObject<Item> MAGICBOTTLE = REGISTRY.register("magicbottle", () -> new MagicbottleItem());
	public static final RegistryObject<Item> SLAYERBOTTLE = REGISTRY.register("slayerbottle", () -> new SlayerbottleItem());
	public static final RegistryObject<Item> HUNTERBOTTLE = REGISTRY.register("hunterbottle", () -> new HunterbottleItem());
	public static final RegistryObject<Item> TAMINGBOTTLE = REGISTRY.register("tamingbottle", () -> new TamingbottleItem());
	public static final RegistryObject<Item> COOKINGBOTTLE = REGISTRY.register("cookingbottle", () -> new CookingbottleItem());
	public static final RegistryObject<Item> ALCHEMYBOTTLE = REGISTRY.register("alchemybottle", () -> new AlchemybottleItem());
	public static final RegistryObject<Item> ENGINEERINGBOTTLE = REGISTRY.register("engineeringbottle", () -> new EngineeringbottleItem());
	public static final RegistryObject<Item> FISHINGBOTTLE = REGISTRY.register("fishingbottle", () -> new FishingbottleItem());
	public static final RegistryObject<Item> SAILINGBOTTLE = REGISTRY.register("sailingbottle", () -> new SailingbottleItem());
	public static final RegistryObject<Item> SWIMMINGBOTTLE = REGISTRY.register("swimmingbottle", () -> new SwimmingbottleItem());
}
