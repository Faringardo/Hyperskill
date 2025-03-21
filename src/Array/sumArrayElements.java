package Array;

import java.util.Scanner;

class sumArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int enterSize = sc.nextInt();
        int[] array = new int[enterSize];

        for (int i = 0; i < enterSize; i++) {
            int enterNumber = sc.nextInt();
            array[i] = enterNumber;
        }
        int enterFlagNumber = sc.nextInt();
        for (int i = 0; i < enterSize; i++) {
            if (enterFlagNumber < array[i]) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}