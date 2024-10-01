import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class AntiThrowItem implements Listener {
    private boolean enabled = true;

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent event) {
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
