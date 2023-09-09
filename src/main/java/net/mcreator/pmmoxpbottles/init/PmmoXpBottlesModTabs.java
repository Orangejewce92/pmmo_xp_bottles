
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pmmoxpbottles.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.pmmoxpbottles.PmmoXpBottlesMod;

public class PmmoXpBottlesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PmmoXpBottlesMod.MODID);
	public static final RegistryObject<CreativeModeTab> PMMOXPBOTTLES = REGISTRY.register("pmmoxpbottles",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pmmo_xp_bottles.pmmoxpbottles")).icon(() -> new ItemStack(PmmoXpBottlesModItems.ARCHERYBOTTLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PmmoXpBottlesModItems.WOOD_CUTTING_BOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.MININGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.BUILDINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.EXCAVATIONBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.FARMINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.AGILITYBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.ENDURANCEBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.COMBATBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.GUNSLINGINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.ARCHERYBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.SMITHINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.CRAFTINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.MAGICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.SLAYERBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.HUNTERBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.TAMINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.COOKINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.ALCHEMYBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.ENGINEERINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.WOODCUTTINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.MININGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.BUILDINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.EXCAVATIONEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.FARMINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.AGILITYEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.ENDURANCEEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.COMBATEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.GUNSLINGINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.ARCHERYEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.SMITHINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.CRAFTINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.MAGICEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.SLAYEREPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.HUNTEREPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.TAMINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.COOKINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.ALCHEMYEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.ENGINEERINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.FISHINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.FISHINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.SAILINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.SAILINGEPICBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.SWIMMINGBOTTLE.get());
				tabData.accept(PmmoXpBottlesModItems.SWIMMINGEPICBOTTLE.get());
			})

					.build());
}
