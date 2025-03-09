package testing.junit.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testing.junit.classes.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Calculator Class")
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Addition Method")
    public void testAddition(){
        assertEquals(21,calculator.add(10,10));
    }


}
