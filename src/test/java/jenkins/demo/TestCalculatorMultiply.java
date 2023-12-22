package jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculatorMultiply {

    @Test
    void multiplyPositive() {
        assertEquals(200, Calculator.multiply(10, 20));
    }

    @Test
    void multiplyNegative() {
        assertEquals(200, Calculator.multiply(-10, -20));
    }
}
