package HW_6.SearchTools.FILTERS;


import HW_6.LaptopsDB.LT;


import java.util.HashSet;
import java.util.Set;

import static HW_6.SearchTools.SearchInfo.viewFilterInfo;
import static HW_6.SearchTools.SearchLT.scanner;


public class ManufFilter {

    public static boolean manufactureFilterStatus = false;
    public static String manufacturerRequest = "";
    public static Set<String> manufacturerSetString = new HashSet<>();
    public static Set<LT> manufacturerSetLaptop = new HashSet<>();
    public static void switchManufactureFilter(Set<LT> laptopFilter) {
        if (!manufactureFilterStatus) {
            manufactureFilterStatus = true;
            addManufactureSetStringFilter(laptopFilter);
            viewFilterInfo();
            System.out.println("Enter one of the suggested filters");
            manufacturerRequest = scanner.nextLine();
            addManufactureSetLaptopFilter(laptopFilter);
            manufacturerSetString.clear();

        } else {
            manufactureFilterStatus = false;
            manufacturerRequest = "";
            manufacturerSetString.clear();
            manufacturerSetLaptop.clear();
        }
    }
    private static void addManufactureSetStringFilter(Set<LT> laptopFilter) {
        for (LT laptop : laptopFilter) {
            manufacturerSetString.add(laptop.getManufacture());
        }
    }
    private static void addManufactureSetLaptopFilter(Set<LT> laptopFilter) {
        if (manufactureFilterStatus) {
            for (LT element : laptopFilter
            ) {
                if (element.getManufacture().equalsIgnoreCase(manufacturerRequest))
                    manufacturerSetLaptop.add(element);
            }
        }
    }

}
