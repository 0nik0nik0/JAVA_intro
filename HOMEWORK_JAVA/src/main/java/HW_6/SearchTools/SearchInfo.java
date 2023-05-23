package HW_6.SearchTools;

import static HW_6.SearchTools.FILTERS.CategoriesFilter.*;
import static HW_6.SearchTools.FILTERS.ManufFilter.*;
import static HW_6.SearchTools.FILTERS.OSFilter.*;
import static HW_6.SearchTools.FILTERS.ScreenFilter.*;

public class SearchInfo extends SearchLT {


    public static void viewFilterInfo() {
        String message = "Write the desired filter to the console\n";
        System.out.println("Select number filter\n" +

                (manufactureFilterStatus ? "☑" : "☐") + " 1. Manufacturer (" + manufacturerRequest + ")\n" +
                (!manufacturerSetString.isEmpty() ? message + manufacturerSetString + '\n' : "") +

                (categoryFilterStatus ? "☑" : "☐") + " 2. Category (" + categoryRequest + ")\n" +
                (!categorySetString.isEmpty() ? message + categorySetString + '\n' : "") +

                (screenSizeFilterStatus ? "☑" : "☐") + " 3. ScreenSize (" + screenSizeRequest + ")\n" +
                (!screenSizeSetString.isEmpty() ? message + screenSizeSetString + '\n' : "") +

                (osFilterStatus ? "☑" : "☐") + " 4. OS (" + osRequest + ")\n" +
                (!osSetString.isEmpty() ? message + osSetString + '\n' : "") +

                "✖ 5. Confirm!");

    }
}
