import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        Integer sumOfLetters = a.length() + b.length();
        System.out.println(sumOfLetters);

        List<String> strings = Arrays.asList(a, b);
        strings.sort(Comparator.naturalOrder());
        if(strings.get(0).equals(a)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        String aFirstLetter = a.substring(0, 1).toUpperCase();
        String aRemainWord = a.substring(1);
        String bFirstLetter = b.substring(0, 1).toUpperCase();
        String bRemainWord = b.substring(1);

        System.out.println(aFirstLetter + aRemainWord + " " + bFirstLetter + bRemainWord);
    }
}