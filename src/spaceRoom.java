import java.util.Scanner;

class spaceRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enterShape = scanner.nextLine();

        switch (enterShape) {
            case ("triangle"):
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println(areaTriangle(a, b, c));
                break;
            case ("rectangle"):
                double a1 = scanner.nextDouble();
                double b2 = scanner.nextDouble();
                System.out.println(a1 * b2);
                break;
            case ("circle"):
                double r = scanner.nextDouble();
                System.out.println(areaRound(r));
                break;
            default:
                System.out.println("Error");
        }
    }

    public static double areaTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double areaRound(double r) {
        return 3.14 * (Math.pow(r, 2));
    }
}