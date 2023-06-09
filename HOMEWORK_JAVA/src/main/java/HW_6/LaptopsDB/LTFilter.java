package HW_6.LaptopsDB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class LTFilter {

    public static Set<LT> laptopFilter = new HashSet<>();

    public static void fillLaptopSetFromCSV(String pathFile) {
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                String brand = data[0];
                String model = data[1];
                String category = data[2];
                String screenSize = data[3];
                String screen = data[4];
                String cpu = data[5];
                String ram = data[6];
                String storage = data[7];
                String gpu = data[8];
                String operatingSystem = data[9];
                String operatingSystemVersion = data[10];
                String weight = data[11];
                String price = data[12];

                LT laptop = new LT(brand, model, category, screenSize, screen, cpu, ram, storage, gpu, operatingSystem, operatingSystemVersion, weight, price);
                laptop.setOperatingSystem(operatingSystem);

                laptopFilter.add(laptop);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}