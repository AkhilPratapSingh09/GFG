import java.util.HashMap;
import java.util.PriorityQueue;

public class checkiffreq {
    class Solution {
    boolean sameFreq(String s) {
        // code here
 HashMap<Character, Integer> h = new HashMap<>();
        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        if (check(h)) {
            return true;
        }
        PriorityQueue<Character> q = new PriorityQueue<>((a, b) -> Integer.compare(h.get(b), h.get(a)));
        for (char c : h.keySet()) {
            q.add(c);
        }
        char maxChar = q.poll();
        h.put(maxChar, h.get(maxChar) - 1);
        if (check(h)) {
            return true;
        }
        return false;
    }

    public static boolean check(HashMap<Character, Integer> h) {
        int f = -1;
        for (int c : h.values()) {
            if (f == -1) {
                f = c;
            } else if (f != c) {
                return false;
            }
        }
        return true;
    }
}class Solution {
    boolean sameFreq(String s) {
        // code here
 HashMap<Character, Integer> h = new HashMap<>();
        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        if (check(h)) {
            return true;
        }
        PriorityQueue<Character> q = new PriorityQueue<>((a, b) -> Integer.compare(h.get(b), h.get(a)));
        for (char c : h.keySet()) {
            q.add(c);
        }
        char maxChar = q.poll();
        h.put(maxChar, h.get(maxChar) - 1);
        if (check(h)) {
            return true;
        }
        return false;
    }

    public static boolean check(HashMap<Character, Integer> h) {
        int f = -1;
        for (int c : h.values()) {
            if (f == -1) {
                f = c;
            } else if (f != c) {
                return false;
            }
        }
        return true;
    }
}
}
