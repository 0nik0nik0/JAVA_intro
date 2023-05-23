package HW_6.SearchTools.FILTERS;

import HW_6.LaptopsDB.LT;

import java.util.HashSet;
import java.util.Set;

import static HW_6.SearchTools.SearchInfo.viewFilterInfo;
import static HW_6.SearchTools.SearchLT.scanner;

public class ScreenFilter {

    public static boolean screenSizeFilterStatus = false;
    public static String screenSizeRequest = "";
    public static Set<String> screenSizeSetString = new HashSet<>();
    public static Set<LT> screenSizeSetLaptop = new HashSet<>();

    public static void switchScreenSizeFilter(Set<LT> laptopFilter) {
        if (!screenSizeFilterStatus) {
            screenSizeFilterStatus = true;
            addScreenSizeSetStringFilters(laptopFilter);
            viewFilterInfo();
            System.out.println("Enter one of the suggested filters");
            screenSizeRequest = scanner.nextLine();
            addScreenSizeSetLaptopFilter(laptopFilter);
            screenSizeSetString.clear();

        } else {
            screenSizeFilterStatus = false;
            screenSizeRequest = "";
            screenSizeSetString.clear();
            screenSizeSetLaptop.clear();
        }
    }
    public static void addScreenSizeSetStringFilters(Set<LT> laptopFilter) {
        for (LT laptop : laptopFilter) {
            screenSizeSetString.add(laptop.getScreenSize());
        }
    }
    protected static void addScreenSizeSetLaptopFilter(Set<LT> laptopFilter) {
        if (screenSizeFilterStatus) {
            for (LT element : laptopFilter
            ) {
                if (element.getOperatingSystem().equalsIgnoreCase(screenSizeRequest))
                    screenSizeSetLaptop.add(element);
            }
        }
    }
}
