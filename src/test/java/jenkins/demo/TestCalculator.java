package jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculator {

    @Test
    void addPositive() {
        assertEquals(30, Calculator.add(10, 20));
    }

    @Test
    void addNegative() {
        assertEquals(-30, Calculator.add(-10, -20));
    }
}
