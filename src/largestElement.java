import java.util.Scanner;

class largestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterNumbers;
        int maxNumber = 0;
        do {
            enterNumbers = scanner.nextInt();
            if (enterNumbers > maxNumber){
                maxNumber = enterNumbers;
            }
        } while (enterNumbers != 0);
        System.out.println(maxNumber);
    }
}