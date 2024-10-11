import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class happyNumber {

    static boolean happyNum(int n, Set<Integer> num){
        if(n==1){
            return true;
        }
        if(num.contains(n)){
            return false;
        }
        num.add(n);
        int sum = 0;
        while(n>0){
            sum += ((n%10)*(n%10));
            n/=10;
        }
        return happyNum(sum, num);
    }

    public static void main(String[] args){
        Set<Integer> num = new HashSet<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();

        System.out.println(happyNum(n, num));
        Iterator<Integer> itr = num.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        scan.close();
    }
}
