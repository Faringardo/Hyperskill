import java.util.Scanner;

class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        String substring = input.substring(start, end + 1);

        System.out.println(substring);

        scanner.close();
    }
}