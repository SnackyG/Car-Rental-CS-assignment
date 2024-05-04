import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    CarHandler carHandler = new CarHandler();
    carHandler.CreateCars();
    FileHandler.updateCarArrayList(carHandler.getCars());

    //Main Switch menu
    runProgram(carHandler);

    }
    public static void runProgram(CarHandler carHandler) throws IOException {
        Scanner input = new Scanner(System.in);
        int honoluluCarRentalChoice = 0;
        while (honoluluCarRentalChoice != 3) {
            System.out.println("Honolulu Car Rental menu" +
                    "\n1. Cars \n2. Rentals \n3. For exit" + "\nIndtast nummer: ");
            honoluluCarRentalChoice = input.nextInt();
            input.nextLine();
            switch (honoluluCarRentalChoice) {
                case 1:
                    cars(carHandler, input);
                    break;
                case 2:
                    //rentals(input, rentalsHandler, contractHandler, carHandler);
                    break;
                default:
                    System.out.println();
            }
        }
    }
    public static void cars(CarHandler carHandler, Scanner input) throws IOException {
        //Switch menu
        int carMenuChoice = 0;
        while (carMenuChoice != 5) {
            System.out.println("Car menu" +
                    "\n1. Show Catalog \n2. Add car \n3. Remove car" +
                    "\n4. Change info \n5. For exit" + "\nIndtast nummer: ");
            carMenuChoice = input.nextInt();
            input.nextLine();
            switch (carMenuChoice) {
                case 1:
                    carHandler.showCars(input);
                    break;
                case 2:
                    carHandler.addCarMenu(input);
                    break;
                case 3:
                    carHandler.removeCar(input);
                    break;
                case 4:
                    //carHandler.editCar(input);
                    break;
                default:
                    System.out.println();
            }
        }
    }

}
  /*
    addCar();
    deleteCar();
    editCar();
    newContract();
    startRental();
    endRental();
    printContract(); write the contract to txt.file
    showAvailableCars();
    sortAvailableCars();-->by name & ---->by pickupDate
    writeTofile();
    readFromFile(); ->Car
    readfromfile(); ->Contracts
     */