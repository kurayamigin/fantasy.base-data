package my.artifacts.models;

import my.artifacts.models.abstractions.IAuditableEntity;
import my.artifacts.models.abstractions.ILogicEntity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AuditableLogicEntity<TKey> extends AuditableEntity<TKey> implements IAuditableEntity<TKey>, ILogicEntity<TKey> {
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
