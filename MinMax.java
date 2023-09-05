
import java.util.*;

// Finding min and max in an array
public class MinMax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]= new int[size];

        for(int i= 0; i<size ; i++){
            arr[i]= sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i =0 ; i<size; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("min value is " + min);
        System.out.println("max value is " + max);
        sc.close();

    }
}