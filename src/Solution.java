import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        String aLowerCase = a.toLowerCase();
        String bLowerCase = b.toLowerCase();

        Map<Character, Integer> letterAFrequency = new HashMap<>();

        for (int i = 0; i < aLowerCase.length(); i++) {
            if (!letterAFrequency.containsKey(aLowerCase.charAt(i))) {
                letterAFrequency.put(aLowerCase.charAt(i), 1);
            } else {
                Integer frequency = letterAFrequency.get(aLowerCase.charAt(i));
                letterAFrequency.put(aLowerCase.charAt(i), frequency+1);
            }
        }

        for (int i = 0; i < bLowerCase.length(); i++) {
            if(!letterAFrequency.containsKey(bLowerCase.charAt(i))) {
                return false;
            }
            Integer frequency = letterAFrequency.get(bLowerCase.charAt(i));
            if (frequency == 0) {
                return false;
            }
            letterAFrequency.put(bLowerCase.charAt(i), frequency-1);
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}