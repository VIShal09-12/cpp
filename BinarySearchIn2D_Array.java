
import java.util.*;

public class BinarySearchIn2D_Array {
    public static void main(String[] args) {
        int matrix[][]={{10, 16, 14, 22},
                        {15, 19, 23, 27},
                        {20, 24, 28, 32},
                        {25, 29, 33, 37}};


        int matrix2[][]={{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}};
        
        ArrayList<Integer> ans= search1(matrix, 77);
      

        System.out.println(ans.toString());
        // System.out.println(ans2.toString());
    }

    // Searching in a matrix which is row wise and colm wise independently sorted..
    public static ArrayList<Integer> search1(int arr[][], int target){
        int row=0; 
        int colm= arr[0].length -1;
        ArrayList<Integer> ans= new ArrayList<>();

        while(row< arr.length && colm>=0){
            if(arr[row][colm]== target){
                ans.add(row);
                ans.add(colm);
                return ans;
            }

            else if(arr[row][colm]> target){
                colm--;
            }
            else{
                row++;
            }
        }
        return ans;
    }

    
}
