package HW_5.task2;

import java.util.*;

/**
 * 2) Пусть дан список сотрудников:
 * Иван Иванов
 * Светлана Петрова
 * Кристина Белова
 * Анна Мусина
 * Анна Крутова
 * Иван Юрин
 * Петр Лыков
 * Павел Чернов
 * Петр Чернышов
 * Мария Федорова
 * Марина Светлова
 * Мария Савина
 * Мария Рыкова
 * Марина Лугова
 * Анна Владимирова
 * Иван Мечников
 * Петр Петин
 * Иван Ежов
 * <p>
 * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> staff = Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов");

        Map<String, Integer> counts = new HashMap<>();

        for (String name : staff) {
            String firstName = name.split(" ")[0];
            counts.put(firstName, counts.getOrDefault(firstName, 0) + 1);
        }

        List<Map.Entry<String, Integer>> repetitionsSort = new ArrayList<>(counts.entrySet());
        repetitionsSort.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        System.out.println("Повторяющиеся имена:");
        for (Map.Entry<String, Integer> entry : repetitionsSort) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
            }
        }
    }
}
