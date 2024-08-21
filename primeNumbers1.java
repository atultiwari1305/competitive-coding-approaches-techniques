import java.util.*;

public class primeNumbers1 {
    public static void main(String[] args){
        boolean isPrime= true;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n<=1){
            isPrime = false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        System.out.println(isPrime);
        scan.close();
    }
}
