import java.util.*;

public class segmentedSieve {

    static int[] sieve(int n){
        int[] prime = new int[n];
        prime[0] = prime[1] = 0;
        for(int i=2;i<n;i++){
            prime[i] = 1;
        }
        for(int i=2; i*i<n; i++){
            if(prime[i] != 0){
                for(int j=i*i; j<n; j+=i){
                    prime[j] = 0;
                }
            }
        }
        return prime;    
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int l = scan.nextInt();
        int r = scan.nextInt();
        int sq = (int)Math.sqrt(r);

        int[] segArr = new int[sq+1];
        int n = r-l+1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = 1;
        }

        segArr = sieve(sq+1);

        //Adding all primes in arrayList
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=2;i<segArr.length;i++){
            if(segArr[i]==1){
                primes.add(i);
            }
        }

        for(int p : primes){
            int start = Math.max(p*p, (l+p-1)/p*p);
            for(int j=start;j<=r;j+=p){
                arr[j-l] = 0;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                System.out.print(i+l+" ");
            }
        }
        scan.close();
    }
}
