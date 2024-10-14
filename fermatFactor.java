public class fermatFactor {

    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static int[] fermatTh(int num){
        int[] factors = new int[2];
        int x,y=1;
        while(true){
            int n = num + (y*y);
            x = (int)Math.sqrt(n);
            if((x*x) == n){
                break;
            }
            y++;
        }
        factors[0] = x+y;
        factors[1] = x-y;
        return factors;
    }

    public static void main(String[] args){
        int num = 187;
        int[] primeFactors = new int[2];
        primeFactors = fermatTh(num);
        for(int i=0;i<2;i++){
            System.out.println(primeFactors[i]);
        }
    }
}
