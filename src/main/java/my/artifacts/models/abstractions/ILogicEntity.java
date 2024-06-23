package my.artifacts.models.abstractions;

public interface ILogicEntity<TKey> {
    boolean isActive();
    void deactivate();
    void activate();
}
