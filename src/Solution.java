import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.List<String> substrings = new java.util.ArrayList<>();

        int i = 0;
        do {
            String substring = s.substring(i, k + i);
            substrings.add(substring);
            i++;
        } while (s.length() >= k + i);

        substrings.sort(java.util.Comparator.naturalOrder());

        smallest = substrings.get(0);
        largest = substrings.get(substrings.size() - 1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
