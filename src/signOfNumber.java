import java.util.Scanner;

public class signOfNumber {

    public static int sign(int number) {

        return (number == 0) ? 0 : (number > 0) ? 1 : -1;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}