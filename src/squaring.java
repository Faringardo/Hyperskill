import java.util.Scanner;

public class squaring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = N + 1;

        while (true) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
