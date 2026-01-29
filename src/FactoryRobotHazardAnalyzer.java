import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RobotHazardService service = new RobotHazardService();

        try {
            System.out.print("Enter robot name: ");
            String robotName = scanner.nextLine();

            System.out.print("Enter hazard level (1-10): ");
            int hazardLevel = scanner.nextInt();

            int riskScore = service.calculateRisk(hazardLevel);
            String riskCategory = service.classifyRisk(hazardLevel);

            System.out.println("Robot Name: " + robotName);
            System.out.println("Risk Score: " + riskScore);
            System.out.println("Risk Category: " + riskCategory);

        } catch (RobotSafetyException e) {
            System.out.println("Safety Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}