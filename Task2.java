package tasks;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task2 {

    /*
    Написать программу, вычисляющую корни квадратного уравнения
вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
данные.
    Учитывать только реальные корни (в случае отрицательного
дискриминанта выводить сообщение пользователю).
    При решении создать и использовать следующие вынесенные
функции:
    - функция isPositive, определяющая, является ли число
положительным
    - функция isZero, определяющая, является ли число нулём
    - функция discriminant, вычисляющая дискриминант
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число a");
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();
        System.out.println("Введите число c");
        int c = in.nextInt();

        double d = discriminant(a, b, c);

        if (isPositive(d)) {
            double x1 = (-b + sqrt(d)) / (2* a);
            double x2 = (-b - sqrt(d)) / (2* a);
            System.out.println(x1 +", " + x2);
        }
        else if (isZero(d)) {
            double x = (-b) / (2 * a);
            System.out.println(x);
        }
        else {
            System.out.println("Дискриминант меньше нуля. Нет действительных корней.");
        }

    }

    public static double discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static boolean isPositive (double d) {
        return d > 0;
    }

    public static boolean isZero (double d) {
        return d == 0;
    }


}
