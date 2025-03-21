package Array;

import java.util.Arrays;
import java.util.Scanner;

class sortedAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enterSize = sc.nextInt();
        int[] array = new int[enterSize];
        int[] array2 = new int[enterSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.arraycopy(array, 0, array2, 0, enterSize);
        Arrays.sort(array2);
        System.out.println(Arrays.equals(array, array2));
    }
}