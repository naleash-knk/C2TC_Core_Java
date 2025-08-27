package day11.V1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("the program continues....");
        try {
            int data = 100 / 0;  // risky code
            System.out.println("Result: " + data);
        } catch (ArithmeticException ae) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Program ended safely.");
    }
}
