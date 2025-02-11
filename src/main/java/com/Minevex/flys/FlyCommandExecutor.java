package com.Minevex.flys;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommandExecutor implements org.bukkit.command.CommandExecutor {

    private final Flys plugin;

    public FlyCommandExecutor(Flys plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("flyplugin.use")) {
                if (player.getAllowFlight()) {
                    player.setAllowFlight(false);
                    player.setFlying(false);
                    player.sendMessage(plugin.getPrefix() + "Fly deactivated.");
                } else {
                    player.setAllowFlight(true);
                    player.sendMessage(plugin.getPrefix() + "Fly activated.");
                }
                return true;
            } else {
                player.sendMessage(plugin.getPrefix() + "You do not have permission to use this command.");
                return false;
            }
        } else {
            sender.sendMessage(plugin.getPrefix() + "Only players can use this command.");
        }
        return false;
    }
}