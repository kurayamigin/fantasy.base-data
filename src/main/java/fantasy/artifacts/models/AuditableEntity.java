package fantasy.artifacts.models;

import fantasy.artifacts.models.abstractions.IAuditableEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.OffsetDateTime;

@MappedSuperclass
public abstract class AuditableEntity<TKey> extends Entity<TKey> implements IAuditableEntity<TKey> {
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

    @Override
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public TKey getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(TKey createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public OffsetDateTime getUpdatedDate() {
        return updatedDate;
    }

    @Override
    public void setUpdatedDate(OffsetDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public TKey getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdatedBy(TKey updatedBy) {
        this.updatedBy = updatedBy;
    }
}
