/*Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень
*/

package exercise_4;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> whoIsWho = new HashMap<>();
        whoIsWho.put("арбуз", "ягода");
        whoIsWho.put("банан", "трава");
        whoIsWho.put("вишня", "ягода");
        whoIsWho.put("груша", "фрукт");
        whoIsWho.put("дыня", "овощ");
        whoIsWho.put("ежевика", "куст");
        whoIsWho.put("жень-шень", "корень");
        whoIsWho.put("земляника", "ягода");
        whoIsWho.put("ирис", "цветок");
        whoIsWho.put("картофель", "клубень");

        for (Map.Entry<String, String> entry : whoIsWho.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}
