import java.util.*;

public class sumOfArray {

    public static void findSubsetSums(int[] arr, int index, int currentSum, List<Integer> result) {
        if (index == arr.length) {
            result.add(currentSum);
            return;
        }

        findSubsetSums(arr, index + 1, currentSum + arr[index], result);
        findSubsetSums(arr, index + 1, currentSum, result);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        List<Integer> result = new ArrayList<>();

        findSubsetSums(arr, 0, 0, result);
        Collections.sort(result);
        System.out.println("Subset sums: " + result);
    }
}
