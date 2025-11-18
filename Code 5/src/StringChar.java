import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        if (s.isEmpty()) {
            System.out.println("Empty string.");
            return;
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        char best = s.charAt(0);
        int bestCount = freq.get(best);

        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() > bestCount) {
                best = e.getKey();
                bestCount = e.getValue();
            }
        }

        System.out.println("Max occurring character: '" + best + "' occurred " + bestCount + " times.");
    }
}
