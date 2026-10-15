public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        test("Addition", calculator.add(5, 3), 8);
        test("Subtraction", calculator.subtract(10, 4), 6);
        test("Multiplication", calculator.multiply(4, 3), 12);
        test("Division", calculator.divide(10, 2), 5);

        System.out.println("All automated tests passed successfully.");
    }

    private static void test(String testName, int actual, int expected) {

        if (actual != expected) {
            System.out.println(
                testName + " FAILED. Expected: "
                + expected + ", Actual: " + actual
            );

            System.exit(1);
        }

        System.out.println(testName + " PASSED.");
    }
}
