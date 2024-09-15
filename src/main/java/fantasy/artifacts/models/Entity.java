package fantasy.artifacts.models;

import fantasy.artifacts.models.abstractions.IEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Entity<TKey> implements IEntity<TKey> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private TKey id;

    public TKey getId() {
        return id;
    }

    public void setId(TKey id) {
        this.id = id;
    }
}
