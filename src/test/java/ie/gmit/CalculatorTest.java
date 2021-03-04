package ie.gmit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    //this method will add two numbers

    @Test
    void addTest()
    {
        Calculator CalTest = new Calculator();
        int sum = CalTest.Add(84,46);
        assertEquals(130, sum, 0);
    }


    @Test
    void subtractTest()
    {
        Calculator CalTest = new Calculator();
        int sum = CalTest.Subtract(50,30);
        assertEquals(20, sum, 0);
    }

    @Test
    void divideTest()
    {
        Calculator CalTest = new Calculator();
        int sum = CalTest.Divide(25,5);
        assertEquals(5, sum, 0);
    }

    @Test
    void multiplyTest()
    {
        Calculator CalTest = new Calculator();
        int sum = CalTest.Multiply(6,5);
        assertEquals(30, sum, 0);
    }

    @Test
    public void testDivideByZero() {
        Calculator CalTest = new Calculator();
       assertThrows(IllegalArgumentException.class, () -> CalTest.Divide(0,1));
        Calculator CalTest2 = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> CalTest2.Divide(1,0));
    }
}
