
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        processInput(scanner);

    }

    public static void processInput(Scanner scanner) {
        int count = 0;
        int sum = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            int inputInteger = Integer.valueOf(input);

            if (isPositive(inputInteger)) {
                count++;
                sum += inputInteger;
            }

        }

        if (count == 0) {
            System.out.println("Cannot calculate the average");

        } else {
            System.out.println((double) sum / count);
        }
    }

    public static Boolean isPositive(int number) {
        if (number > 0) {
            return true;
        }
        return false;
    }
}
