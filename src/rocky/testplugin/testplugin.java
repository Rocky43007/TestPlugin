package rocky.testplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class testplugin extends JavaPlugin{
    @Override
    public void onEnable(){
        this.getCommand("kit").setExecutor(new CommandKit());
    }
    @Override
    public void onDisable(){
    }
    @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args) {
        if (command.getName().equalsIgnoreCase("test")) {
            sender.sendMessage("You ran /test!");
            return true;
        }
        return false;
    }
}
