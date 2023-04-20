// 2) Дана последовательность целых чисел, оканчивающаяся нулем.
// Найти сумму положительных чисел, после которых следует отрицательное число.
// Пример ввода:
// 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5


package HW_1;

public class task2 {

    public static void main(String[] args) {
        System.out.printf("Ваша сумма %s", sumNum());
    }

    public static int sumNum() {
        int[] nums = new int[]{1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        int my_result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) break;
            if (nums[i] < 0) my_result += nums[i - 1];

        }
        return my_result;
    }
}