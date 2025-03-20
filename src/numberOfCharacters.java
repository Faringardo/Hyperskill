import java.util.Scanner;

public class numberOfCharacters {

    public static void countCharacters(String inputString) {
        int sumNumber = 0;
        for (int i = 0; i < inputString.length(); i++){
            sumNumber ++;
        }
        System.out.println(sumNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        countCharacters(inputString);

        scanner.close();
    }
}