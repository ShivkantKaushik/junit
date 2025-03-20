package testing.junit.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
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


    @ParameterizedTest
    @CsvSource({"8,10,2" , "12,15,3"})
    @DisplayName("Parameterized Minus Test | Csv Source")
    void minusTest(int res, int a, int b){

        assertEquals(res,calculator.subtract(a , b));

    }






}
