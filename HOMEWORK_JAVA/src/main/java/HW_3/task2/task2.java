/**2. Сведения о товаре состоят из наименования, страны-производителя,
 веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
*/

package HW_3.task2;

import HW_3.task1.ProductForHW3;
import HW_3.task1.ProductList;

public class task2 {
    public static void main(String[] args) {
        System.out.printf("Name of the product with the lowest price in your grade:" + Sort.strFilter(ProductList.myList())) ;
    }
}
