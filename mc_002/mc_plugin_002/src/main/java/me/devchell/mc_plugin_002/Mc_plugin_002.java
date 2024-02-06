package me.devchell.mc_plugin_002;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mc_plugin_002 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("The plugin has started.");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        //Player Object
        Player p = event.getPlayer();

        //Console
        System.out.println(p.getName() + " has joined the server.");

        //Game chat
        event.setJoinMessage(p.getName() + " welcome to the server.");
    }

}
