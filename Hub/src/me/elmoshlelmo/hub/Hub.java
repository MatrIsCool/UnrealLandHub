package me.elmoshlelmo.hub;

import me.elmoshlelmo.hub.config.ConfigManager;
import me.elmoshlelmo.hub.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by elmoshlelmo on 05/04/2015.
 * This code is free to use by must not be copied.
 * Thanks.
 */
public class Hub extends JavaPlugin {


    public static ConfigManager messageManager = new ConfigManager("messages");
    public static ConfigManager config = new ConfigManager("config");
    public static ConfigManager items = new ConfigManager("items");
    public static ConfigManager book = new ConfigManager("book");

    public static ItemManager itemManager = new ItemManager();


    public void onEnable() {
        Hub plugin = this;

    }

    public void onDisable() {

    }

}
