import java.util.Scanner;

class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.println("Enter the number ");
        number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("Fizz");
        }

        else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("Buzz");
        }

        else if (number % 3 == 0 && number % 5 == 0) {
            System.err.println("FizzBuzz");
        }

        else {
            System.out.println(number);
        }

    }
}