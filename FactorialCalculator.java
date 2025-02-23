import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        // Loop until a valid non-negative integer is entered
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            
            // Check if the input is a valid integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                
                // Check if the number is non-negative
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
            }
        }
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        long factorial = 1;
        
        // If the number is 0, return 1 (base case)
        if (n == 0) {
            return factorial;
        }
        
        // Calculate factorial using a loop
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        // Get a valid non-negative integer from the user
        int number = getNonNegativeInteger();
        
        // Calculate the factorial of the number
        long result = calculateFactorial(number);
        
        // Display the result
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
