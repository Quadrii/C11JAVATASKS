package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTest {
    @Test
      public void checkIfAcIsOnOrOff() {
        AirCondition myAirCondition = new AirCondition();
        myAirCondition.powerOffOrOn();
        myAirCondition.increaseTemperature();
        assertEquals(1, myAirCondition.getTemperature());
        assertTrue(myAirCondition.isOn());
        //assertEquals(false, myAirCondition.isOn());
    }
    @Test
    public void tempIncrease() {
        AirCondition homeAirCondition = new AirCondition();
        homeAirCondition.increaseTemperature();
        assertEquals(0, homeAirCondition.getTemperature());
    }

    @Test
    public void tempDecrease() {
        AirCondition homeAirCondition = new AirCondition();
        homeAirCondition.decreaseTemperature();
        assertEquals(0, homeAirCondition.getTemperature());
    }
}
