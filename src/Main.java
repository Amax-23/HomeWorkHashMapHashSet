import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        String item = "Lorem ipsum dolor sit amet, consectetur adipiscing" +
                " elit, sed do eiusmod tempor incididunt ut labore et dolore" +
                " magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation" +
                " ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis" +
                " aute irure dolor in reprehenderit in voluptate velit esse cillum" +
                " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat" +
                " non proident, sunt in culpa qui officia deserunt mollit anim id " +
                "est laborum.";
        String symbol = item.replaceAll("\\W+", ""); // удаляем все что не буквы
        System.out.println("Общее количество букв в строке, без" +
                " пробелов и знаков пунктуации - " + symbol.length() + " шт.");
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < symbol.length(); i++) {
            char litter;
            litter = symbol.charAt(i);
            if (!map.containsKey(litter)) {
                map.put(litter, 1);
            } else {
                map.put(litter, (map.get(litter) + 1));
            }
        }

        System.out.println("Полный список букв и их количества: \n" + map);
        System.out.println("Максимальное количество одинаковой буквы: " + max(map) + " шт.");
        System.out.println("Минимальное количество одинаковой буквы: " + min(map) + " шт.");
    }

    public static int max(Map<Character, Integer> map) {
        int max = 1;//по смыслу задачи каждая буква присутствует 1 раз в строке точно
        for (Character key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int min(Map<Character, Integer> map) {
        int min = 1;//по смыслу задачи каждая буква присутствует 1 раз в строке точно
        for (Character key : map.keySet()) {
            int value = map.get(key);
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

}