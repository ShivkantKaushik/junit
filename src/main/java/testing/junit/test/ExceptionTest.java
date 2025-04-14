package testing.junit.test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import testing.junit.classes.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Exception Testing")
    public void divisionTest(){
        int x = 10;
        int y = 0;

        Executable executable = () -> calculator.divide(x,y);

        Exception exception = assertThrows(ArithmeticException.class, executable);

//        assertEquals("Some message", exception.getMessage());

        assertEquals("/ by zero", exception.getMessage());
    }
}
