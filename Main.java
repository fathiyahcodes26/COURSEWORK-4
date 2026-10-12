
/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2026-2027
 * Coursework   : 04
 * Student ID   : 5026251140
 * Full Name    : Fathiyah Putri Riyanto
 * Class        : C
 */

import java.util.*;

public class Main {

    public static Set<Integer> twice(List<Integer> list) {
        Set<Integer> result = new HashSet<Integer>();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

            if (count == 2) {
                result.add(list.get(i));
            }
        }

        return result;
    }

    public static boolean hasDuplicateValue(Map<String, String> map) {
        Set<String> values = new HashSet<String>();

        for (String value : map.values()) {
            if (values.contains(value)) {
                return true;
            }
            values.add(value);
        }

        return false;
    }

    public static boolean isPalindrome(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<Integer>();
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            int element = queue.remove();
            stack.push(element);
            queue.add(element);
        }

        boolean palindrome = true;

        for (int i = 0; i < size; i++) {
            int element = queue.remove();
            int reverse = stack.pop();

            if (element != reverse) {
                palindrome = false;
            }

            queue.add(element);
        }

        return palindrome;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(
            1, 3, 1, 4, 3, 7, -2, 0, 7, -2, -2, 1
        );

        System.out.println(twice(list));

        Map<String, String> map = new HashMap<String, String>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Meghan", "Miller");
        map.put("Hal", "Perkins");

        System.out.println(hasDuplicateValue(map));

        Queue<Integer> queue = new LinkedList<Integer>(
            Arrays.asList(3, 8, 17, 9, 17, 8, 3)
        );

        System.out.println(isPalindrome(queue));
        System.out.println(queue);
    }
}
