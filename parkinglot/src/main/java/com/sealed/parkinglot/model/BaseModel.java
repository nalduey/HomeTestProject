package com.sealed.parkinglot.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@SuperBuilder
@MappedSuperclass
public abstract class BaseModel implements Serializable {

    @Column(name = "last_modified_date")
    @UpdateTimestamp
    private Date lastModifiedDate;

    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @Column(name = "created_date", updatable = false)
    @CreationTimestamp
    private Date createdDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    public Boolean getIsDeleted() {

        return isDeleted != null && isDeleted;
    }
}
