package jenkins.demo;

public class Calculator {
    
    private Calculator() {
    }

    public static int add(final int a, final int b) {
        return a + b;
    }

    public static int multiply(final int a, final int b) {
        return a * b;
    }
}
