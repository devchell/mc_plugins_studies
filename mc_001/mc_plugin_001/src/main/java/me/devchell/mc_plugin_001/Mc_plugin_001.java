package me.devchell.mc_plugin_001;

import org.bukkit.plugin.java.JavaPlugin;

public final class Mc_plugin_001 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("My first plugin has started. Hello!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("My first plugin has stopped. Bye!!");
    }
}
