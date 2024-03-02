package butter_smp;

import org.bukkit.plugin.java.JavaPlugin;

public class McPluginButters extends JavaPlugin {

    @Override
    public void onEnable() {


        System.out.println("This plugin is now running");

    }

    @Override
    public void onDisable() {
        super.onDisable();
        System.out.println("This plugin has stopped running");
    }
}
