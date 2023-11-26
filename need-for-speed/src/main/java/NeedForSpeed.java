class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDrive = 0;
    private int startBattery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.startBattery <= 0;
    }

    public int distanceDriven() {
        return this.distanceDrive;
    }

    public void drive() {
        if (this.startBattery > 0) {
            this.distanceDrive += this.speed;
            this.startBattery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }
}
