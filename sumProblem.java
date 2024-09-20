import java.util.*;

public class sumProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int ind, nSum=0;
        for(ind=0;ind<n;ind++){
            nSum+=arr[ind];
            if(nSum > (sum-nSum)) break;
        }
        System.out.println(ind);
    }
}