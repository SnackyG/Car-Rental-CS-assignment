import java.util.*;
import java.io.*;
public class FileHandler {

    public static void updateCarArrayList(ArrayList<Car> cars) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("cars.txt"));
        while (sc.hasNextLine()) {
            String[] carInfo = sc.nextLine().split(", ");
            if (carInfo[0].equals("Familiy") && carInfo.length >= 10) {
                Car familyCar = new Family("Family", carInfo[1], carInfo[2], carInfo[3], carInfo[4], Integer.parseInt(carInfo[5]), carInfo[6], carInfo[7], carInfo[8], Integer.parseInt(carInfo[9]));
                cars.add(familyCar);
            } else if(carInfo[0].equals("Luxury") && carInfo.length >= 11) {
                Car luxuryCar = new Luxury("Luxury", carInfo[1], carInfo[2], carInfo[3], carInfo[4], Integer.parseInt(carInfo[5]), Integer.parseInt(carInfo[6]), carInfo[7], carInfo[8], carInfo[9], carInfo[10]);
                cars.add(luxuryCar);
            } else if(carInfo[0].equals("Sport") && carInfo.length >= 8) {
                Car sportsCar = new Sport("Sport", carInfo[1], carInfo[2], carInfo[3], carInfo[4], Integer.parseInt(carInfo[5]), carInfo[6], Integer.parseInt(carInfo[7]));
                cars.add(sportsCar);
            }
        }
        sc.close();
    }



    public static void writeToCarFile(ArrayList<Car> cars) throws IOException {
        FileWriter fileW = new FileWriter(new File("cars.txt"), false);
        BufferedWriter bufferedW = new BufferedWriter(fileW);

        String carsOut = "";
        String[] sArr = new String[cars.size()];
        Arrays.fill(sArr, "");

        for(int i = 0; i< cars.size(); i++) {
            String s = String.valueOf(cars.get(i));
            String[] strArr = s.split("\n");

            switch (cars.get(i).type) {
                case "Family":
                    for (int j = 0; j < Math.min(9, strArr.length); j++) {
                        String newLastFamily = strArr[j].substring(strArr[j].indexOf(": ") + 2);
                        sArr[i] += newLastFamily + ", ";
                    }
                    carsOut += "Family, " + sArr[i] + "\n";
                    break;
                case "Luxury":
                    for(int j = 0; j < Math.min(10, strArr.length); j++) {
                        String newLastLuxury = strArr[j].substring(strArr[j].indexOf(": ") + 2);
                        sArr[i] += newLastLuxury + ", ";
                    }
                    carsOut += "Luxury, " + sArr[i] + "\n";
                    break;
                case "Sport":
                    for(int j = 0; j < Math.min(7, strArr.length); j++) {
                        String newLastSport = strArr[j].substring(strArr[j].indexOf(": ") + 2);
                        sArr[i] += newLastSport + ", ";
                    }
                    carsOut += "Sport, " + sArr[i] + "\n";
                    break;
            }
        }
        bufferedW.write(carsOut);
        bufferedW.close();
    }

}
