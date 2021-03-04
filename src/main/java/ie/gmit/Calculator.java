package ie.gmit;

public class Calculator {
    public int Add(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }
    public int Subtract(int num1, int num2)
    {
        int sum = num1 - num2;
        return sum;
    }

    public int Divide(int num1, int num2)
    {
        if(num1 > 0 && num2 >0)
        {
            int sum = num1 / num2;
            return sum;
        }

        else{
            throw new IllegalArgumentException("Cant Divide by zero");
        }

    }

    public int Multiply(int num1, int num2)
    {
        int sum = num1 * num2;
        return sum;
    }


}
