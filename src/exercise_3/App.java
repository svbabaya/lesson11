/*
Задача: Программа определяет, какая семья (фамилия) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон
Пример вывода:
Абрамовичи

public static void main(String[] args) throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

Map<String, String> map = new HashMap<>();
while (true) {
String city = reader.readLine();
if (city.isEmpty()) {
break;
}
String family = reader.readLine();

map.put(city, family);
}

String city = reader.readLine();

if (map.containsKey(city)) {
String familyName = map.get(city);
System.out.println(familyName);
}
}
*/
package exercise_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();


        while (true) {
            System.out.println("Введите название города, либо нажмите Enter для перехода к следующему шагу:");
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            System.out.println("Введите фамилию:");
            String family = reader.readLine();
            map.put(city, family);
        }

        System.out.println("Введите название города для поиска фамилии:");
        String city = reader.readLine();

        if (map.containsKey(city)) {
            String familyName = map.get(city);
            System.out.println(familyName);
        }
    }
}
