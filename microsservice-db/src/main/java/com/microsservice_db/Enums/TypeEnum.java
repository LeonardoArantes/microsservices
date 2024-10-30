package com.microsservice_db.Enums;

public enum TypeEnum {
    SOFA("Sofa"),
    ARMCHAIR("Armchair"),
    COFFEE_TABLE("Coffee Table"),
    DINING_TABLE("Dining Table"),
    DINING_CHAIR("Dining Chair"),
    BED("Bed"),
    NIGHTSTAND("Nightstand"),
    DRESSER("Dresser"),
    BOOKSHELF("Bookshelf"),
    TV_STAND("TV Stand"),
    DESK("Desk"),
    OFFICE_CHAIR("Office Chair"),
    CONSOLE_TABLE("Console Table"),
    WARDROBE("Wardrobe");

    private final String furnitureType;

    TypeEnum(String furnitureType){
        this.furnitureType = furnitureType;
    }

}
