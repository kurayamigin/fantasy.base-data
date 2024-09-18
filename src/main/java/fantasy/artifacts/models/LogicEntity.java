package fantasy.artifacts.models;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class LogicEntity<TKey> extends Entity<TKey> {
    private boolean active = true;

    public boolean isActive() {
        return active;
    }

    public void deactivate() {
        this.active = false;
    }

    public void activate() {
        this.active = true;
    }
}
