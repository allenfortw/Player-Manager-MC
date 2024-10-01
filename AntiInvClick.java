import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class AntiInvClick implements Listener {
    private boolean enabled = true;

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (enabled) {
            event.setCancelled(true);
        }
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
