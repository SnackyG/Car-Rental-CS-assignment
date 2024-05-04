public class Sport extends Car{
    String manualGear;
    int hp; // >200

    public Sport(String type, String brand, String model, String fuelType, String regNr, int odometer, String manualGear, int hp){
        super(type, brand, model, fuelType, regNr, odometer);
        this.manualGear = manualGear;
        this.hp = hp;
    }
    public String toString() {
        return(super.toString()+ "\nManual Gear: " + manualGear + "\nHP: " + hp);
    }
}
