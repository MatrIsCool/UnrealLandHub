package me.elmoshlelmo.hub.items;

import me.elmoshlelmo.hub.Hub;
import net.minecraft.server.v1_8_R1.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Created by elmoshlelmo on 15/04/2015.
 * This code is free to use by must not be copied.
 * Thanks.
 */
public class JoinEvent implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player p = event.getPlayer();
        event.getPlayer().getInventory().clear();

        for (ItemStack i : Hub.itemManager.getItems()) {
            p.getInventory().addItem(i);
        }

    }
}
