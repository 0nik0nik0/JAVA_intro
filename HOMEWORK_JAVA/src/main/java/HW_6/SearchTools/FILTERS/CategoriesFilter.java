package HW_6.SearchTools.FILTERS;


import HW_6.LaptopsDB.LT;


import java.util.HashSet;
import java.util.Set;

import static HW_6.SearchTools.SearchInfo.viewFilterInfo;
import static HW_6.SearchTools.SearchLT.scanner;

public class CategoriesFilter {

    public static boolean categoryFilterStatus = false;
    public static String categoryRequest = "";

    public static Set<String> categorySetString = new HashSet<>();

    public static Set<LT> categorySetLaptop = new HashSet<>();

    public static void switchCategoryFilter(Set<LT> laptopFilter) {
        if (!categoryFilterStatus) {
            categoryFilterStatus = true;
            addCategorySetStringFilter(laptopFilter);
            viewFilterInfo();
            System.out.println("Enter one of the suggested filters");
            categoryRequest = scanner.nextLine();
            addCategorySetLaptopFilter(laptopFilter);
            categorySetString.clear();

        } else {
            categoryFilterStatus = false;
            categoryRequest = "";
            categorySetString.clear();
            categorySetLaptop.clear();
        }
    }

    private static void addCategorySetStringFilter(Set<LT> laptopFiler) {
        for (LT laptop : laptopFiler) {
            categorySetString.add(laptop.getCategory());
        }
    }

    private static void addCategorySetLaptopFilter(Set<LT> laptopFilter) {
        if (categoryFilterStatus) {
            for (LT element : laptopFilter
            ) {
                if (element.getCategory().equalsIgnoreCase(categoryRequest))
                    categorySetLaptop.add(element);
            }
        }
    }
}

