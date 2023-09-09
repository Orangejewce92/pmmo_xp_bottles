
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pmmoxpbottles.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.pmmoxpbottles.item.WoodcuttingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.WoodCuttingBottleItem;
import net.mcreator.pmmoxpbottles.item.TamingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.TamingbottleItem;
import net.mcreator.pmmoxpbottles.item.SwimmingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.SwimmingbottleItem;
import net.mcreator.pmmoxpbottles.item.SmithingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.SmithingbottleItem;
import net.mcreator.pmmoxpbottles.item.SlayerepicbottleItem;
import net.mcreator.pmmoxpbottles.item.SlayerbottleItem;
import net.mcreator.pmmoxpbottles.item.SailingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.SailingbottleItem;
import net.mcreator.pmmoxpbottles.item.MiningepicbottleItem;
import net.mcreator.pmmoxpbottles.item.MiningbottleItem;
import net.mcreator.pmmoxpbottles.item.MagicepicbottleItem;
import net.mcreator.pmmoxpbottles.item.MagicbottleItem;
import net.mcreator.pmmoxpbottles.item.HunterepicbottleItem;
import net.mcreator.pmmoxpbottles.item.HunterbottleItem;
import net.mcreator.pmmoxpbottles.item.GunslingingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.GunslingingbottleItem;
import net.mcreator.pmmoxpbottles.item.FishingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.FishingbottleItem;
import net.mcreator.pmmoxpbottles.item.FarmingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.FarmingItem;
import net.mcreator.pmmoxpbottles.item.ExcavationepicbottleItem;
import net.mcreator.pmmoxpbottles.item.ExcavationbottleItem;
import net.mcreator.pmmoxpbottles.item.EngineeringepicbottleItem;
import net.mcreator.pmmoxpbottles.item.EngineeringbottleItem;
import net.mcreator.pmmoxpbottles.item.EnduranceepicbottleItem;
import net.mcreator.pmmoxpbottles.item.EndurancebottleItem;
import net.mcreator.pmmoxpbottles.item.CraftingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.CraftingbottleItem;
import net.mcreator.pmmoxpbottles.item.CookingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.CookingbottleItem;
import net.mcreator.pmmoxpbottles.item.CombatepicbottleItem;
import net.mcreator.pmmoxpbottles.item.CombatbottleItem;
import net.mcreator.pmmoxpbottles.item.BuildingepicbottleItem;
import net.mcreator.pmmoxpbottles.item.BuildingItem;
import net.mcreator.pmmoxpbottles.item.ArcheryepicbottleItem;
import net.mcreator.pmmoxpbottles.item.ArcherybottleItem;
import net.mcreator.pmmoxpbottles.item.AlchemyepicbottleItem;
import net.mcreator.pmmoxpbottles.item.AlchemybottleItem;
import net.mcreator.pmmoxpbottles.item.AgilityepicbottleItem;
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
	public static final RegistryObject<Item> WOODCUTTINGEPICBOTTLE = REGISTRY.register("woodcuttingepicbottle", () -> new WoodcuttingepicbottleItem());
	public static final RegistryObject<Item> MININGEPICBOTTLE = REGISTRY.register("miningepicbottle", () -> new MiningepicbottleItem());
	public static final RegistryObject<Item> BUILDINGEPICBOTTLE = REGISTRY.register("buildingepicbottle", () -> new BuildingepicbottleItem());
	public static final RegistryObject<Item> EXCAVATIONEPICBOTTLE = REGISTRY.register("excavationepicbottle", () -> new ExcavationepicbottleItem());
	public static final RegistryObject<Item> FARMINGEPICBOTTLE = REGISTRY.register("farmingepicbottle", () -> new FarmingepicbottleItem());
	public static final RegistryObject<Item> AGILITYEPICBOTTLE = REGISTRY.register("agilityepicbottle", () -> new AgilityepicbottleItem());
	public static final RegistryObject<Item> ENDURANCEEPICBOTTLE = REGISTRY.register("enduranceepicbottle", () -> new EnduranceepicbottleItem());
	public static final RegistryObject<Item> COMBATEPICBOTTLE = REGISTRY.register("combatepicbottle", () -> new CombatepicbottleItem());
	public static final RegistryObject<Item> GUNSLINGINGEPICBOTTLE = REGISTRY.register("gunslingingepicbottle", () -> new GunslingingepicbottleItem());
	public static final RegistryObject<Item> ARCHERYEPICBOTTLE = REGISTRY.register("archeryepicbottle", () -> new ArcheryepicbottleItem());
	public static final RegistryObject<Item> SMITHINGEPICBOTTLE = REGISTRY.register("smithingepicbottle", () -> new SmithingepicbottleItem());
	public static final RegistryObject<Item> CRAFTINGEPICBOTTLE = REGISTRY.register("craftingepicbottle", () -> new CraftingepicbottleItem());
	public static final RegistryObject<Item> MAGICEPICBOTTLE = REGISTRY.register("magicepicbottle", () -> new MagicepicbottleItem());
	public static final RegistryObject<Item> SLAYEREPICBOTTLE = REGISTRY.register("slayerepicbottle", () -> new SlayerepicbottleItem());
	public static final RegistryObject<Item> HUNTEREPICBOTTLE = REGISTRY.register("hunterepicbottle", () -> new HunterepicbottleItem());
	public static final RegistryObject<Item> TAMINGEPICBOTTLE = REGISTRY.register("tamingepicbottle", () -> new TamingepicbottleItem());
	public static final RegistryObject<Item> COOKINGEPICBOTTLE = REGISTRY.register("cookingepicbottle", () -> new CookingepicbottleItem());
	public static final RegistryObject<Item> ALCHEMYEPICBOTTLE = REGISTRY.register("alchemyepicbottle", () -> new AlchemyepicbottleItem());
	public static final RegistryObject<Item> ENGINEERINGEPICBOTTLE = REGISTRY.register("engineeringepicbottle", () -> new EngineeringepicbottleItem());
	public static final RegistryObject<Item> FISHINGBOTTLE = REGISTRY.register("fishingbottle", () -> new FishingbottleItem());
	public static final RegistryObject<Item> FISHINGEPICBOTTLE = REGISTRY.register("fishingepicbottle", () -> new FishingepicbottleItem());
	public static final RegistryObject<Item> SAILINGBOTTLE = REGISTRY.register("sailingbottle", () -> new SailingbottleItem());
	public static final RegistryObject<Item> SAILINGEPICBOTTLE = REGISTRY.register("sailingepicbottle", () -> new SailingepicbottleItem());
	public static final RegistryObject<Item> SWIMMINGBOTTLE = REGISTRY.register("swimmingbottle", () -> new SwimmingbottleItem());
	public static final RegistryObject<Item> SWIMMINGEPICBOTTLE = REGISTRY.register("swimmingepicbottle", () -> new SwimmingepicbottleItem());
}
