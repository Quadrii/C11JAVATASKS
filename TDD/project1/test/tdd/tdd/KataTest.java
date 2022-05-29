package tdd;

import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

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
        int result = calculator.division(2, 10);
        assertEquals(5, result);
    }

    @Test
    public void gradeCTest(){
        Kata studentScore = new Kata();
        String grades = studentScore.grading(75);
        assertEquals("C", grades);
    }
    @Test
    public void gradeFTest(){
        Kata studentScore = new Kata();
        String grades = studentScore.grading(50);
        assertEquals("F", grades);
    }

    @Test
    public void gradeBTest(){
        Kata studentScore = new Kata();
        String grades = studentScore.grading(88);
        assertEquals("B", grades);
    }
    @Test
    public void gradeATest(){
        Kata studentScore = new Kata();
        String grades = studentScore.grading(99);
        assertEquals("A", grades);
    }

    @Test
    public void gradeDTest(){
        Kata studentScore = new Kata();
        String grades = studentScore.grading(65);
        assertEquals("D", grades);
    }

    @Test
    public void factorsTest(){
        int factors = Kata.noOfFactors(5);
        assertEquals(2, factors);
    }
    @Test
    public void primeNumberTest(){
        boolean isPrime = Kata.isPrime(5);
        assertTrue(isPrime);
    }


}
