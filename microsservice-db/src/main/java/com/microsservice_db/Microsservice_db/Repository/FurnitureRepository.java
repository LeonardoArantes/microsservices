package com.microsservice_db.Microsservice_db.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microsservice_db.Model.Furniture;

@Repository
public interface FurnitureRepository extends JpaRepository<Furniture, UUID>{

}
