package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    //this method will add two numbers

    @Test
    void AddTest()
    {
        Calculator CalTest = new Calculator();
        int sum = CalTest.Add(84,46);
        assertEquals(130, sum, 0);
    }
}
