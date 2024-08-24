import java.util.*;

public class primeNumbers3 {
    public static void main(String args[]){
        boolean isPrime;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n<=1) isPrime = false;
        if(n<=3) isPrime = true;

        if(n%2==0 || n%3==0) isPrime = false;
        int count = 0;
        for(int i = 5; i*i<=n; i+=6){
            count++;
            if(n%i==0 || n%(i+2)==0){
                isPrime = false;
            }
        }
        isPrime = true;
        System.out.println(isPrime+" and number of iterations are: "+count);
        scan.close();
    }
}
