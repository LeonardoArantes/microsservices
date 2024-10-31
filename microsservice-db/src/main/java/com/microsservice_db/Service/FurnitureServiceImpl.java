package com.microsservice_db.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microsservice_db.Entity.Furniture;
import com.microsservice_db.Repository.FurnitureRepository;


@Service
public class FurnitureServiceImpl implements AbstractService {

    @Autowired
    private FurnitureRepository repository;

    @Override //CREATE
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
    public Furniture updateFurniture(UUID id, Furniture furniture) {
    return null;
        /*    return repository.findById(id)
            .map(existingFurniture -> {
                if(!furniture.equals(existingFurniture)){
                    BeanUtils.copyProperties(furniture, existingFurniture, "id");
                    return repository.save(existingFurniture);
                }
            }).orElse(() -> repository.findById(id));*/
    } 

    @Override
    @Transactional
    public void deleteFurniture(UUID id) {
        Optional<Furniture> furniture = repository.findById(id);
    //    repository.delete();
    }

}
