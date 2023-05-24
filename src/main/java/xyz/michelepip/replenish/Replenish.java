package xyz.michelepip.replenish;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Replenish extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().log(Level.INFO, "Replenish successfully loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
