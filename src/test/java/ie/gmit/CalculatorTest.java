package ie.gmit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    //this method will add two numbers

    @Test
    @Disabled
    void AddTest()
    {
        Calculator CalTest = new Calculator();
        int sum = CalTest.Add(84,46);
        assertEquals(130, sum, 0);
    }

    @Test
    void SubtractTest()
    {
        Calculator CalTest = new Calculator();
        int sum = CalTest.Subtract(50,30);
        assertEquals(20, sum, 0);
    }
}
