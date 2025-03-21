package Array;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int enterNumber = scanner.nextInt();
            array[i] += enterNumber;
        }
        for (int i = 0; i < n; i++) {
            if (array[i] % 3 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}