package com.buildingwithbukkit.example;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * This is a quick example plugin with a singleton instance (singleton is optional!)
 */
public class ExamplePlugin extends JavaPlugin {

	private static ExamplePlugin instance;
	public static ExamplePlugin getInstance() { return instance; }
	public ExamplePlugin() { instance = this; }
	
	@Override
	public void onEnable() {
		// Just say hello!
		this.getLogger().log(Level.INFO, "Get building with the bukkit API!");
	}
	
}
