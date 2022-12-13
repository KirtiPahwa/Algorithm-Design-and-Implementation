package algorithms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			int minidx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minidx]) {
					minidx=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minidx];
			arr[minidx]=temp;
		}

		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

	}


//TC-O(N2)(worst case -descending) or (average)
//Not-Stable- (4,4) so in this 4 which comes earlier will not be earlier after sorting even
//in place- sorting in original array
// N swaps at max

