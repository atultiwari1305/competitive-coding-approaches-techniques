import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayPermutation {

    public static void permute(List<Integer> current, List<Integer> remaining, List<List<Integer>> result) {
        if (remaining.isEmpty()) {
            result.add(new ArrayList<>(current));
        }
        else{
            for (int i = 0; i < remaining.size(); i++) {

                List<Integer> newCurrent = new ArrayList<>(current);
                List<Integer> newRemaining = new ArrayList<>(remaining);

                current.add(remaining.get(i));
                remaining.remove(i);
                
                permute(newCurrent, newRemaining, result);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        
        List<Integer> arr = new ArrayList<>();
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        List<List<Integer>> result = new ArrayList<>();

        permute(new ArrayList<>(), arr, result);

        System.out.println("Permutations of the array: ");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }

        scan.close();
    }
}
