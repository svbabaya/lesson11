/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.
*/

package exercise_2;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> months = new HashMap<>();
        months.put("january", 1);
        months.put("february", 2);
        months.put("march", 3);
        months.put("april", 4);
        months.put("may", 5);
        months.put("june", 6);
        months.put("july", 7);
        months.put("august", 8);
        months.put("september", 9);
        months.put("october", 10);
        months.put("november", 11);
        months.put("december", 12);

        do {
            System.out.println("Введите название месяца на английском языке:");
            String str = scan.nextLine().toLowerCase();
            if (months.containsKey(str)) {
                System.out.println(changeFirstLetterToUpperCase(str) + " is the " + months.get(str) + " month");
            } else {
                System.out.println("Ошибка в названии месяца. Повторить? (y/n)");
                if (!scan.nextLine().equals("y")) break;
            }
        } while (true);

    }
    public static String changeFirstLetterToUpperCase (String str) {
        String str1 = str.substring(0, 1).toUpperCase();
        String str2 = str.substring(1);
        return str1 + str2;
    }

}
