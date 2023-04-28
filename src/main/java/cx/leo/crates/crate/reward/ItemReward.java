package cx.leo.crates.crate.reward;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public class ItemReward implements Reward {

    private final List<ItemStack> rewardItems;
    private final double chance;

    public ItemReward(List<ItemStack> rewardItems, double chance) {
        this.rewardItems = rewardItems;
        this.chance = chance;
    }

    @Override
    public double getChance() {
        return chance;
    }

    public List<ItemStack> getItems() {
        return rewardItems;
    }

    @Override
    public void give(Player player) {

        Map<Integer, ItemStack> leftOvers = player.getInventory().addItem(getItems().toArray(new ItemStack[0]));

        if (!leftOvers.isEmpty()) {
            for (ItemStack item : leftOvers.values()) {
                player.getWorld().dropItemNaturally(player.getLocation(), item);
            }
        }

    }

}
