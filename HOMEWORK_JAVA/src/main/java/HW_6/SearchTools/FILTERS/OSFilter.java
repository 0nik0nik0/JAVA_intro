package HW_6.SearchTools.FILTERS;

import HW_6.LaptopsDB.LT;
import HW_6.SearchTools.SearchLT;

import java.util.HashSet;
import java.util.Set;

import static HW_6.SearchTools.SearchInfo.viewFilterInfo;


public class OSFilter extends SearchLT {

    public static boolean osFilterStatus = false;

    public static String osRequest = "";

    public static Set<String> osSetString = new HashSet<>();

    public static Set<LT> osSetLaptop = new HashSet<>();

    public static void switchOsFilter(Set<LT> laptopFilter) {
        if (!osFilterStatus) {
            osFilterStatus = true;
            addOsSetStringFilter(laptopFilter);
            viewFilterInfo();
            System.out.println("Enter one of the suggested filters");
            osRequest = scanner.nextLine();
            addOsSetLaptopFilter(laptopFilter);
            osSetString.clear();

        } else {
            osFilterStatus = false;
            osRequest = "";
            osSetString.clear();
            osSetLaptop.clear();
        }
    }

    public static void addOsSetStringFilter(Set<LT> laptopFilter) {
        for (LT laptop : laptopFilter) {
            osSetString.add(laptop.getOperatingSystem());
        }
    }
    protected static void addOsSetLaptopFilter(Set<LT> laptopFilter) {
        if (osFilterStatus) {
            for (LT element : laptopFilter
            ) {
                if (element.getOperatingSystem().equalsIgnoreCase(osRequest))
                    osSetLaptop.add(element);
            }
        }
    }


}
