package fr.swoking.noRain;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		//Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)this);
	}
	

	@EventHandler
    public void onWeatherChange(WeatherChangeEvent event) {
		event.getWorld().setWeatherDuration(0);
        //event.setCancelled(true);
        //System.out.println("Rain Canceled");
    }
	
	@Override
	public void onDisable() {
		
	}
	
}
