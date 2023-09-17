
import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = 4;
        
        pattern10(n);
        sc.close();
    }
  

    
    public static void pattern9(int n){
        n=2*n;
        for(int i=0; i<= n; i++){
            for(int j=0; j<= n; j++){
                int values= Math.min(i, Math.min(j, Math.min(n-i, n-j)));
                System.out.print(values);
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){
        int originalN= n;
        n= 2*n;
        for(int i=0; i<=n; i++){
            for(int j=0; j<= n; j++){
                int values= originalN- Math.min(Math.min(i, j), Math.min(n-i, n-j));
                System.out.print(values+ " ");
            }
            System.out.println();
        }
    }
}
