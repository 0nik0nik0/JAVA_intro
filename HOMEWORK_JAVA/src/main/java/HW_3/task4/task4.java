/**
 * 4. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */

package HW_3.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        List<Integer> numbers = myList(20, 10, 100);
        System.out.println(numbers);
        getMiddleMinMax(numbers);
    }
    private static void getMiddleMinMax(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0d;
        for (Integer number : numbers) {
            if (number > max) max = number;
            if (number < min) min = number;
            sum += number;
        }
        double average = sum / numbers.size();
        System.out.printf("Min value = %d\n", Collections.min(numbers));
        System.out.printf("Max value = %d\n", Collections.max(numbers));
        System.out.printf("Middle = %.0f / %d =  %.2f\n", sum, numbers.size(), average);
    }
    public static List<Integer> myList(int size, int min, int max) {
        List<Integer> result = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            result.add(rand.nextInt((max - min) + 1) + min);
        }
        return result;
    }

}
