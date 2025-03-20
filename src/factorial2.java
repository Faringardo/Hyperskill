import java.util.Scanner;

public class factorial2 {

    public static void factorialCalcul(int n) {
        int numberSum = 1;

        for (int i = 1; i <= n; i++) {
            numberSum *= i;
        }
        System.out.println(numberSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        factorialCalcul(n);

        scanner.close();
    }

}