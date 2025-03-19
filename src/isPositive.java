import java.util.Scanner;

public class isPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a>0){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
