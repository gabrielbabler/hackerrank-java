import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.size() - 2; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                result.add(sum);
            }
        }
        return result.stream().max(Comparator.comparingInt(Integer::intValue)).get();
    }
}