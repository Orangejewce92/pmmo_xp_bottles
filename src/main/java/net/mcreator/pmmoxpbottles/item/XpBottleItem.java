
package net.mcreator.pmmoxpbottles.item;

import harmonised.pmmo.api.APIUtils;
import net.mcreator.pmmoxpbottles.init.PmmoXpBottlesModItems;
import net.mcreator.pmmoxpbottles.init.PmmoXpBottlesModTabs;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class XpBottleItem extends Item {
	private static final String EMPTY = "empty";
	private static final String AMOUNT = "amount";
	private final String skill;

	public XpBottleItem(String skill) {
		super(new Properties()
				.tab(PmmoXpBottlesModTabs.TAB_PMMOXPBOTTLES)
				.stacksTo(64)
				.rarity(Rarity.RARE)
				.food((new FoodProperties.Builder())
						.nutrition(0)
						.saturationMod(0f)
						.alwaysEat()
						.build()));
		this.skill = skill;
	}

	@Override
	public ItemStack getDefaultInstance() {
		ItemStack instance = new ItemStack(this);
		instance.getOrCreateTag().putBoolean(EMPTY, false);
		instance.getTag().putLong(AMOUNT, 1500);
		return instance;
	}

	@Override
	public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> list) {
		if (tab == PmmoXpBottlesModTabs.TAB_PMMOXPBOTTLES) {
			list.removeIf(stack -> stack.getOrCreateTag().getLong(AMOUNT) == 0l);
			list.add(this.getDefaultInstance());
		}
	}

	@Override
	public Component getName(ItemStack p_41458_) {
		boolean isEmpty = p_41458_.getOrCreateTag().getBoolean(EMPTY);
		MutableComponent start = isEmpty ? Component.translatable("pmmo_xp_bottles.empty") : Component.empty();
		MutableComponent skill = Component.translatable("pmmo."+ this.skill);
		return start.append(skill).append(" ").append(Component.translatable("pmmo_xp_bottles.xp_bottle"));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level p_41422_, List<Component> list, TooltipFlag p_41424_) {
		list.add(Component.translatable("pmmo_xp_bottles.volume", stack.getOrCreateTag().getLong(AMOUNT)));
		super.appendHoverText(stack, p_41422_, list, p_41424_);
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {

		if (!(entity instanceof Player))
			return itemstack;

		boolean isEmpty = itemstack.getOrCreateTag().getBoolean(EMPTY);
		long amount = itemstack.getTag().getLong(AMOUNT);
		ItemStack retval = new ItemStack(PmmoXpBottlesModItems.ALL_BOTTLES.get(skill).get());

		if (isEmpty) {
			if (APIUtils.getXp(skill, (Player) entity) < amount) {
				entity.sendSystemMessage(Component.translatable("pmmo_xp_bottles.not_enough", Component.translatable("pmmo."+skill)));
				return itemstack;
			}
			else {
				APIUtils.addXp(skill, (Player) entity, -amount);
				retval.getOrCreateTag().putBoolean(EMPTY, false);
				retval.getTag().putLong(AMOUNT, amount);
			}
		}
		else {
			APIUtils.addXp(skill, (Player) entity, amount);
			retval.getOrCreateTag().putBoolean(EMPTY, true);
			retval.getTag().putLong(AMOUNT, amount);
		}

		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
