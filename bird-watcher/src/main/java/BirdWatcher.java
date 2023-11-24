import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
//        int sum = 0;
//        for (int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++) {
//            sum += birdsPerDay[i];
//        }
//        return sum;
        return Arrays
                .stream(birdsPerDay)
                .limit(numberOfDays)
                .sum();
    }

    public int getBusyDays() {
//        int count = 0;
//        for (int birds : birdsPerDay) {
//            if (birds >= 5) count++;
//        }
//        return count;
        return (int) Arrays
                .stream(birdsPerDay)
                .filter(birds -> birds >= 5)
                .count();
    }
}
