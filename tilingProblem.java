import java.util.Scanner;

public class tilingProblem{

    static int noOfWays(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else{
            int[] dp = new int[n + 1];

            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
    
            return dp[n];
        }
    }

    public static void main(String[] args){
        System.out.print("Enter the value of n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(noOfWays(n));
        scan.close();
    }
}
