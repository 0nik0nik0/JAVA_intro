package HW_6.SearchTools;

import HW_6.LaptopsDB.LT;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static HW_6.SearchTools.FILTERS.CategoriesFilter.*;
import static HW_6.SearchTools.FILTERS.ManufFilter.*;
import static HW_6.SearchTools.FILTERS.OSFilter.*;
import static HW_6.SearchTools.FILTERS.ScreenFilter.*;
import static HW_6.SearchTools.SearchInfo.viewFilterInfo;


public class SearchLT {

    public static Scanner scanner = new Scanner(System.in);

    private static void selectFilter(Set<LT> laptopFilter) {
        boolean flag = true;
        viewFilterInfo();
        while (flag) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> switchManufactureFilter(laptopFilter);
                case "2" -> switchCategoryFilter(laptopFilter);
                case "3" -> switchScreenSizeFilter(laptopFilter);
                case "4" -> switchOsFilter(laptopFilter);
                case "5" -> {
                    flag = false;
                }
                default -> {
                    System.out.println("Type correct number");
                }

            }
            viewFilterInfo();
        }
    }

    public static void addFilter(Set<LT> laptopFilter) {
        selectFilter(laptopFilter);
        showSelectedFilterValues(laptopFilter);
    }


    private static void showSelectedFilterValues(Set<LT> laptopFilter) {

        Set<LT> result = new HashSet<>(laptopFilter);
        Set<LT> temp = new HashSet<>();


        if (manufactureFilterStatus) {
            for (LT laptop : result) {
                if (laptop.getManufacture().equalsIgnoreCase(manufacturerRequest)) temp.add(laptop);
            }
            result.retainAll(temp);
            temp.clear();
        }
        if (categoryFilterStatus) {
            for (LT laptop : result) {
                if (laptop.getCategory().equalsIgnoreCase(categoryRequest)) temp.add(laptop);
            }
            result.retainAll(temp);
            temp.clear();
        }
        if (screenSizeFilterStatus) {
            for (LT laptop : result) {
                if (laptop.getScreenSize().equalsIgnoreCase(screenSizeRequest)) temp.add(laptop);
            }
            result.retainAll(temp);
            temp.clear();
        }

        if (osFilterStatus) {
            for (LT laptop : result) {
                if (laptop.getOperatingSystem().equalsIgnoreCase(osRequest)) temp.add(laptop);
            }
            result.retainAll(temp);
            temp.clear();
        }

        if (result.equals(laptopFilter)) {
            System.out.println("You didn't choose filter");
        } else {
            int i = 1;
            for (LT out : result) {
                System.out.println(i++ + ". " + out);
            }
        }


    }
}

