import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String[] splitWord = a.split("");

        boolean isPalindrome = true;

        for(int i=0; i<splitWord.length; i++) {
            if (!splitWord[i].equals(splitWord[splitWord.length - i - 1])) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Yes" : "No");
    }
}
