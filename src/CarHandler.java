import java.util.*;
import java.io.*;
public class CarHandler {
    private ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> CreateCars() {
        //Super constructor (String type, String brand, String model, String fuelType, String regNr, int odometer
        ////FamilyCar specs (manual gear, air condition, cruise control, 7 seats or more)
        Car Opel = new Family("Family", "Opel ", "Omega", "Diesel", "AB12345", 200000, "Yes", "Yes", "Yes", 7);
        cars.add(Opel);

        Car Mazda = new Family("Family", "Mazda ", "CX-80", "Petrol", "AD42345", 200000, "Yes", "Yes", "Yes", 7);
        cars.add(Mazda);

        Car Kia = new Family("Family", "Kia ", "Niro", "Petrol", "AD72325", 200000, "Yes", "Yes", "Yes", 7);
        cars.add(Kia);

        Car Skoda = new Family("Family", "Skoda ", "Superb", "Petrol", "GD92315", 200000, "Yes", "Yes", "Yes", 7);
        cars.add(Skoda);

        //Super constructor (String type, String brand, String model, String fuelType, String regNr, int odometer
        //LuxuryCar specs (>3000 ccm, automatic gear, air condition, cruise control, leather seats)
        Car BMW = new Luxury("Luxury","BMW ", "X5", "Petrol", "EF75321", 1000000, 3500, "Yes", "Yes", "Yes", "Yes");
        cars.add(BMW);

        Car Audi = new Luxury("Luxury","Audi ", "A8", "Petrol", "EJ73626", 1000000, 4000, "Yes", "Yes", "Yes", "Yes");
        cars.add(Audi);

        Car RollsRoyce = new Luxury("Luxury","RollsRoyce ", "Phantom", "Petrol", "HI99111", 1000000, 5000, "Yes", "Yes", "Yes", "Yes");
        cars.add(RollsRoyce);

        Car BMW1 = new Luxury ("Luxurycar", "BMW ", "X6", "Petrol", "AB12350", 60000, 5000, "Automatic", "Yes", "Yes", "Yes");
        cars.add(BMW1);

        //Super constructor (String type, String brand, String model, String fuelType, String regNr, int odometer
        //SportsCar specs (manual gear, > 200 hp)
        Car ferrari = new Sport ("Sport", "Ferrari ", "F40", "Petrol", "AB12353", 90000, "Manual", 300);
        cars.add(ferrari);

        Car lamborghini = new Sport ("Sport", "Lamborghini ", "Aventador", "Petrol", "AB12354", 100000, "Manual", 400);
        cars.add(lamborghini);

        Car porsche = new Sport ("Sport", "Porsche ", "911", "Petrol", "AB12355", 110000, "Manual", 250);
        cars.add(porsche);

        Car mclaren = new Sport ("Sport", "McLaren ", "GTS", "Petrol", "AB12356", 120000, "Manual", 300);
        cars.add(mclaren);

        return cars;
    }
    public void showCars(Scanner input) {
        System.out.println("1.  Show all cars \n" +
                "2.  Show all family cars \n" +
                "3.  Show all luxury cars \n" +
                "4.  Show all sports cars \n" +
                "5.  Exit");
        int showType = input.nextInt();
        switch (showType) {
            case 1:
                //Show all cars
                for (Car s : cars) {
                    System.out.println(s + "\n**************************************************");
                }
                break;
            case 2:
                showCarType("Family");
                break;
            case 3:
                showCarType("Luxury");
                break;
            case 4:
                showCarType("Sport");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public void showCarType(String carType) {
        int tempI = 1;
        for (Car s : cars) {
            if (s.type.equals(carType)) {
                System.out.printf("Nr: %-2d: %s %s \n", tempI, s.brand, s.model);
                tempI++;
            }
        }
    }
    public void addCarMenu(Scanner input) throws IOException{
        System.out.println("1.  Add a family car \n" +
                "2.  Add a luxury car \n" +
                "3.  Add a sports car \n" +
                "4.  Update a car");
        int addType = input.nextInt();
        switch (addType) {
            case 1:
                addFamily(input);
                break;
            case 2:
                addLuxury(input);
                break;
            case 3:
                addSport(input);
                break;
            case 4:
                FileHandler.updateCarArrayList(cars);
                break;

            default:
                System.out.println("Invalid choice");
        }
        FileHandler.writeToCarFile(cars);
    }
    public ArrayList<Car> addFamily(Scanner input) {
        System.out.println("Enter car brand: ");
        String brand = input.next();
        System.out.println("Enter model: ");
        String model = input.next();
        System.out.println("Enter fuel type: ");
        String fuelType = input.next();
        System.out.println("Enter registration: ");
        String registration = input.next();
        System.out.println("Enter odometer: ");
        int odometer = input.nextInt();
        System.out.println("Enter manual gear (Yes/No): ");
        String manualGear = input.next();
        System.out.println("Enter air condition (Yes/No): ");
        String airCondition = input.next();
        System.out.println("Enter cruise control (Yes/No): ");
        String cruiseControl = input.next();
        System.out.println("Enter how many seats (Min. 7): ");
        int seat = input.nextInt();
        while (seat < 7) {
            System.out.println("Invalid number of seats" + "\nEnter how many seats (Min. 7): ");
            seat = input.nextInt();
        }
        Car familyCar = new Family("Family", brand, model, fuelType, registration, odometer, manualGear, airCondition, cruiseControl, seat);
        cars.add(familyCar);
        return cars;
    }
    public ArrayList<Car> addLuxury(Scanner input) {
        System.out.println("Enter car brand: ");
        String brand = input.nextLine();
        System.out.println("Enter model: ");
        String model = input.nextLine();
        System.out.println("Enter fuel type: ");
        String fuelType = input.next();
        System.out.println("Enter registration: ");
        String registration = input.next();
        System.out.println("Enter odometer: ");
        int odometer = input.nextInt();
        System.out.println("Enter ccm: ");
        int ccm = input.nextInt();
        System.out.println("Enter automatic gear (Yes/No): ");
        String automaticGear = input.next();
        System.out.println("Enter air condition (Yes/No): ");
        String airCondition = input.next();
        System.out.println("Enter cruise control (Yes/No): ");
        String cruiseControl = input.next();
        System.out.println("Enter leather seat type: ");
        String leatherSeat = input.nextLine();
        Car luxuryCar = new Luxury("Luxury", brand, model, fuelType, registration, odometer, ccm, automaticGear, airCondition, cruiseControl, leatherSeat);
        cars.add(luxuryCar);
        return cars;
    }

    public ArrayList<Car> addSport(Scanner input) {
        System.out.println("Enter car brand: ");
        String brand = input.next();
        System.out.println("Enter model: ");
        String model = input.next();
        System.out.println("Enter fuel type: ");
        String fuelType = input.next();
        System.out.println("Enter registration: ");
        String registration = input.next();
        System.out.println("Enter odometer: ");
        int odometer = input.nextInt();
        System.out.println("Enter manual gear (Yes/No): ");
        String manualGear = input.next();
        System.out.println("Enter hp (horse power): ");
        int hp = input.nextInt();
        Car sportCar = new Sport("Sport", brand, model, fuelType, registration, odometer, manualGear, hp);
        cars.add(sportCar);
        return cars;
    }
    public void removeCar(Scanner input) throws IOException {
        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("Nr. %-2d: %s %s \n", (i + 1), cars.get(i).brand, cars.get(i).model);
        }
        System.out.println("Enter corresponding number for removing: ");
        int removeChoice = input.nextInt();
        cars.remove(removeChoice - 1);
        FileHandler.writeToCarFile(cars);
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
