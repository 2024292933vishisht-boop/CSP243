import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("First non-repeating character: '" + e.getKey() + "'");
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}

