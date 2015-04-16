package me.elmoshlelmo.hub.chatfilter;

import me.elmoshlelmo.hub.Hub;
import me.elmoshlelmo.hub.messages.MessageManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * Created by elmoshlelmo on 06/04/2015.
 * This code is free to use by must not be copied.
 * Thanks.
 */
public class ChatEvent implements Listener {

    Hub plugin;

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        MessageManager manager = new MessageManager(plugin);



    }
}
