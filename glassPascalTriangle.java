import java.util.Scanner;

public class glassPascalTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int r = scan.nextInt();
        int c = scan.nextInt();
        double[][] glass = new double[k][k];
        glass[0][0] = k;
        for(int i=0;i<k;i++){
            for(int j=0;j<=i;j++){
                if(glass[i][j]>1.0){
                    double leftwater = glass[i][j] - 1.0;
                    glass[i][j] = 1.0;
                    glass[i+1][j] += leftwater/2.0;
                    glass[i+1][j+1] += leftwater/2.0;
                }
            }
        }
        System.out.println(glass[r][c]);
        scan.close();
    }
}
