
package HW_2.task2;


/** 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class task2 {
    public static void main(String[] args) {
        System.out.println(isOrdered(2, 4, 8, 16, 32));
        System.out.println(isOrdered(1, 2, 1, 5, 8, 13));
        System.out.println(isOrdered(7, 7, 5, 3, 3, 1));
        System.out.println(isOrdered(5, 5, 5, 5, 5));
        System.out.println(isOrdered(3, 5, 2, 9, 11));
    }

    public static boolean isOrdered(int... input) {
        boolean increasing = true;
        for (int i = 1; i < input.length && increasing; i++) {
            if (input[i] <= input[i-1]) increasing =  false; //todo надо убрать "=" если считать что последовательность состоящая из одного и того же числа является возрастающей

        }
        return increasing;

    }

}





