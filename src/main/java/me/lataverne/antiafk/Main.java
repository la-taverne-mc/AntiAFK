package me.lataverne.antiafk;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
    	getLogger().log(Level.INFO, "AntiAFK has been successfully enabled");
    }

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "AntiAFK has been successfully disabled");
    }
}
