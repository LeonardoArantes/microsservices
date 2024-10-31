package com.microsservice_db.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.microsservice_db.Entity.Furniture;

public interface AbstractService {

    Furniture createFurniture(Furniture furniture);
    Optional<Furniture> researchFurnitureById(UUID id);
    List<Furniture> researchAllFurniture();
    Furniture updateFurniture(UUID id, Furniture furniture);
    void deleteFurniture(UUID id);
    
}
