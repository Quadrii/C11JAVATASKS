package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    @Test
    public void stationLocationTest(){
        PetrolPurchase petrol = new PetrolPurchase ();
        petrol.setStationLocation("Total Filling Station, Ogba");
        assertEquals("Total Filling Station, Ogba", petrol.getStationLocation());
    }

    @Test
    public void petrolTypeTest(){
        PetrolPurchase petrol = new PetrolPurchase ();
        petrol.setPetrolType("Diesel");
        assertEquals("Diesel", petrol.getPetrolType());
    }

    @Test
    public void petrolQuantityTest(){
        PetrolPurchase petrol = new PetrolPurchase ();
        petrol.setPetrolQuantity(5);
        assertEquals(5, petrol.getPetrolQuantity());
    }

    @Test
    public void pricePerLiterTest(){
        PetrolPurchase petrol = new PetrolPurchase ();
        petrol.setPricePerLiter(200);
        assertEquals(200, petrol.getPricePerLiter());
    }

    @Test
    public void priceDiscountTest(){
        PetrolPurchase petrol = new PetrolPurchase ();
        petrol.setDiscounts(0.05);
        assertEquals(0.05, petrol.getDiscounts());
    }

    @Test
    public void netPurchaseAmountTest(){
        PetrolPurchase petrol = new PetrolPurchase ();
        petrol.setDiscounts(0.05);
        petrol.setPetrolQuantity(5);
        petrol.setPricePerLiter(200);
        assertEquals(990.0, petrol.getNetPurchaseAMount());
    }
}
