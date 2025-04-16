package testing.junit.test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.function.Executable;
import testing.junit.classes.Calculator;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Timeout Test")
public class TimeoutTest {


    Calculator calculator = new Calculator();

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    @DisplayName("Timeout Addition")
    public void testAddition() throws InterruptedException {

        assertEquals(5, calculator.additionWithDelay(2,3));
    }

    @Test
    @DisplayName("Timeout Addition")
    public void testAddition1() throws InterruptedException {

        Executable executable = () -> calculator.additionWithDelay(2,3);
        assertTimeout(Duration.ofSeconds(1), executable);
    }


    @Test
    @DisplayName("Timeout Addition")
    public void testAddition2() throws InterruptedException {

        //addition method should not run after timeout, test with 1 sec
        Executable executable = () -> calculator.additionWithDelay(2,3);
        assertTimeoutPreemptively(Duration.ofSeconds(1), executable);
    }

}
