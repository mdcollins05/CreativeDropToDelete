/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blockmovers.plugins.creativedroptodelete;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

/**
 *
 * @author MattC
 */
public class Listeners implements Listener {

    CreativeDropToDelete plugin = null;

    public Listeners(CreativeDropToDelete plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        Player player = event.getPlayer();

        if (player.getGameMode() == GameMode.SURVIVAL || player.hasPermission("cdtd.exempt")) {
            return;
        }

        event.getItemDrop().remove();
    }
}
