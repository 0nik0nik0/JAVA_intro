package HW_3.task1;

import java.util.ArrayList;

public class ProductList {
    public static ArrayList<ProductForHW3> myList () {

        ArrayList<ProductForHW3> prod = new ArrayList<>();
        prod.add(new ProductForHW3("Яйцо куриное 1", 60, 1, "Russia", 1 ));
        prod.add(new ProductForHW3("Яйцо куриное 2", 70, 3, "Russia", 1 ));
        prod.add(new ProductForHW3("Яйцо куриное «высший» 3", 80, 2, "Russia", 1 ));
        prod.add(new ProductForHW3("Яйцо куриное 4", 60, 1, "Russia", 1 ));
        prod.add(new ProductForHW3("Яйцо куриное 5", 100, 1, "Russia", 1 ));
        prod.add(new ProductForHW3("Яйцо куриное «высший» 6", 500, 1, "Russia", 1 ));
        prod.add(new ProductForHW3("Яйцо куриное 7", 600, 5, "Russia", 1 ));
    return prod;
    }

}
