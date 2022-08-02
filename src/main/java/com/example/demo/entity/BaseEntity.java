package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Data
public class BaseEntity {

    @CreatedDate
    @Column(name = "created_date")
    private LocalDateTime create_date;

    @LastModifiedDate
    @Column(name = "last_modified_date")
    private LocalDateTime last_modified_date;

}
