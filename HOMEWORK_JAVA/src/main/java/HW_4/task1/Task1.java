package HW_4.task1;


import java.util.Random;


/**
 * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Task1 {
    public static void main(String[] args) {
        ListNode newList = generateList(5, 1, 9);
        printNodeList(newList);
        printNodeList(reverseList(newList));
    }


    public static ListNode reverseList(ListNode head) {
        ListNode x = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = x;
            x = current;
            current = temp;
        }
        return x;

    }

    public static int[] generateNumbersArray(int arraySize, int min, int max) {
        Random rand = new Random();
        int[] result = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            result[i] = rand.nextInt((max - min) + 1) + min;
        }
        return result;
    }

    public static ListNode generateList(int size, int min, int max) {
        ListNode head = null;
        ListNode current = new ListNode();
        for (int number : generateNumbersArray(size, min, max)) {
            if (head == null) {
                head = new ListNode(number);
                current = head;
            } else {
                current.next = new ListNode(number);
                current = current.next;
            }
        }
        return head;
    }

    public static void printNodeList(ListNode head) {
        ListNode current;
        if (head == null) {
            System.out.println("empty list");
        }
        current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.val);
            }
            else System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println();
    }
}
