package cx.leo.crates.crate.reward;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Reward implements IReward {

    private static final Pattern PLAYER_PATTERN = Pattern.compile("%player%");

    private final List<String> commands;
    private final List<ItemStack> items;
    private final double chance;

    public Reward(List<String> commands, List<ItemStack> items, double chance) {
        this.commands = commands;
        this.items = items;
        this.chance = chance;
    }

    @Override
    public double getChance() {
        return chance;
    }

    @Override
    public List<ItemStack> getItems() {
        return items;
    }

    @Override
    public List<String> getCommands() {
        return commands;
    }

    @Override
    public void give(Player player) {

        for (String command : getCommands()) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), PLAYER_PATTERN.matcher(command).replaceAll(player.getName()));
        }

        Map<Integer, ItemStack> leftOvers = player.getInventory().addItem(getItems().toArray(new ItemStack[0]));

        if (!leftOvers.isEmpty()) {
            for (ItemStack item : leftOvers.values()) {
                player.getWorld().dropItemNaturally(player.getLocation(), item);
            }
        }
    }
}
