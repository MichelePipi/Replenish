package xyz.michelepip.replenish;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.michelepip.replenish.events.FarmEventHandler;

import java.util.logging.Level;

public final class Replenish extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().log(Level.INFO, "Replenish successfully loaded");

        /*
          Register Events
         */

        getServer()
                .getPluginManager()
                .registerEvents(new FarmEventHandler(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
