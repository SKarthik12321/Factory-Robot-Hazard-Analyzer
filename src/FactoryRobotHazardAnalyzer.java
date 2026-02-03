import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    static String classifyRisk(int hazard) {
        if (hazard <= 3) return "LOW";
        if (hazard <= 7) return "MEDIUM";
        return "HIGH";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hazard = sc.nextInt();
        System.out.println("Risk Level: " + classifyRisk(hazard));
        sc.close();
    }
}
