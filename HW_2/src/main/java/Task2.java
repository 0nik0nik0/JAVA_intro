//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    public static void main(String[] args) {

        int[] my_array = {8, 7, 21, 124, 2, 99};
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {
            fh = new FileHandler("C:\\Users\\marin\\Desktop\\МНВ\\GB\\java\\JAVA_intro(HW)\\HW_2\\src\\main\\java\\MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.info("Log started");
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < my_array.length - 1; i++) {
                if (my_array[i] > my_array[i + 1]) {
                    isSorted = false;

                    temp = my_array[i];
                    my_array[i] = my_array[i + 1];
                    my_array[i + 1] = temp;
                    logger.info(Arrays.toString(my_array));
                }
            }
        }
        System.out.println(Arrays.toString(my_array));
        logger.info("Log finished");

    }
}