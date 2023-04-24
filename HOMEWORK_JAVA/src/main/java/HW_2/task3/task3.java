package HW_2.task3;

import java.util.Arrays;
import java.util.Random;

/**
 * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class task3 {
    public static void main(String[] args) {
        int[] myArray = generateArray(10, -11, 11);
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(indexSumInsteadNegative(myArray)));
    }

    public static int[] generateArray(int arraySize, int min, int max) {
        Random rand = new Random();
        int[] result = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            result[i] = rand.nextInt((max - min) + 1) + min;
        }
        return result;
    }

    public static int[] indexSumInsteadNegative(int[] array) {
        int[] result = new int[array.length];
        int sumNegIndexes = 0;
        int firstNegIndex = -1;
        int lastNegIndex = -1;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            if (elem < 0) {
                if (firstNegIndex < 0) firstNegIndex = i;
                lastNegIndex = i;
            }
            if ((9 < elem && elem < 100) || (-100 < elem && elem < -9)) sumNegIndexes += i;
            result[i] = elem;
        }
        if (firstNegIndex != -1) {
            for (int i = firstNegIndex; i <= lastNegIndex; i++) {
                if (result[i] < 0) result[i] = sumNegIndexes;
            }
        } else System.out.println("NO negative numbers in your array!");
        return result;
    }

}
