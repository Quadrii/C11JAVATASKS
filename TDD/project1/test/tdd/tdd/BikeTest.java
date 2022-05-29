package tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class BikeTest {
    @Test
    public void bikeCanBeCreatedTest(){

        Bike bike = new Bike();
        boolean on = false;
        int speed = bike.getSpeed();
        assertEquals(0, speed);
    }

    @Test
    public  void testThatBikeCanBeOnAndOff(){
        Bike myBike = new Bike();
        myBike.powerOfOrOn();
        myBike.accelerateBike();
        assertEquals(1,myBike.getSpeed());
       assertTrue(myBike.isOn());
        //assertEquals(false, myBike.isOn());
    }
    @Test
    public  void accelerate(){
        Bike myBike = new Bike();
        myBike.accelerateBike();
        myBike.accelerateBike();
        assertEquals(2,myBike.getSpeed());
    }
    @Test
    public void deccelerate(){
        Bike tayoBike = new Bike();
        tayoBike.deccelerateBike();
        assertEquals(-1, tayoBike.getSpeed());
    }
}

