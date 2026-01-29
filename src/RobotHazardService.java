public class RobotHazardService {

    public int calculateRisk(int hazardLevel) throws RobotSafetyException {
        if (hazardLevel < 1 || hazardLevel > 10) {
            throw new RobotSafetyException("Hazard level must be between 1 and 10");
        }
        return hazardLevel * 10;
    }

    public String classifyRisk(int hazardLevel) {
        if (hazardLevel <= 3) {
            return "LOW";
        } else if (hazardLevel <= 6) {
            return "MEDIUM";
        } else {
            return "HIGH";
        }
    }
}