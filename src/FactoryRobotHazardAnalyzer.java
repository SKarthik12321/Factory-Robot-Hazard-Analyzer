import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hazard level:");
        int hazard = sc.nextInt();
        System.out.println("Hazard level entered: " + hazard);
        sc.close();
    }
}
