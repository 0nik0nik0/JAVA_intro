package HW_3.task2;

import HW_3.task1.ProductForHW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort {

    public static ArrayList<String> strFilter(ArrayList<ProductForHW3> myProd) {
        System.out.println("Enter desirable quality grade for sort:");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        scanner.close();
        ArrayList<String> resultList = new ArrayList<>();
        Integer minPrice = Integer.MAX_VALUE;
        for (ProductForHW3 elem : myProd) {
            if (elem.quality.equals(grade)) {
                if (elem.price.equals(minPrice) && resultList.lastIndexOf(elem.name) == -1)
                    resultList.add(elem.name);
                if (elem.price < minPrice) {
                    resultList = new ArrayList<>();
                    resultList.add(elem.name);
                    minPrice = elem.price;
                }
            }
        }
        return resultList;
    }


}
