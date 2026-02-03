import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hazard = sc.nextInt();
        RobotHazardService service = new RobotHazardService();
        System.out.println("Risk Level: " + service.getRisk(hazard));
        sc.close();
    }
}
