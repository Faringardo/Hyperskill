import java.util.Scanner;

public class sumInRange {

    public static long sumInRange(int from, int to) {

        long sumOfNumbers = 0;
        for (; from < to; from++) {
            sumOfNumbers += from;
        }
        return sumOfNumbers;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}