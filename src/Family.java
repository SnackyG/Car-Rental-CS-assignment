public class Family extends Car{
    String manualGear;
    String airCondition;
    String cruiseControl;
    int seat;

    public Family(String type, String brand, String model, String fuelType, String regNr, int odometer,
                  String manualGear, String airCondition, String cruiseControl, int seat) {
        super(type, brand, model,fuelType, regNr, odometer);

        this.manualGear = manualGear;
        this.airCondition = airCondition;
        this.cruiseControl = cruiseControl;
        this.seat = seat;
    }
    public String toString(){
        return("brand: " + brand + "\nmodel: " + model + "\nfuel type: " + fuelType + "\nregistration: " + regNr
                + "\nodometer: " + odometer);
    }
}
