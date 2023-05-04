package HW_5.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
 * вносить все слова не нужно
 * <p>
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * Запрос: Россия
 * Ответ: Россия - 2
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)*
 */
public class Task1 {
    public static void main(String[] args) {

        String myText = "Россия идет вперед всей планеты. Планета — это не Россия.";
        Map<String, Integer> ourWords = new HashMap<>();
        String[] arr = myText.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
        System.out.println(myText);
        for (String s : arr) {
            if (ourWords.get(s.toLowerCase()) != null) {
                ourWords.put(s.toLowerCase(), ourWords.get(s.toLowerCase()) + 1);
            } else {
                ourWords.putIfAbsent(s.toLowerCase(), 1);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово для подсчета кол-ва");
        String keyWord = sc.nextLine();
        System.out.printf("Искомое слово [%s] встречается [%d] раз(а)%n", keyWord, ourWords.get(keyWord.toLowerCase()));
        sc.close();
    }
}
