package my.artifacts.models.abstractions;

public interface IEntity<TKey> {
    public TKey getId();
    public void setId(TKey id);
}
