import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lab_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введитe массив: ");
        int i = 0;
        int[] null_array = new int[100];
        while (!in.hasNext("quit")) {
            while (true) {
                if (in.hasNextInt()) {
                    int n = in.nextInt();
                    null_array[i] = n;
                    i++;
                }
                else if (!in.hasNext("quit")) {
                    System.out.print("Ошибка. Вы ввели не число, повторите ввод: ");
                    in.next();
                }

                else break;

            }
        }
        int[] array = Arrays.copyOfRange(null_array, 0, i);
        System.out.print("Число к удалению: ");
        while(!in.hasNextInt()) {
            System.out.println("Введите целое число");
            in.next();
        }
        int delete_x = in.nextInt();
        in.close();
        int count = 0;
        for (int j : array) {
            if (j == delete_x) {
                count++;
            }
        }
        int[] x_array = new int[array.length - count];
        int count1 = 0;
        for (int k = 0; k < array.length; k++){
            if (array[k] == delete_x){
                count1++;
            }
            else{
                x_array[k - count1] = array[k];
            }
        }
        System.out.println();
        System.out.println("Массив после обработки:");
        for (int elem : x_array) {
            System.out.print(elem + " ");
        }
    }
}


