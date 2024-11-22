package com.microsservice_db.Repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.microsservice_db.Entity.Furniture;
import com.microsservice_db.Enums.TypeEnum;
import com.microsservice_db.Service.FurnitureServiceImpl;
import com.microsservice_db.utils.TestUtils;

@RunWith(MockitoJUnitRunner.class)
public class FurnitureRepositoryTest {

    @Mock
    private FurnitureRepository repository;

    @InjectMocks
    private FurnitureServiceImpl service;

    AutoCloseable openMocks;

    @BeforeEach
    void setUp() {
        openMocks = MockitoAnnotations.openMocks(this);
    }


    @AfterEach
    void tearDown() throws Exception {
        openMocks.close();
    }

    @Test
    public void testCreateNewFurnitureSucessfully() {
        Furniture f = TestUtils.createFurniture();
        when(repository.save(f)).thenReturn(f);

        var testFurniture = repository.save(f);
        assertNotNull(testFurniture);
        assertNotNull(f.getId());
        assertEquals(f.getName(), testFurniture.getName());
        assertEquals(f.getType(), testFurniture.getType());
        assertEquals(f.getMaterial(), testFurniture.getMaterial());
        assertEquals(f.getColor(), testFurniture.getColor());
        assertEquals(f.getWheight(), testFurniture.getWheight());
        assertEquals(f.getPrice(), testFurniture.getPrice());
        assertEquals(f.getAmount(), testFurniture.getAmount());
        assertEquals(f.getDescription(), testFurniture.getDescription());      
    }

    @Test
    public void testResearchFurnitureById() {
        Furniture f = TestUtils.createFurniture();
        UUID id = f.getId();
        lenient().when(repository.save(f)).thenReturn(f);
        when(repository.findById(id)).thenReturn(Optional.of(f));

        Furniture testFurniture = repository.findById(id).get();

        assertTrue(repository.findById(f.getId()).isPresent());
        assertEquals(f, testFurniture);
        assertTrue(f.getId().toString().equals(testFurniture.getId().toString()));
    }

    @Test
    public void testResearchAllFurniture() {
        Furniture f1 = TestUtils.createFurniture();
        Furniture f2 = TestUtils.createFurniture();

        UUID id1 = f1.getId();
        UUID id2 = f2.getId();

        List<Furniture> furnitures = List.of(f1, f2);

        when(repository.save(f1)).thenReturn(f1);
        when(repository.save(f2)).thenReturn(f2);
        when(repository.findById(id1)).thenReturn(Optional.of(f1));
        when(repository.findById(id2)).thenReturn(Optional.of(f2));
        when(repository.findAll()).thenReturn(furnitures);

        repository.save(f1);
        repository.save(f2);

        List<Furniture> testFurniture = repository.findAll();

        assertTrue(repository.findById(f1.getId()).isPresent());
        assertTrue(repository.findById(f2.getId()).isPresent());
        assertEquals(2, testFurniture.size());
        assertTrue(testFurniture.contains(f1));
        assertTrue(testFurniture.contains(f2));
    }
    
    @Test 
    public void testUpdateFurniture() {
        Furniture f = TestUtils.createFurniture();        
        when(repository.save(f)).thenReturn(f);
        when(repository.findById(f.getId())).thenReturn(Optional.of(f));
        
        repository.save(f);
        f.setName("name");
        f.setColor("purple");
        f.setAmount(43);
        f.setDescription("simple bed");
        f.setMaterial("plastic");
        f.setPrice(new BigDecimal(4000));
        f.setWheight(new BigDecimal(25));
        f.setType(TypeEnum.BED);
        
        when(repository.save(f)).thenReturn(f);

        repository.save(f);
        Optional<Furniture> fetch = repository.findById(f.getId());

        assertTrue(fetch.isPresent());
        assertEquals(f.getId(), fetch.get().getId());
        assertEquals(f.getName(), fetch.get().getName());
        assertEquals(f.getType(), fetch.get().getType());
        assertEquals(f.getColor(), fetch.get().getColor());
        assertEquals(f.getAmount(), fetch.get().getAmount());
        assertEquals(f.getDescription(), fetch.get().getDescription());
        assertEquals(f.getMaterial(), fetch.get().getMaterial());
        assertEquals(f.getPrice(), fetch.get().getPrice());
        assertEquals(f.getWheight(), fetch.get().getWheight());
    }

    @Test
    public void testDeleteFurniture() {
        Furniture f = TestUtils.createFurniture();        
        lenient().when(repository.save(f)).thenReturn(f);

        repository.delete(f);

        verify(repository, times(1)).delete(f);
        assertThat(repository.count() == 0);
        
    }
}
