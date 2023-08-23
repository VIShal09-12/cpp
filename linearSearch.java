
public class linearSearch{
    public static void main(String args[]){
        int arr[]= { 18, 71, 66, 43, 87, 64, 9, 101};
        int target= 87;
        int rangeStart= 1; // ques 3
        int rangeEnd = 4; // ques 3
        System.out.println(searchInRange(arr, rangeStart, rangeEnd, target)); // ques3
        // System.out.println(searchMax(arr)); 
    }
    // Ques 3: Search in a particular range: means that the search domain is fixed
    static int searchInRange(int arr[], int start, int end, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=start; i<= end; i++){
            if(target == arr[i]){
                return i;
            } 
        }
        return -1;
    }
    // Ques 4: Find the maximum number in the array
    static int searchMax(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}