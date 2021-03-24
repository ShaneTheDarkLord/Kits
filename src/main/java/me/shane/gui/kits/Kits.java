package me.shane.gui.kits;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.clip.placeholderapi.PlaceholderAPI;

import java.util.ArrayList;

public final class Kits extends JavaPlugin implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String bold = ChatColor.BOLD + "";
        String underline = ChatColor.UNDERLINE + "";
        if ((sender instanceof Player)) {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("kits")) {
                ArrayList<String> coallore = new ArrayList<String>();
                ArrayList<String> ironlore = new ArrayList<String>();
                ArrayList<String> goldlore = new ArrayList<String>();
                ArrayList<String> redstonelore = new ArrayList<String>();
                ArrayList<String> diamondlore = new ArrayList<String>();
                ArrayList<String> emeraldlore = new ArrayList<String>();
                ArrayList<String> platlore = new ArrayList<String>();
                String coalcooldown = "%essentials_kit_time_until_available_coal%";
                coalcooldown = PlaceholderAPI.setPlaceholders(p, coalcooldown);
                String coaluse = "%essentials_has_kit_coal%";
                coaluse = PlaceholderAPI.setPlaceholders(p, coaluse);
                String ironcooldown = "%essentials_kit_time_until_available_iron%";
                ironcooldown = PlaceholderAPI.setPlaceholders(p, ironcooldown);
                String ironuse = "%essentials_has_kit_iron%";
                ironuse = PlaceholderAPI.setPlaceholders(p, ironuse);
                String goldcooldown = "%essentials_kit_time_until_available_gold%";
                goldcooldown = PlaceholderAPI.setPlaceholders(p, goldcooldown);
                String golduse = "%essentials_has_kit_gold%";
                golduse = PlaceholderAPI.setPlaceholders(p, golduse);
                String redstonecooldown = "%essentials_kit_time_until_available_redstone%";
                redstonecooldown = PlaceholderAPI.setPlaceholders(p, redstonecooldown);
                String redstoneuse = "%essentials_has_kit_redstone%";
                redstoneuse = PlaceholderAPI.setPlaceholders(p, redstoneuse);
                String diamondcooldown = "%essentials_kit_time_until_available_diamond%";
                diamondcooldown = PlaceholderAPI.setPlaceholders(p, diamondcooldown);
                String diamonduse = "%essentials_has_kit_diamond%";
                diamonduse = PlaceholderAPI.setPlaceholders(p, diamonduse);
                String emeraldcooldown = "%essentials_kit_time_until_available_emerald%";
                emeraldcooldown = PlaceholderAPI.setPlaceholders(p, emeraldcooldown);
                String emeralduse = "%essentials_has_kit_emerald%";
                emeralduse = PlaceholderAPI.setPlaceholders(p, emeralduse);
                String platcooldown = "%essentials_kit_time_until_available_platinum]%";
                platcooldown = PlaceholderAPI.setPlaceholders(p, platcooldown);
                String platuse = "%essentials_has_kit_platinum%";
                platuse = PlaceholderAPI.setPlaceholders(p, platuse);
                /*Setting GUI */
                Inventory inv = Bukkit.createInventory(p, 27,  "Complex Kits");
                ItemStack Coal = new ItemStack(Material.COAL);
                ItemMeta CoalMeta = Coal.getItemMeta();
                ItemStack Iron = new ItemStack(Material.IRON_INGOT);
                ItemMeta IronMeta = Iron.getItemMeta();
                ItemStack Gold = new ItemStack(Material.GOLD_INGOT);
                ItemMeta GoldMeta = Gold.getItemMeta();
                ItemStack Redstone = new ItemStack(Material.REDSTONE);
                ItemMeta RedstoneMeta = Redstone.getItemMeta();
                ItemStack Diamond = new ItemStack(Material.DIAMOND);
                ItemMeta DiamondMeta = Diamond.getItemMeta();
                ItemStack Emerald = new ItemStack(Material.EMERALD);
                ItemMeta EmeraldMeta = Emerald.getItemMeta();
                ItemStack Platinum = new ItemStack(Material.IRON_BLOCK);
                ItemMeta PlatinumMeta = Platinum.getItemMeta();
                coallore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                coallore.add(ChatColor.GRAY + bold + "Cooldown");
                coallore.add(ChatColor.GREEN + bold + coalcooldown);
                coallore.add(ChatColor.GRAY + bold + "Accessible:");
                coallore.add(ChatColor.GREEN + bold + coaluse);
                coallore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                CoalMeta.setLore(coallore);
                ironlore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                ironlore.add(ChatColor.WHITE + bold + "Cooldown");
                ironlore.add(ChatColor.GREEN + bold + ironcooldown);
                ironlore.add(ChatColor.WHITE + bold + "Accessible:");
                ironlore.add(ChatColor.GREEN + bold + ironuse);
                ironlore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                IronMeta.setLore(ironlore);
                goldlore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                goldlore.add(ChatColor.GOLD + bold + "Cooldown");
                goldlore.add(ChatColor.GREEN + bold + goldcooldown);
                goldlore.add(ChatColor.GOLD + bold + "Accessible:");
                goldlore.add(ChatColor.GREEN + bold + golduse);
                goldlore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                GoldMeta.setLore(goldlore);
                redstonelore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                redstonelore.add(ChatColor.RED + bold + "Cooldown");
                redstonelore.add(ChatColor.GREEN + bold + redstonecooldown);
                redstonelore.add(ChatColor.RED + bold + "Accessible:");
                redstonelore.add(ChatColor.GREEN + bold + redstoneuse);
                redstonelore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                RedstoneMeta.setLore(redstonelore);
                diamondlore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                diamondlore.add(ChatColor.AQUA + bold + "Cooldown");
                diamondlore.add(ChatColor.GREEN + bold + diamondcooldown);
                diamondlore.add(ChatColor.AQUA + bold + "Accessible:");
                diamondlore.add(ChatColor.GREEN + bold + diamonduse);
                diamondlore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                DiamondMeta.setLore(diamondlore);
                emeraldlore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                emeraldlore.add(ChatColor.DARK_GREEN + bold + "Cooldown");
                emeraldlore.add(ChatColor.GREEN + bold + emeraldcooldown);
                emeraldlore.add(ChatColor.DARK_GREEN + bold + "Accessible:");
                emeraldlore.add(ChatColor.GREEN + bold + emeralduse);
                emeraldlore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                EmeraldMeta.setLore( emeraldlore);
                platlore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                platlore.add(ChatColor.WHITE + bold + "Cooldown");
                platlore.add(ChatColor.GREEN + bold + platcooldown);
                platlore.add(ChatColor.WHITE + bold + "Accessible:");
                platlore.add(ChatColor.GREEN + bold + platuse);
                platlore.add(ChatColor.STRIKETHROUGH + bold + "---------------");
                PlatinumMeta.setLore(platlore);

                /*Adding ICONs */
                CoalMeta.setDisplayName(ChatColor.GRAY + bold + "Coal Kit");
                Coal.setItemMeta(CoalMeta);
                IronMeta.setDisplayName(ChatColor.WHITE + bold + "Iron Kit");
                Iron.setItemMeta(IronMeta);
                GoldMeta.setDisplayName(ChatColor.GOLD + bold + "Gold Kit");
                Gold.setItemMeta(GoldMeta);
                RedstoneMeta.setDisplayName(ChatColor.RED + bold + "Redstone Kit");
                Redstone.setItemMeta(RedstoneMeta);
                DiamondMeta.setDisplayName(ChatColor.AQUA + bold + "Diamond Kit");
                Diamond.setItemMeta(DiamondMeta);
                EmeraldMeta.setDisplayName(ChatColor.GREEN + bold + "Emerald Kit");
                Emerald.setItemMeta(EmeraldMeta);
                PlatinumMeta.setDisplayName(ChatColor.WHITE + bold + "Platinum Kit");
                Platinum.setItemMeta(PlatinumMeta);
                /*Adding into GUI */
                inv.setItem(10, Coal);
                inv.setItem(11, Iron);
                inv.setItem(12, Gold);
                inv.setItem(13, Redstone);
                inv.setItem(14, Diamond);
                inv.setItem(15, Emerald);
                inv.setItem(16, Platinum);

                p.openInventory(inv);
            }
        }
        return false;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!ChatColor.stripColor(event.getInventory().getName())
                .equalsIgnoreCase("Complex Kits"))
            return;
        Player p = (Player) event.getWhoClicked();

        if (event.getInventory().getTitle().equalsIgnoreCase("Complex Kits")) {
            event.setCancelled(true);
            if ((event.getCurrentItem() == null) || (event.getCurrentItem().getType().equals(Material.AIR))) {
                return;
            }

            if (event.getRawSlot() == 10) {
                if (event.isRightClick()) {
                    p.performCommand("kit coal");
                } else if (event.isLeftClick()) {
                    p.performCommand("kit coal");
                }

            }

        }
    }
}