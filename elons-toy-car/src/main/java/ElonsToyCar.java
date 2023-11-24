public class ElonsToyCar {

    private int percentage = 100;
    private int meters = 0;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return meters > 2000 ? "Driven 2000 meters" : "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        return percentage <= 0 ? "Battery empty" : "Battery at " + percentage + "%";
    }

    public void drive() {
        meters += 20;
        percentage -= 1;
    }
}
