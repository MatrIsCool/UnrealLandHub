package me.elmoshlelmo.hub.messages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * Created by elmoshlelmo on 15/04/2015.
 * This code is free to use by must not be copied.
 * Thanks.
 */

public class MessageManager {

    Plugin p;

    public MessageManager(Plugin p) {
        this.p = p;
    }

    public void sendInfoMessage(Player p, String msg) {
        p.sendMessage(ChatColor.BLUE + "Hub> " + ChatColor.RESET + msg);
    }

    public void sendErrorMessage(Player p, String msg) {
        p.sendMessage(ChatColor.BLUE + "Error> " + ChatColor.RESET + msg);
    }

    public void broadcast(String msg) {
        for (Player p : Bukkit.getServer().getOnlinePlayers()) {
            p.sendMessage(ChatColor.BLUE + "Broadcast> " + ChatColor.RESET + msg);
        }
    }

    public void sendMessage(Player p, String msg) {
        p.sendMessage(msg);
    }
}
