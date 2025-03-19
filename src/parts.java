import java.util.Scanner;

public class parts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endNumber = scanner.nextInt();
        int countFixed = 0;
        int countReject = 0;
        int countReady = 0;

        for (int i = 0; i < endNumber; i++) {
            var enterGrades = scanner.next();
            if (enterGrades.equals("1")) {
                countFixed++;
            } else if (enterGrades.equals("-1")) {
                countReject++;
            } else if (enterGrades.equals("0")) {
                countReady++;
            }
        }
        System.out.println(countReady + " " + countFixed + " " + countReject);
    }
}
