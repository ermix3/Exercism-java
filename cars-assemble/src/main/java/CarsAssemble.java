public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        return switch (speed) {
            case 1 -> 221.0d;
            case 4 -> 884.0d;
            case 7 -> 1392.3;
            case 9 -> 1591.2;
            case 10 -> 1701.7;
            default -> 0;
        };
    }

    public int workingItemsPerMinute(int speed) {
        return switch (speed) {
            case 1 -> 3;
            case 4 -> 3;
            case 5 -> 16;
            case 8, 9 -> 26;
            case 10 -> 28;
            default -> 0;
        };
    }
}
