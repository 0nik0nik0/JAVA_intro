/**Урок 2. Почему вы не можете не использовать API
Всем привет! вот список задач на домашнее закрепление:
 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
*/

package HW_2.task1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        int sum=0;
        System.out.println("Сколько последовательных простых чисел вы хотите просуммировать?");
        int n=scan.nextInt();
        for(int i=2;;i++){
            if(myPrime(i)){
                count++;
                sum+=i;
                if(count==n)break;
            }
        }
        System.out.println("Сумма первых "+n+" простых чисел:");
        System.out.println(sum);
    }
    public static boolean myPrime (int n){
        if(n==1)return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)return false;
        return true;
    }
}