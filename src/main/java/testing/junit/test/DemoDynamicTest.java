package testing.junit.test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
import testing.junit.classes.Calculator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Dynamic Test")
public class DemoDynamicTest {

    Calculator calculator = new Calculator();

    @TestFactory
    @DisplayName("Demo addition dynamic test")
    List<DynamicTest> additionTest() {

        List<DynamicTest> dynamicTests = new ArrayList<>();

        for(int i = 1; i < 5; i++){
            int arg = i;
            String testName = "DynamicTest" + i;
            Executable executable = () -> assertEquals(arg+1, calculator.add(arg,1) );

            DynamicTest dynamicTest = DynamicTest.dynamicTest(testName,executable);

            dynamicTests.add(dynamicTest);


        }

        return dynamicTests;

    }


}
