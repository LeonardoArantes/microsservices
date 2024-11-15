package com.microsservice_db.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microsservice_db.Entity.Furniture;
import com.microsservice_db.Exceptions.ItemNotFoundException;
import com.microsservice_db.Repository.FurnitureRepository;


@Service
public class FurnitureServiceImpl implements AbstractService {

    @Autowired
    private FurnitureRepository repository;

    @Override
    @Transactional
    public Furniture createFurniture(Furniture furniture) {
        return repository.save(furniture);
    }

    @Override
    public Optional<Furniture> researchFurnitureById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public List<Furniture> researchAllFurniture() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public boolean updateFurniture(UUID id, Consumer<Furniture> newFurniture) {
        Optional<Furniture> furnitureOptional = repository.findById(id);
        if(newFurniture == null)
            throw new ItemNotFoundException("no furniture found for this ID");
        
        
        if(furnitureOptional.isPresent()) {
            Furniture furniture = furnitureOptional.get();
            newFurniture.accept(furniture);
            repository.save(furniture);
            return true;
        }
        return false;
    }

    @Override
    public void deleteFurniture(UUID id) {
        Optional<Furniture> furniture = repository.findById(id);

        if(!furniture.isPresent())
            throw new ItemNotFoundException("no furniture found for this ID");
        
        repository.deleteById(id);

    }

}
