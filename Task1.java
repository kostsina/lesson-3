package tasks;

import java.util.Scanner;

public class Task1 {

        /*

        Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
        Вывести дату следующего дня в формате &quot;День.Месяц.Год&quot;.
        Учесть переход на следующий месяц, а также следующий год.
        Форматирование строки &quot;День.Месяц.Год&quot; вынести в отдельную функцию.

         */
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите день");
            int day = in.nextInt();
            System.out.println("Введите месяц");
            int month = in.nextInt();
            System.out.println("Введите год");
            int year = in.nextInt();
            if (! isCorrect (day, month, year)) {
                System.out.println("Неверный ввод данных");
                return;
            }
            day++;
            if (isCorrect (day, month, year)) {
                output(day, month, year);
            }
            else {
                day = 1;
                month++;
                if (isCorrect (day, month, year)) {
                    output(day, month, year);
                }
                else {
                    month = 1;
                    year++;
                    output(day, month, year);
                }
            }


        }

        public static boolean isCorrect (int day, int month, int year) {

            if (year <= 0) {
                return false;
            }

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return day > 0 && day <= 31;
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                return day > 0 && day <= 30;
            }

            if (month == 2) {
                return isLeap(year)? day > 0 && day <= 29 : day > 0 && day <= 28;
            }
            return false;
        }
        public static void output (int day, int month, int year) {
            System.out.println(day + "." + month  + "." + year);
        }
        public static boolean isLeap (int year) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                    else return false;
                }
                else return true;
            }
            else return false;
        }

}
