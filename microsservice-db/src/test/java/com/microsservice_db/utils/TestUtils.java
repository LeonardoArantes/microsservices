package com.microsservice_db.utils;

import java.math.BigDecimal;

import com.microsservice_db.Entity.Furniture;
import com.microsservice_db.Enums.TypeEnum;

public class TestUtils {

    public static Furniture createFurniture() {
        //UUID id = UUID.randomUUID();
        
        return new Furniture("chair",
                            TypeEnum.ARMCHAIR,
                            "woods",
                            "red",
                            new BigDecimal(4.0),
                            new BigDecimal(400.00),
                            42,
                            "simple chair");
    }

    public static Furniture createFurniture1() {
        //UUID id = UUID.randomUUID();
        
        return new Furniture("desk",
                            TypeEnum.DESK,
                            "wood",
                            "blue",
                            new BigDecimal(10.0),
                            new BigDecimal(1000.00),
                            30,
                            "simple desk");
    }





}
