import java.util.Scanner;

class switchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enterNumber = scanner.nextInt();

        switch (enterNumber) {
            case (1):
                System.out.println("Yes!");
                break;
            case (2):
            case (3):
            case (4):
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}