import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static int calculateRisk(int hazardLevel) {
        if (hazardLevel < 1 || hazardLevel > 10) {
            System.out.println("Invalid hazard level");
            return -1;
        }
        return hazardLevel * 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter robot name: ");
        String robotName = scanner.nextLine();

        System.out.print("Enter hazard level (1-10): ");
        int hazardLevel = scanner.nextInt();

        int riskScore = calculateRisk(hazardLevel);

        if (riskScore == -1) {
            scanner.close();
            return;
        }

        System.out.println("Robot: " + robotName);
        System.out.println("Risk Score: " + riskScore);

        scanner.close();
    }
}