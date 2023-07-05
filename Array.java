
// import java.util.*;

// public class Array {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int numbers[] = new int[size];
        
//         for(int i= 0; i<size ; i++){
//             numbers[i]= sc.nextInt();
//         }

//         for(int i =0; i<size; i++){
//             System.out.print(numbers[i] + " ");
//         }

//         System.out.println();
//         System.out.println(Arrays.toString(numbers)); // another way to print the array it can be done by toString function. It also prints the array in same way 

//         sc.close();
//     }
// }

// Inputing the 'names'(String) in an array..

// import java.util.*;

// public class Array {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String names[]= new String[size];
        
//         for(int i=0; i<size; i++){
//             names[i]= sc.next();
//         }
//         for(int i = 0; i<size; i++){
//             System.out.println(names[i]);
//         }
//         sc.close();
//     }
// }

public class Array {
    
    public static void change(int input[]){ 
    input = new int[5]; 
    input[0] = 15;
    }

    public static void main(String args[]){
        int arr[] = new int[5];
        change(arr);
        System.out.println("output is "+arr[0]); 
    }
}
