package lesson04;

import java.util.Random;
import java.util.Scanner;

public class Homework04 {


    public static void main(String[] args) throws InterruptedException {
        task02();
    }

    /*Программа загадывает число в диапазоне [1;9]
        Пользователь вводит число с клавиатуры
        Программа в зависимости от введенного числа выводит в консоль следующее:
        "загаданное число больше"
        "загаданное число меньше"
        "Вы угадали" (программа завершает работу)
        Если введен 0, вывести "выход из программы" (программа завершает работу)*/
    public static void task01() {
        Random numberRandom = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = numberRandom.nextInt(1, 9);
        int scannerNumber = scanner.nextInt();
        while (true) {
            if (scannerNumber > number) {
                System.out.println("Загаданное число меньше");
                scannerNumber = scanner.nextInt();
            } else if (scannerNumber < number) {
                System.out.println("Загаданное число больше");
                scannerNumber = scanner.nextInt();
            } else {
                System.out.println("Вы угадали");
                break;
            }
        }
    }

    /* Пользователь загадывает число в диапазоне от [1 до 100].
Пользователь загадывает в уме, программа не хранит это число, а пытается его угадать.
Программа пытается его угадать (вместо обычного перебора постарайтесь
использовать метод бинарного поиска, т.е деление отрезка на 2, пока число не будет найдено).
Программа может задавать пользователю вопросы:
Число равно ...?, Число больше ...? и, в зависимости от ответа пользователя, принимать решения.
Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
Для вывода текста и значения переменной используйте оператор сложения,
например System.out.println("Число равно " + number);
середина отрезка: a = 1, b = 100; mid = (a + b) / 2;*/

    public static void task02() throws InterruptedException {
        System.out.println("Загадайте число");
        int mid;
        Scanner scanner = new Scanner(System.in);
        Random numberRandom = new Random();
        int number = numberRandom.nextInt(1, 100);
        Thread.sleep(5000);
        System.out.println("Число равно " + number + "?");
        int scannerNumber;
        while ((scannerNumber = scanner.nextInt()) != 1){
                if (scannerNumber == 0) {
                number = (number + number)/ 2;
                System.out.println("Число равно " + number);
                //else (scannerNumber == 0);
            }
        }

    }
}


