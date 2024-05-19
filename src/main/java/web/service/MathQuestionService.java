package web.service;

public class MathQuestionService {

    /**
     * Calculate Q1 result.
     * @param number1
     * @param number2
     * @return
     */
    public static double q1Addition(String number1, String number2) {
        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            return num1 + num2;
        } catch (NumberFormatException e) {
            System.err.println("Invalid input for addition: " + number1 + ", " + number2);
            return Double.NaN; // Return NaN for invalid input
        }
    }

    /**
     * Calculate Q2 result.
     * @param number1
     * @param number2
     * @return
     */
    public static double q2Subtraction(String number1, String number2) {
        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            return num1 - num2;
        } catch (NumberFormatException e) {
            System.err.println("Invalid input for subtraction: " + number1 + ", " + number2);
            return Double.NaN; // Return NaN for invalid input
        }
    }

	public static double q3Multiplication(String number1, String number2) {
		try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            return num1 * num2;
        } catch (NumberFormatException e) {
            System.err.println("Invalid input for multiplication: " + number1 + ", " + number2);
            return Double.NaN; // Return NaN for invalid input
        }
	}
}