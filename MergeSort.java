
import java.util.*;

public class MergeSort{
	public static void main(String args[]){
		int arr[]= {5, 4, 2, 3, 1};
		
		
		System.out.println(Arrays.toString(arr));

	}

	public static int[] sort(int arr[]){
		if(arr.length== 1){
			return arr; // when length of our element is equal to 1 just return the arr itself
		}
		int mid= arr.length/2;

		
		int left[]= sort(Arrays.copyOfRange(arr, 0, mid)); // every time making a copy of array(new array) for left half by Copy Of Range method
		int right[]= sort(Arrays.copyOfRange(arr, mid, arr.length)); // same ways amking new array for right half by same method

		return merge(left, right);
	}

	public static int[] merge(int[] first, int[] second) { // takes first and second half and merges them in sorted manner
		int mix[]= new int[first.length + second.length]; // temporary array

		int i= 0; // pointer for first array
		int j= 0; // pointer for second array
		int k= 0; // pointer for new array(mix)

		while(i< first.length && j< second.length){
			if(first[i]< second[j]){
				mix[k]= first[i];
				i++;
			}
			else{
				mix[k]= second[j];
				j++;
			}
			k++;
		}

		
		while(i< first.length){
			mix[k]= first[i];
			i++;
			k++;
		}
		
		while(j< second.length){
			mix[k]= second[j];
			j++;
			k++; 
		}
		
		return mix;
	}



	