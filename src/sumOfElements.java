import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterNumbers;
        int sumNumber = 0;
        do {
            enterNumbers = scanner.nextInt();
            sumNumber += enterNumbers;
        } while (enterNumbers != 0);
        System.out.println(sumNumber);
    }
}
