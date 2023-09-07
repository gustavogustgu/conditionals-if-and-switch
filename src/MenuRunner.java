import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter other number: ");
        int number2 = scanner.nextInt();

        System.out.println("Choices Are: \n1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");

        System.out.println("Enter Choice: ");
        int choice = scanner.nextInt();


        if (choice < 1 || choice > 4) {
            System.out.println("Invalid Operation");
        } else {
            System.out.println("Your choices are");
            System.out.println("number one: " + number1);
            System.out.println("number two: " + number2);
            System.out.println("Choice: " + choice);
        }

        switch (choice){

            case 1 : System.out.println("Result: " + (number1 + number2));
                break;

            case 2 : System.out.println("Result: " + (number1 - number2));
                break;

            case 3: System.out.println("Result: " + (number1 / number2));
                break;

            case 4: System.out.println("Result: " + (number1 * number2));
                break;

            default: System.out.println("Invalid Operation");
                break;
        }
    }
}
