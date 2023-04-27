


package HW_3.task1;

import java.util.ArrayList;

import static HW_3.task1.Calculations.highestPrice;
import static HW_3.task1.ProductList.myList;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену
 * товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Task1 {
    public static void main(String[] args) {


        System.out.printf("The highest price of the product in 1&2 quality grade " +
                "which contains «высший» is :\n" + highestPrice(myList()));
    }
}


