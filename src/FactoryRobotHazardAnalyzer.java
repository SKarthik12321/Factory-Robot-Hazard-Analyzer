import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static int calculateRisk(int hazardLevel) throws RobotSafetyException {
        if (hazardLevel < 1 || hazardLevel > 10) {
            throw new RobotSafetyException("Hazard level must be between 1 and 10");
        }
        return hazardLevel * 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter robot name: ");
            String robotName = scanner.nextLine();

            System.out.print("Enter hazard level (1-10): ");
            int hazardLevel = scanner.nextInt();

            int riskScore = calculateRisk(hazardLevel);

            System.out.println("Robot: " + robotName);
            System.out.println("Risk Score: " + riskScore);

        } catch (RobotSafetyException e) {
            System.out.println("Safety Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}