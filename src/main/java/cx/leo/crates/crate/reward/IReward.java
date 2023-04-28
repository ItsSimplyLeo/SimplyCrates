package cx.leo.crates.crate.reward;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface IReward {

    double getChance();

    void give(Player player);

    List<String> getCommands();

    List<ItemStack> getItems();

}
