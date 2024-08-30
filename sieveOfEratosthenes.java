import java.util.*;

public class sieveOfEratosthenes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        int[] prime = new int[n];

        for(int i=0;i<n;i++){
            if(i==0 || i==1){
                prime[i] = 0;
            }
            prime[i] = 1;
        }

        for(int i=2; i*i<n; i++){
            if(prime[i] != 0){
                for(int j=i*i; j<n; j+=i){
                    prime[j] = 0;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(prime[i]!=0){
                System.out.print(i+" ");
            }
        }
        scan.close();
    }

}
