class SimpleCalculator {

    // Implement your methods here
    public static void subtractTwoNumbers(long num1, long num2){
        System.out.println(num1 - num2);
    }
    public static void sumTwoNumbers(long num1, long num2){
        System.out.println(num1 + num2);
    }
    public static void divideTwoNumbers(long num1, long num2){
        if ((num2) == 0){
            System.out.println("Division by 0!");
        }else System.out.println(num1 / num2);
    }
    public static void multiplyTwoNumbers(long num1, long num2){
        System.out.println(num1 * num2);
    }
    public static void power(long num1, long num2) {
        System.out.println(Math.pow(num1, num2));
    }
}

public class calculatorWithMethods {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch (operator) {
            case "^":
                SimpleCalculator.power(num1, num2);
                break;
            case "+":
                SimpleCalculator.sumTwoNumbers(num1, num2);
                break;
            case "-":
                SimpleCalculator.subtractTwoNumbers(num1, num2);
                break;
            case "/":
                SimpleCalculator.divideTwoNumbers(num1, num2);
                break;
            case "*":
                SimpleCalculator.multiplyTwoNumbers(num1, num2);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}