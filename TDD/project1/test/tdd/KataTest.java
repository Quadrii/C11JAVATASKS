package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int result = calculator.add(2, 6);
        assertEquals(8, result);
        assertEquals(80, calculator.add(50, 30));
    }

    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtraction(8, 6);
        assertEquals(2, result);
        assertEquals(20, calculator.subtraction(50, 30));
    }

    @Test
    public void absoluteSubtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtraction(2, 4);
        assertEquals(2, result);
    }

    @Test
    public void multiplicationTest(){
        Kata calculator = new Kata();
        int result = calculator.multiplication(2, 4);
        assertEquals(8, result);
    }

    @Test
    public void divisionTest(){
        Kata calculator = new Kata();
        int result = calculator.division(9, 4);
        assertEquals(2, result);
    }


}
