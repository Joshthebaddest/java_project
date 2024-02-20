import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square");
            System.out.println("7. Cube");
            System.out.println("8. Square root");
            System.out.println("9. Round");
            System.out.println("10. Ceiling");
            System.out.println("11. Floor");
            System.out.println("12. Min Value");
            System.out.println("13. Max Value");
            System.out.println("14. sin");
            System.out.println("15. cos");
            System.out.println("16. asin");
            System.out.println("17. acos");
            System.out.println("18. atan");
            System.out.println("19. exponential");
            System.out.println("20. Palindrome");
            System.out.println("21. Armstrong number");
            System.out.println("22. Prime number");
            System.out.println("23. Average");
            System.out.println("24. GCD");
            System.out.println("25. LCM");
            System.out.println("26. Exit");

            choice = scanner.nextInt();

            CalculatorFunctions Calc = new CalculatorFunctions();

            switch (choice) {
                case 1:
                    Calc.addition(scanner);
                    break;
                case 2:
                    Calc.subtraction(scanner);
                    break;
                case 3:
                    Calc.multiplication(scanner);
                    break;
                case 4:
                    Calc.division(scanner);
                    break;
                case 5:
                    Calc.power(scanner);
                    break;
                case 6:
                    Calc.square(scanner);
                    break;
                case 7:
                    Calc.cube(scanner);
                    break;
                case 8:
                    Calc.squareRoot(scanner);
                    break;
                case 9:
                    Calc.round(scanner);
                    break;
                case 10:
                    Calc.ceiling(scanner);
                    break;
                case 11:
                    Calc.floor(scanner);
                    break;
                case 12:
                    Calc.minValue(scanner);
                    break;
                case 13:
                    Calc.maxValue(scanner);
                    break;
                case 14:
                    Calc.sin(scanner);
                    break;
                case 15:
                    Calc.cos(scanner);
                    break;
                case 16:
                    Calc.asin(scanner);
                    break;
                case 17:
                    Calc.acos(scanner);
                    break;
                case 18:
                    Calc.atan(scanner);
                    break;
                case 19:
                    Calc.exponential(scanner);
                    break;
                case 20:
                    Calc.palindrome(scanner);
                    break;
                case 21:
                    Calc.armstrongNumber(scanner);
                    break;
                case 22:
                    Calc.primeNumber(scanner);
                    break;
                case 23:
                    Calc.average(scanner);
                    break;
                case 24:
                    Calc.gcd(scanner);
                    break;
                case 25:
                    Calc.lcm(scanner);
                    break;
                case 26:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 26);

        scanner.close();
    }
}
