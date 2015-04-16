package me.elmoshlelmo.hub.newfeatures;

import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by elmoshlelmo on 16/04/2015.
 * This code is free to use by must not be copied.
 * Thanks.
 */
public class JoinEvent extends Listener{

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        CraftPlayer p = (CraftPlayer)e.getPlayer();
        if (p.getHandle().playerConnection.networkManager. {

        }
    }

}
