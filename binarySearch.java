
public class binarySearch {
   public static void main(String args[]){
    int arr[] = {-15, -11, -9, 0, 2, 5, 7, 19, 54};
    int target= 0;
    System.out.println(ascSearch(arr, target));
    int arr1[]= {44, 43, 32, 21, 9, 0, -1, -4, -11};
    int target1= 0;
    System.out.println(desSearch(arr, target));
   } 

   // return the index and -1 if it does not exist     
   //function for ascending order sorted array
   static int ascSearch(int arr[], int target){
    int start = 0;
    int end= arr.length -1;

    while(start<=end){
        // find the middle element
        // int mid = ((start+end)/2); // might be possible that start + end exceed max int value in java and might lead to error

        // therefore the better thing to do is
        int mid = start + ((end- start)/2);

        if(target < arr[mid]){
            end = mid-1; 
        }

        else if(target > arr[mid]){
            start = mid+1;
        }

        else{
            return mid;
        }

    }
    return -1;
   }

//    // function for descending order sorted array
    static int desSearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + ((end - start)/2);
            if(target< arr[mid]){
                start = mid+1;
            }
            else if(target>arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

