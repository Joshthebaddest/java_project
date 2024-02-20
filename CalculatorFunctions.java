import java.util.Scanner;

public class CalculatorFunctions {

        // Function to perform addition
        public static void addition(Scanner scanner) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = num1 + num2;
            System.out.println("Result: " + result);
        }
    
        // Function to perform subtraction
        public static void subtraction(Scanner scanner) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = num1 - num2;
            System.out.println("Result: " + result);
        }
    
        // Function to perform multiplication
        public static void multiplication(Scanner scanner) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = num1 * num2;
            System.out.println("Result: " + result);
        }
    
        // Function to perform division
        public static void division(Scanner scanner) {
            System.out.print("Enter dividend: ");
            double dividend = scanner.nextDouble();
            System.out.print("Enter divisor: ");
            double divisor = scanner.nextDouble();
            if (divisor == 0) {
                System.out.println("Cannot divide by zero!");
                return;
            }
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        }
    
        // Function to perform power
        public static void power(Scanner scanner) {
            System.out.print("Enter base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter exponent: ");
            double exponent = scanner.nextDouble();
            double result = Math.pow(base, exponent);
            System.out.println("Result: " + result);
        }
    
        // Function to perform square
        public static void square(Scanner scanner) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            double result = Math.pow(num, 2);
            System.out.println("Result: " + result);
        }
    
        // Function to perform cube
        public static void cube(Scanner scanner) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            double result = Math.pow(num, 3);
            System.out.println("Result: " + result);
        }
    
        // Function to perform square root
        public static void squareRoot(Scanner scanner) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            double result = Math.sqrt(num);
            System.out.println("Result: " + result);
        }
    
        // Function to perform rounding
        public static void round(Scanner scanner) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            long result = Math.round(num);
            System.out.println("Result: " + result);
        }
    
        // Function to perform ceiling
        public static void ceiling(Scanner scanner) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            double result = Math.ceil(num);
            System.out.println("Result: " + result);
        }
    
        // Function to perform flooring
        public static void floor(Scanner scanner) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            double result = Math.floor(num);
            System.out.println("Result: " + result);
        }
    
        // Function to find minimum value
        public static void minValue(Scanner scanner) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = Math.min(num1, num2);
            System.out.println("Minimum value: " + result);
        }
    
        // Function to find maximum value
        public static void maxValue(Scanner scanner) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = Math.max(num1, num2);
            System.out.println("Maximum value: " + result);
        }

        // Function to calculate sine
        public static void sin(Scanner scanner) {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            double result = Math.sin(Math.toRadians(angle));
            System.out.println("sin(" + angle + ") = " + result);
        }

        // Function to calculate cosine
        public static void cos(Scanner scanner) {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            double result = Math.cos(Math.toRadians(angle));
            System.out.println("cos(" + angle + ") = " + result);
        }

        // Function to calculate arcsine
        public static void asin(Scanner scanner) {
            System.out.print("Enter value: ");
            double value = scanner.nextDouble();
            double result = Math.toDegrees(Math.asin(value));
            System.out.println("asin(" + value + ") = " + result);
        }

        // Function to calculate arccosine
        public static void acos(Scanner scanner) {
            System.out.print("Enter value: ");
            double value = scanner.nextDouble();
            double result = Math.toDegrees(Math.acos(value));
            System.out.println("acos(" + value + ") = " + result);
        }

        // Function to calculate arctangent
        public static void atan(Scanner scanner) {
            System.out.print("Enter value: ");
            double value = scanner.nextDouble();
            double result = Math.toDegrees(Math.atan(value));
            System.out.println("atan(" + value + ") = " + result);
        }

        // Function to calculate exponential
        public static void exponential(Scanner scanner) {
            System.out.print("Enter exponent value: ");
            double exponent = scanner.nextDouble();
            double result = Math.exp(exponent);
            System.out.println("exp(" + exponent + ") = " + result);
        }

        // Function to check if a number is palindrome
        public static void palindrome(Scanner scanner) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int originalNum = num;
            int reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is a palindrome.");
            } else {
                System.out.println(originalNum + " is not a palindrome.");
            }
        }

        // Function to check if a number is Armstrong number
        public static void armstrongNumber(Scanner scanner) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int originalNum = num;
            int result = 0;
            int n = String.valueOf(num).length();

            while (num != 0) {
                int digit = num % 10;
                result += Math.pow(digit, n);
                num /= 10;
            }

            if (originalNum == result) {
                System.out.println(originalNum + " is an Armstrong number.");
            } else {
                System.out.println(originalNum + " is not an Armstrong number.");
            }
        }

        // Function to check if a number is prime
        public static void primeNumber(Scanner scanner) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    
        // Function to find average
        public static void average(Scanner scanner) {
            System.out.print("Enter the number of entries: ");
            int n = scanner.nextInt();
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                sum += scanner.nextDouble();
            }
            double average = sum / n;
            System.out.println("Average: " + average);
        }
    
        // Function to find greatest common divisor (GCD)
        public static void gcd(Scanner scanner) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            int result = gcdHelper(num1, num2);
            System.out.println("GCD: " + result);
        }
    
        // Helper function to find GCD using Euclidean algorithm
        private static int gcdHelper(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    
        // Function to find least common multiple (LCM)
        public static void lcm(Scanner scanner) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            int result = lcmHelper(num1, num2);
            System.out.println("LCM: " + result);
        }
    
        // Helper function to find LCM using GCD
        private static int lcmHelper(int a, int b) {
            return (a * b) / gcdHelper(a, b);
        }

}