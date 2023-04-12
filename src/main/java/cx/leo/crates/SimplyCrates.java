package cx.leo.crates;

import org.bukkit.plugin.java.JavaPlugin;

public class SimplyCrates extends JavaPlugin {

    private CrateManager crateManager;

    @Override
    public void onEnable() {
        getLogger().info("Plugin Started.");
        this.crateManager = new CrateManager(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin Disabled.");
    }

    public CrateManager getCrateManager() {
        return crateManager;
    }
}
