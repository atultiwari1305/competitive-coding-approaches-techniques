public class recursion {

    static void func(int n){
        if(n>2){
            func(n-1);
            func(n-2);
            func(n-3);
        }
        System.out.println(n);
    }

    public static void main(String[] args){
        func(5);
    }
}
