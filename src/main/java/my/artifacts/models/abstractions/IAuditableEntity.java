package my.artifacts.models.abstractions;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.Date;

public interface IAuditableEntity<TKey> {
    public OffsetDateTime getCreatedDate();
    public void setCreatedDate(OffsetDateTime createdDate);
    public TKey getCreatedBy();
    public void setCreatedBy(TKey createdBy);
    public OffsetDateTime getUpdatedDate();
    public void setUpdatedDate(OffsetDateTime updatedDate);
    public TKey getUpdatedBy();
    public void setUpdatedBy(TKey updatedBy);
}
