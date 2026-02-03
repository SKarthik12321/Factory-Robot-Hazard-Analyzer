public class RobotHazardService {
    public String getRisk(int hazard) {
        if (hazard <= 3) return "LOW";
        if (hazard <= 7) return "MEDIUM";
        return "HIGH";
    }
}
