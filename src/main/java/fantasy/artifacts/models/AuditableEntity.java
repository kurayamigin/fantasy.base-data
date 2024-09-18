package fantasy.artifacts.models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.OffsetDateTime;

@MappedSuperclass
public abstract class AuditableEntity<TKey> extends Entity<TKey>{
    private TKey createdBy;
    @Column(name = "created_date",
            nullable = false,
            insertable = false,
            updatable = false,
            columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private OffsetDateTime createdDate;

    private TKey updatedBy;
    @Column(name = "updated_date",
            nullable = false,
            insertable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private OffsetDateTime updatedDate = OffsetDateTime.now();

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }
    public TKey getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(TKey createdBy) {
        this.createdBy = createdBy;
    }
    public OffsetDateTime getUpdatedDate() {
        return updatedDate;
    }
    public void setUpdatedDate(OffsetDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
    public TKey getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(TKey updatedBy) {
        this.updatedBy = updatedBy;
    }
}
