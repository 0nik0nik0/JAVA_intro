//К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        try {
            fh = new FileHandler("C:\\Users\\marin\\Desktop\\МНВ\\GB\\java\\JAVA_intro(HW)\\HW_2\\src\\main\\java\\LogFileTask4.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.info("Log started");
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("""
                Доступные операции:
                Сложение -> a + b = c
                Вычитание -> a - b = c
                Умножение - > a * b = c
                Деление -> a / b = c
                Возведение в степень -> a^b = c""");
        System.out.print("\nВведите выражение -> ");
        Scanner iScanner = new Scanner(System.in);
        String example = iScanner.nextLine();
        String answer = "Проверьте правильность ввода";

        if (example.contains("+")) {
            String[] result = example.split("\\D+");
            answer = String.valueOf((Integer.parseInt(result[0]) + Integer.parseInt(result[1])));
            logger.info(answer);
        } else if (example.contains("-")) {
            String[] result = example.split("\\D+");
            answer = String.valueOf((Integer.parseInt(result[0]) - Integer.parseInt(result[1])));
            logger.info(answer);
        } else if (example.contains("*")) {
            String[] result = example.split("\\D+");
            answer = String.valueOf((Integer.parseInt(result[0]) * Integer.parseInt(result[1])));
            logger.info(answer);
        } else if (example.contains("/")) {
            String[] result = example.split("\\D+");
            answer = String.valueOf((Double.parseDouble(result[0]) / Double.parseDouble(result[1])));
            logger.info(answer);
        } else if (example.contains("^")) {
            String[] result = example.split("\\D+");
            answer = String.valueOf(Math.pow((Integer.parseInt(result[0])), (Integer.parseInt(result[1]))));
            logger.info(answer);
        }
        System.out.println(answer);

        logger.info("Log finished");
    }
}
