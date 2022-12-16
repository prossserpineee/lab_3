import java.util.Arrays;
import java.util.Scanner;
class lab3_1 {
    public static void main(String[] args){
        System.out.println("Введите элементы массива");
        int i = 0;
        Scanner in = new Scanner(System.in);
        float[] null_array = new float[100];
        while (!in.hasNext("quit")) {
            while (true) {
                if (in.hasNextFloat()) {
                    float n = in.nextFloat();
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
        in.close();
        float[] array = new float[i];
        array = Arrays.copyOfRange(null_array, 0, i);
        System.out.println("Исходный массив");
        for (float elem : array) System.out.print(elem + " ");
        float[] res_array = Arrays.copyOfRange(null_array, 0, i);
        for(int k = 1; k < i + 1; k++){
            float sum = 0;
            for (int j = 0; j < k; j++){
                sum += array[j];
            }
            res_array[k-1] = sum / k;
        }

        System.out.println("\nМассив после обработки");
        for (float elem : res_array) System.out.print(elem + " ");

    }

}