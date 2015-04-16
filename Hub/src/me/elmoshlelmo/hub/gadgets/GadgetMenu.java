package me.elmoshlelmo.hub.gadgets;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by elmoshlelmo on 16/04/2015.
 * This code is free to use by must not be copied.
 * Thanks.
 */
public class GadgetMenu {

    private Player p;
    private Inventory inv;
    private String invName;
    private int invSize;

    public GadgetMenu(String invName, int invSize, Player p) {
        this.invName = invName;
        this.invSize = invSize;

        createInventory();

        p.openInventory(inv);
    }

    private void createInventory() {
        inv = Bukkit.getServer().createInventory(null, invSize, invName);
        inv.addItem()
    }
}
