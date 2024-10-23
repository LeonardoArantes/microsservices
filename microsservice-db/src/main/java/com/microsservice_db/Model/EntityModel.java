package com.microsservice_db.Model;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntityModel implements Serializable {

    @Id
    @GeneratedValue
    @Column(unique = true)
    private UUID id;
}
