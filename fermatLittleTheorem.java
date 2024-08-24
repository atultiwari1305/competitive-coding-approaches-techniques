import java.util.Scanner;

class fermatLittleTheorem{
    public static void main(String args[]){
        int a,p;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scan.nextInt();
        System.out.println("Enter the value of p: ");
        p = scan.nextInt();

        if(Math.pow(a, (p-1)) % p == 1){
            System.out.println(p+" is a Prime Number.");
        }
        else{
            System.out.println(p+" is not a Prime Number");
        }
        scan.close();
    }
}