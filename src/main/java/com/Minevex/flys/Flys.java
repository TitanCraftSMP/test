package com.Minevex.flys;

import org.bukkit.plugin.java.JavaPlugin;

public final class Flys extends JavaPlugin {

    private final String PREFIX = "§bMineVex.net | &7";

    @Override
    public void onEnable() {
        getLogger().info("Fly = ja");
        this.getCommand("fly").setExecutor(new FlyCommandExecutor(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("Fly = nein");
    }

    public String getPrefix() {
        return PREFIX;
    }


}
