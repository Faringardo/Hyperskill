package Array;

import java.util.Arrays;
import java.util.Scanner;

class firstMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int enterSize = sc.nextInt();
        int[] array = new int[enterSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < enterSize; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}