package me.elmoshlelmo.hub.items;

import me.elmoshlelmo.hub.Hub;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by elmoshlelmo on 15/04/2015.
 * This code is free to use by must not be copied.
 * Thanks.
 */
public class ItemManager {

    Hub plugin;

    private ItemStack serverSelector;
    private ItemStack pvpSword;
    private ItemStack pvpBow;
    private ItemStack air;
    private ItemStack welcomeBook;
    private ItemStack gadgets;
    private ItemStack playerToggler;

    private ArrayList<ItemStack> items;

    public ItemManager() {
        setupItems();
        addItemsToList();
    }

    public ArrayList<ItemStack> getItems() {
        return items;
    }

    private void setupItems() {
        //Welcome Book
        welcomeBook = new ItemStack(Material.BOOK, 1);
        BookMeta bm = (BookMeta) welcomeBook.getItemMeta();
        bm.setDisplayName(Hub.book.getConfig().getString("book_name"));
        bm.setAuthor(Hub.book.getConfig().getString("book_author"));

        List bookPages = new ArrayList();
        List configPages = new ArrayList();

        if (Hub.book.getConfig().getStringList("pages") != null)
            configPages = Hub.book.getConfig().getStringList("pages");

        for (Object page : configPages) {
            bookPages.add(page.toString());
        }
        bm.setPages(bookPages);
        welcomeBook.setItemMeta(bm);

        //Server Selector
        serverSelector = new ItemStack(Material.COMPASS, 1);
        ItemMeta meta = serverSelector.getItemMeta();
        String name = Hub.items.getConfig().getString("server_selector_name");
        meta.setDisplayName(ChatColor.GREEN + name);
        meta.setLore(Hub.items.getConfig().getStringList("server_selector_lore"));
        serverSelector.setItemMeta(meta);

        //PvP Sword
        pvpSword = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta1 = pvpSword.getItemMeta();
        meta1.setDisplayName(Hub.items.getConfig().getString("pvp_sword_name"));
        meta1.setLore(Hub.items.getConfig().getStringList("pvp_sword_lore"));
        pvpSword.setItemMeta(meta1);

        //PvP Bow
        pvpBow = new ItemStack(Material.BOW, 1);
        ItemMeta meta2 = pvpBow.getItemMeta();
        meta2.setDisplayName(Hub.items.getConfig().getString("pvp_bow_name"));
        meta2.setLore(Hub.items.getConfig().getStringList("pvp_bow_lore"));
        pvpBow.setItemMeta(meta2);

        //

    }

    private void addItemsToList() {
        items.add(Hub.items.getConfig().getInt("server_selector_slot"), serverSelector);
        items.add(Hub.items.getConfig().getInt("pvp_sword_slot"), serverSelector);
        items.add(Hub.items.getConfig().getInt("pvp_bow_slot"), serverSelector);
        items.add(air);
        items.add(air);
        items.add(air);
        items.add(Hub.book.getConfig().getInt("book_slot"), welcomeBook);
        items.add(Hub.items.getConfig().getInt("gadgets_slot"), serverSelector);
        items.add(Hub.items.getConfig().getInt("player_toggler_slot"), playerToggler);
    }
}
