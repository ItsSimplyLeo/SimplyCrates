package cx.leo.crates.crate.reward;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.regex.Pattern;

public class CommandReward implements Reward {

    private static final Pattern PLAYER_PATTERN = Pattern.compile("%player%");

    private final String command;
    private final double chance;

    public CommandReward(String command, double chance) {
        this.command = command;
        this.chance = chance;
    }

    @Override
    public double getChance() {
        return chance;
    }

    public String getCommand() {
        return command;
    }

    @Override
    public void give(Player player) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), PLAYER_PATTERN.matcher(getCommand()).replaceAll(player.getName()));
    }

}
