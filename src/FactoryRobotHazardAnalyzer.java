import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hazard = sc.nextInt();
        int risk = hazard * 10;
        System.out.println("Risk score: " + risk);
        sc.close();
    }
}
