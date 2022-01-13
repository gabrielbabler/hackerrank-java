import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        int n = in.nextInt();

        for(int i=0; i<n; i++) {
            numbers.add(in.nextInt());
        }

        int q = in.nextInt();

        for(int i=0; i<q; i++) {
            if(in.next().equalsIgnoreCase("insert")) {
                numbers.add(in.nextInt(), in.nextInt());
            } else {
                numbers.remove(in.nextInt());
            }
        }

        String collect = numbers.stream().map(number -> number + " ").collect(Collectors.joining());
        System.out.println(collect);
    }
}