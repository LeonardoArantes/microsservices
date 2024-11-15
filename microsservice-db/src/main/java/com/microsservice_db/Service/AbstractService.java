package com.microsservice_db.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;

import com.microsservice_db.Entity.Furniture;

public interface AbstractService {

    Furniture createFurniture(Furniture furniture);
    Optional<Furniture> researchFurnitureById(UUID id);
    List<Furniture> researchAllFurniture();
    boolean updateFurniture(UUID id, Consumer<Furniture> furniture);
    void deleteFurniture(UUID id);
    
}
