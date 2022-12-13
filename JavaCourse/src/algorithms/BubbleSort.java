package algorithms;

import java.util.Scanner;
// import java.util.Arrays;         Arrays.sort(arr); //inbuilt function to sort the array

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			boolean flag=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					flag=true;
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			if(flag==false) {
				break;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}

//TC-O(N2)

//optimized :
//TC-O(N) (best case-ascending)
// TC-O(N2)(worst case -descending) or (average)
// Stable- (4,4) so in this 4 which comes earlier will be earlier after sorting even
//in place- sorting in original array
//N*(n-1)/2 swaps