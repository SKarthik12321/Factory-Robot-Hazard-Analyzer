import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hazard = sc.nextInt();

        if (hazard < 1 || hazard > 10) {
            System.out.println("Invalid hazard level");
        } else {
            System.out.println("Valid hazard level");
        }
        sc.close();
    }
}
