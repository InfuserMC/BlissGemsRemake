package com.hyperdondon.blissgemsremake.internal.commands;

import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class SlashBliss implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, Command command, String s, String[] args) {
        if (args.length == 1) {
            if (args[0] == "toggle") {
                Player p = (Player) commandSender;
                PlayerParticlePreferences.getInstance().put(p, "Default");
                Bukkit.broadcastMessage(Objects.requireNonNull(PlayerParticlePreferences.getInstance().get(p)));
                return true;
            }
            else {
                Player p = (Player) commandSender;
                PlayerParticlePreferences.getInstance().put(p, "Default");
                Bukkit.broadcastMessage(Objects.requireNonNull(PlayerParticlePreferences.getInstance().get(p)));
                return true;
            }
        }


        if (args.length == 2) {
            Player p = (Player) commandSender;
            //p.getInventory().addItem(returngem.returngem(args[0], 2, 5, 1, 1));
            return true;
        } else if (args.length == 0) {
            Player p = (Player) commandSender;
            p.sendMessage(

                    ChatColor.AQUA + "/bliss toggle " + ChatColor.GRAY + "-Toggles give system",
                    ChatColor.AQUA + "/bliss gem (player) (type) (tier) " + ChatColor.GRAY + "- give gem to specific player",
                    ChatColor.AQUA + "/bliss item (item) (player) [amount] " + ChatColor.GRAY + "- give specified item to specific player",
                    ChatColor.AQUA + "/bliss revive (player) " + ChatColor.GRAY + "- revive specific player",
                    ChatColor.AQUA + "/bliss setenergy (player) [amount] " + ChatColor.GRAY + "- set player's energy",
                    ChatColor.AQUA + "/bliss reload " + ChatColor.GRAY + "- reload the configuration",
                    ChatColor.AQUA + "/bliss revive (player) " + ChatColor.GRAY + "- revive banned player",
                    ChatColor.AQUA + "/bliss withdraw [amount] " + ChatColor.GRAY + "- withdraw energy",
                    ChatColor.AQUA + "/bliss setenergy (player) [amount] " + ChatColor.GRAY + "- set energy for player",
                    ChatColor.AQUA + "/bliss particles [setting] " + ChatColor.GRAY + "- set performance setting"

            );
        }
        return true;
    }
}
