import java.util.Scanner;

public class BabylonianAlgorithm {

    public static void main(String[] args) {
        double number, r, guess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you can roughly find the square root of:");
        number = scanner.nextDouble();
        System.out.println("Enter the square root estiamte(you can enter the number/2):");
        guess = scanner.nextDouble();

        for (int i = 0; i < 5; i++) {
            r = number / guess;
            guess = (guess + r) / 2;
        }

        System.out.println("Number: " + number + " Roughly guess:" + guess);
        scanner.close();

    }
}