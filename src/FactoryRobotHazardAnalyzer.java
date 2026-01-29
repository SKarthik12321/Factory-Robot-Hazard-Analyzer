import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter robot name: ");
        String robotName = scanner.nextLine();

        System.out.print("Enter hazard level (1-10): ");
        int hazardLevel = scanner.nextInt();

        if (hazardLevel < 1 || hazardLevel > 10) {
            System.out.println("Invalid hazard level");
            scanner.close();
            return;
        }

        int riskScore = hazardLevel * 10;

        System.out.println("Robot: " + robotName);
        System.out.println("Risk Score: " + riskScore);

        scanner.close();
    }
}
