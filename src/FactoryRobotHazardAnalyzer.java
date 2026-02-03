import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    static void validate(int hazard) throws RobotSafetyException {
        if (hazard < 1 || hazard > 10) {
            throw new RobotSafetyException("Hazard level must be between 1 and 10");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int hazard = sc.nextInt();
            validate(hazard);
            System.out.println("Hazard accepted");
        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
