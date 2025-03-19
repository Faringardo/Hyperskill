import java.util.Scanner;

class divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endNumber = scanner.nextInt();
        int result =0;

        for (int i = 0; i < endNumber; i++){
            int enterNumber = scanner.nextInt();
            if ((enterNumber % 6) == 0){
                result += enterNumber;
            }
        }
        System.out.println(result);
    }
}
