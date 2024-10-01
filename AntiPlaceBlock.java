import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class AntiPlaceBlock implements Listener {
    private boolean enabled = true;

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
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
