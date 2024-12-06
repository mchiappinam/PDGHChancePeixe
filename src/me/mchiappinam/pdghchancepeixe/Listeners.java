package me.mchiappinam.pdghchancepeixe;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class Listeners implements Listener {
	
	private Main plugin;
	public Listeners(Main main) {
		plugin=main;
	}
	  
	@EventHandler
	public void onPlayerFishing(PlayerFishEvent e) {
		e.getHook().setBiteChance(plugin.getConfig().getDouble("chance"));
	}
}