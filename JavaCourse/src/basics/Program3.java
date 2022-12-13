/*
 * bubble sort
 * 
 * Collections.swap function just works on array list or the containers which are present in collections 
 */

package basics;
import java.util.Arrays;
import java.util.Collections;

public class Program3 {
	public static void main(String args[]) {
		int arr1[]= {13,5,24,23,2};
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
//		bubble sort
		
		int arr[]= {13,5,24,23,2};
		for(int i=0;i<arr.length-1;i++) {
			boolean swapped=false;
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					swapped=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
			}
			if(!swapped) {
				break;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		

	}

}
