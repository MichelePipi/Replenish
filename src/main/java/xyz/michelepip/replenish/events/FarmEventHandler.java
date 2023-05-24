package xyz.michelepip.replenish.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.Inventory;

public class FarmEventHandler implements Listener {


    /**
     * Handles block break events and replenishes crops
     * after farming
     * @param event
     */
    @EventHandler
    public void farmHandler(BlockBreakEvent event) {
        Player player = event.getPlayer();
        Material brokenBlock = event.getBlock().getType();
        player.sendMessage("You just broke a: " + ChatColor.BOLD + brokenBlock);
        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 0);
        Inventory inv = player.getInventory();

        switch (brokenBlock.name()) {
            case "CARROTS":
            case "POTATOES":
            case "WHEAT":
            case "BEETROOTS":
            case "NETHER_WART":
            case "SWEET_BERRY_BUSH":
            default:
                return;
        }
    }
}
