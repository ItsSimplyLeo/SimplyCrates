package cx.leo.crates.crate.reward;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.regex.Pattern;

public class CommandReward implements Reward {

    private static final Pattern PLAYER_PATTERN = Pattern.compile("%player%");

    private final List<String> commands;
    private final double chance;

    public CommandReward(List<String> commands, double chance) {
        this.commands = commands;
        this.chance = chance;
    }

    @Override
    public double getChance() {
        return chance;
    }

    public List<String> getCommands() {
        return commands;
    }

    @Override
    public void give(Player player) {

        for (String command : getCommands()) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), PLAYER_PATTERN.matcher(command).replaceAll(player.getName()));
        }

    }

}
