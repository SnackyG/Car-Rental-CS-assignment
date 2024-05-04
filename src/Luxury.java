public class Luxury extends Car {
    int ccm; // > 3000
    String automaticGear;
    String airCondition;
    String cruiseControl;
    String leatherSeat;

    public Luxury(String type, String brand, String model, String fuelType, String regNr, int odometer, int ccm, String automaticGear, String airCondition, String cruiseControl, String leatherSeat) {
        super(type, brand, model, fuelType, regNr, odometer);
        this.ccm = ccm;
        this.automaticGear = automaticGear;
        this.airCondition = airCondition;
        this.cruiseControl = cruiseControl;
        this.leatherSeat = leatherSeat;
    }
    public String toString() {
        return (super.toString()) +
                "\nCCM: " + "\nAutomatic gear: " + automaticGear + "\nAircondition: " + airCondition + "\nCruiseControl: " + cruiseControl + "\nLeather Seat: " + leatherSeat;
    }
}
