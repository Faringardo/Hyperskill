package Array;

import java.util.Arrays;
import java.util.Scanner;

public class box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] box1 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] box2 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(box1);
        Arrays.sort(box2);
        if (box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (box2[0] < box1[0] && box2[1] < box1[1] && box2[2] < box1[2]) {
            System.out.println("Box 1 > Box 2");
        } else System.out.println("Incompatible");
    }
}
