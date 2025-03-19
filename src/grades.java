import java.util.Scanner;

class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endNumber = scanner.nextInt();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for(int i = 0; i < endNumber; i++){
            var enterGrades = scanner.next();
            if (enterGrades.equals("D")) {
                countD++;
            } else if (enterGrades.equals("C")) {
                countC++;
            } else if (enterGrades.equals("B")) {
                countB++;
            } else if (enterGrades.equals("A")) {
                countA++;
            }
        }
        System.out.println(countD + " " + countC + " " + countB + " " + countA);
    }
}