package cx.leo.crates.crate.reward;

import org.bukkit.entity.Player;

public interface Reward {

    double getChance();

    void give(Player player);

}
