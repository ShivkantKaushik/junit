package testing.junit.test;

import org.junit.jupiter.api.*;
import testing.junit.classes.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Calculator Class")
public class CalculatorTest {

    Calculator calculator = new Calculator();

    int x;
    int y;

    @BeforeAll
    public static void setUp(){
        System.out.println("It will run only once, before all functions.");
    }

    @BeforeEach
    public void initializeVariables(TestInfo testInfo){

        System.out.println("Method Name: " + testInfo.getTestMethod());
        System.out.println("Display Name: " + testInfo.getDisplayName());

        x = 10;
        y = 10;
    }

    @AfterEach
    public void clearVariables(){
        x = 0;
        y = 0;
    }

    @Test
    @DisplayName("Addition Method")
    @Tag("add")
    public void testAddition(){
        assertEquals(20,calculator.add(x,y));
    }



    @AfterAll
    public static void deSetup(){
        System.out.println("It will run once after all teh functions.");
    }




}
