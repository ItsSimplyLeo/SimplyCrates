package cx.leo.crates;

import cx.leo.crates.crate.ICrate;
import org.bukkit.block.Block;

import java.util.ArrayList;
import java.util.List;

public class CrateManager {

    private final SimplyCrates plugin;
    private final List<ICrate> crates = new ArrayList<>();

    public CrateManager(SimplyCrates plugin) {
        this.plugin = plugin;
    }

    public List<ICrate> getCrates() {
        return crates;
    }

    public boolean isCrateBlock(Block block) {
        return false;
    }

    public ICrate getCrateFromBlock(Block block) {
        return null;
    }
}
