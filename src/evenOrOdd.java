import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterNumber;

        while (true) {
            enterNumber = scanner.nextInt();
            if (enterNumber == 0) {
                break;
            }
            System.out.println(enterNumber % 2 == 0 ? "even" : "odd");
        }
    }
}
