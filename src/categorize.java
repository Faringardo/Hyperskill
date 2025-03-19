import java.util.Scanner;

public class categorize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println((num == 0) ? "Zero" :
                (num > 0) ? "Positive" : "Negative");
    }
}
