
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pmmoxpbottles.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PmmoXpBottlesModTabs {
	public static CreativeModeTab TAB_PMMOXPBOTTLES;

	public static void load() {
		TAB_PMMOXPBOTTLES = new CreativeModeTab("tabpmmoxpbottles") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PmmoXpBottlesModItems.ARCHERYBOTTLE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
