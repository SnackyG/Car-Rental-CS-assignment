public class Car {
        //Attributes:
        String type;
        String brand;
        String model;
        String fuelType;
        String regNr;
        int odometer;

        public Car (String type, String brand, String model, String fuelType, String regNr, int odometer) {
                this.type = type;
                this.brand = brand;
                this.model = model;
                this.fuelType = fuelType;
                this.regNr = regNr;
                this.odometer = odometer;
        }

        public String toString() {
                return type + "Brand: " + brand + "Model: " + model + "FuelType: " +
                        fuelType + "Registration number: " + regNr + "Odometer: " + odometer;
        }
        public String getType() {
                return type;
        }
        public void setType(String type) {
                this.type = type;
        }

        public String getBrand() {
                return brand;
        }
        public void setBrand(String brand) {
                this.brand = brand;
        }

        public String getModel() {
                return model;
        }
        public void setModel(String model) {
                this.model = model;
        }

        public String getFuelType() {
                return fuelType;
        }
        public void setFuelType(String fuelType) {
                this.fuelType = fuelType;
        }

        public String getRegistration() {
                return regNr;
        }
        public void setRegistration(String registration) {
                this.regNr = registration;
        }


        public int getOdometer() {
                return odometer;
        }
        public void setOdometer(int odometer) {
                this.odometer = odometer;
        }
}
