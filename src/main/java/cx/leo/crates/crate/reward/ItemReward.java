package cx.leo.crates.crate.reward;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemReward implements Reward {

    private final ItemStack rewardItem;
    private final double chance;

    public ItemReward(ItemStack rewardItem, double chance) {
        this.rewardItem = rewardItem;
        this.chance = chance;
    }

    @Override
    public double getChance() {
        return chance;
    }

    @Override
    public void give(Player player) {
        player.getInventory().addItem(rewardItem);
    }

}
