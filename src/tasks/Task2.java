package tasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */
public class Task2 {
    private final static Map<Character, Character> openToCloseBracket = new HashMap<>();
    private final static Deque<Character> openBracketsStack = new ArrayDeque<>();

    //        map = Map.of('{', '}', '<', '>', '[', ']','(', ')');
//        map = Map.ofEntries(Map.entry('{', '}'));

    public static void main(String[] args) {
        System.out.println(isBracketsCorrect("{a+]}{(d*3)}"));
    }

    private static boolean isBracketsCorrect(String arg) {
        fill();
        for (char c : arg.toCharArray()) {
            if (openToCloseBracket.containsKey(c)) {
                openBracketsStack.add(c);
            } else if (openToCloseBracket.containsValue(c)) {
                if (openBracketsStack.isEmpty()) return false;
                char top = openBracketsStack.removeLast();
                if (openToCloseBracket.get(top) != c) return false;
            }
        }
//        if (openBracketsStack.isEmpty()) return true;
//        else return false;
        return openBracketsStack.isEmpty();
    }

    private static void fill() {
        openToCloseBracket.put('(', ')');
        openToCloseBracket.put('<', '>');
        openToCloseBracket.put('[', ']');
        openToCloseBracket.put('{', '}');
    }
}
