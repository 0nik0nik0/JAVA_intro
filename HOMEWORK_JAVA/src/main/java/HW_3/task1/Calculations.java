package HW_3.task1;

import java.util.ArrayList;

public class Calculations {
    public static int highestPrice(ArrayList<ProductForHW3> myProd) {
       int tmpMax = 0;
        for (ProductForHW3 i : myProd) {
            if ((i.quality == 1 || i.quality == 2) && i.name.contains("высший") && i.price > tmpMax) {
        tmpMax = i.price;
            }
        }
        return tmpMax;
    }
}
