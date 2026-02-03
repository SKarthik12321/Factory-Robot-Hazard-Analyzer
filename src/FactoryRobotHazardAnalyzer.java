import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    static boolean isValid(int hazard) {
        return hazard >= 1 && hazard <= 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hazard = sc.nextInt();

        if (isValid(hazard)) {
            System.out.println("Valid hazard level");
        } else {
            System.out.println("Invalid hazard level");
        }
        sc.close();
    }
}
