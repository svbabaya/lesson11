/*
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

package exercise_1;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        HashMap<String, String> persons = new HashMap<>();
        persons.put("Федоров", "Владимир");
        persons.put("Щербак", "Владимир");
        persons.put("Щеголев", "Александр");
        persons.put("Щипков", "Александр");
        persons.put("Юран", "Сергей");
        persons.put("Яковлев", "Павел");
        persons.put("Янишевский", "Владимир");
        persons.put("Ярцев", "Георгий");
        persons.put("Шалимов", "Игорь");
        persons.put("Федоров", "Александр");

//        for (String s : persons.keySet()) {
//            System.out.println(s + " " + persons.get(s));
//        }

        for (Map.Entry<String, String> entry : persons.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

//        System.out.println(persons);
    }
}
