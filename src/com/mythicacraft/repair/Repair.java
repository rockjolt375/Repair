package com.mythicacraft.repair;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Repair extends JavaPlugin{

	private static final Logger log = Logger.getLogger("Minecraft");
	
	 public void onDisable() {
         log.info("[Repair] Disabled!");
	 }
	 
	 public void onEnable() {
		 
		 
		 getCommand("repair").setExecutor(new RepairCmd());
		 
		 log.info("[Repair] Enabled!");
	 }
	
}
