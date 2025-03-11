package testing.junit.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testing.junit.classes.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Minus Test Class")
public class CalculatorMinusTest {


    Calculator calculator = new Calculator();

    @Test
    @Tag("minus")
    @DisplayName("Minus Test")
    public void testSubtract(){

        System.out.println("Inside test Subtract");

        int x = 10;
        int y = 2;

        assertEquals(8, calculator.subtract(x , y));
    }
}
