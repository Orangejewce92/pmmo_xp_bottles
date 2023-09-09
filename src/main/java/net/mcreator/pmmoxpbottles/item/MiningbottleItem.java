
package net.mcreator.pmmoxpbottles.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.pmmoxpbottles.init.PmmoXpBottlesModTabs;

public class MiningbottleItem extends Item {
	public MiningbottleItem() {
		super(new Item.Properties().tab(PmmoXpBottlesModTabs.TAB_PMMOXPBOTTLES).stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}
}
