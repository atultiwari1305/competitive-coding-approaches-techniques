import java.util.*;

public class sumOfnNaturalNo {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Sum of "+n+" natural number is: "+((n*(n+1))/2));
        scan.close();
    }
}