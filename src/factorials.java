import java.util.Scanner;

public class factorials {

    public static long factorial(long n) {

        long sum = 1;
        if (n == 0 || n == 1) return 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}