
/*package lesson05.homework;
import java.util.Scanner;
public class Homework {
//    ### Задача #3
//    Заполните массив на `len` элементов (размер массива вводит пользователь) случайным целыми числами и выведете
//    максимальное, минимальное и среднее арифметическое значение элементов массива.

    public static void main(String[] args) {
        System.out.println("Введите количество эл массива");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] Arr = new int[len];
        for (int i = 0; i < len; i++) {
            Arr[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < Arr.length; ++i) {
            System.out.println(Arr[i]);
        }


        int max = Arr[0];
        for (int i = 0; i < len - 1; i++) {
            if (max < Arr[i]) {
                max = Arr[i];
            }
        }
        System.out.println("Max:" + max);
        int min = Arr[0];
        for (int i = 0; i < len - 1; i++) {
            if (min > Arr[i]) {
                min = Arr[i];
            }
        }

        System.out.println("Min: " + min);

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Arr[i];
        }
        double mid = (double) sum / len;
        System.out.println("mid:" + mid);
    }

//Дан массив целых чисел: `int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44}`. Найти максимальную сумму четырёх смежных целых
//чисел в массиве task04. Использовать алгоритм скользящего окна.
public static void main(String[] args) {
    int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44};
    int [] task04new = new int[4];
    int i, j;

//    for (int sum)
//            for (int i = 0; i < task04.lenght; i++){
//        for (int j = i + 4; j < task04.length; j++);{
//
//                    for (int sumtask04 : task04);
//                    sumtask04 += sum1;
//                    if (sumtask04 > sumtask04++)
//                System.out.println("Максимальная сумма" + "sumtask04");
//            }
//        }
//    }
}
}*/

