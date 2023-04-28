package cx.leo.crates;

import cx.leo.crates.crate.ICrate;
import org.bukkit.Location;
import org.bukkit.block.Block;

import java.util.*;

public class CrateManager {

    private final SimplyCrates plugin;
    private final Map<Location, ICrate> crates = new HashMap<>();

    public CrateManager(SimplyCrates plugin) {
        this.plugin = plugin;
    }

    public Collection<ICrate> getCrates() {
        return crates.values();
    }

    public boolean isCrateBlock(Block block) {
        return getCrateFromBlock(block) != null;
    }

    public ICrate getCrateFromBlock(Block block) {
        return crates.get(block.getLocation());
    }
}
