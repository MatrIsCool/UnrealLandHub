package me.elmoshlelmo.hub.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import me.elmoshlelmo.hub.Hub;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

/**
 * Created by elmoshlelmo on 07/04/2015.
 * This code is free to use by must not be copied.
 * Thanks.
 */

public class ConfigManager {

    Hub plugin;
    private String name;
    private File file;
    private FileConfiguration fileConfig;

    public ConfigManager(String name) {
        this.name = name;
    }

    public FileConfiguration getConfig() {
        if (this.fileConfig == null) {
            reloadConfig();
        }
        return this.fileConfig;
    }

    public void reloadConfig() {
        if (this.fileConfig == null)
            this.file = new File(plugin.getDataFolder(),
                    this.name + ".yml");
        this.fileConfig = YamlConfiguration.loadConfiguration(this.file);

        InputStream defConfigStream = plugin
                .getResource(this.name + ".yml");
        if (defConfigStream != null) {
            YamlConfiguration defConfig =
                    YamlConfiguration.loadConfiguration(this.file);
            this.fileConfig.setDefaults(defConfig);
        }
    }

    public void saveConfig() {
        if ((this.fileConfig == null) || (this.file == null))
            return;
        try {
            getConfig().save(this.file);
        } catch (IOException ex) {
            System.out.println("Could not save config to " + this.file);
        }
    }

    public void saveDefaultConfig() {
        if (this.file == null)
            this.file = new File(plugin.getDataFolder(),
                    this.name + ".yml");
        if (!this.file.exists())
            plugin.saveResource(this.name + ".yml", false);
    }
}