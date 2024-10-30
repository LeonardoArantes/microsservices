package com.microsservice_db.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microsservice_db.Entity.Furniture;

@Repository
public interface FurnitureRepository extends JpaRepository<Furniture, UUID>{

}
