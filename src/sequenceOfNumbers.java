import java.util.Scanner;

public class sequenceOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterNumber;
        int sum = 0;

        while (true) {
            enterNumber = scanner.nextInt();
            if (enterNumber == 0) {
                System.out.println(sum);
                break;
            }
            sum += enterNumber;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}
