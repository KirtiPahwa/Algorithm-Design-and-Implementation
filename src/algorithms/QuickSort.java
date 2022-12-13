package algorithms;

import java.util.Scanner;

public class QuickSort {
	public static void swap(int arr[],int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static int partition(int arr[],int l,int h) {
		int pivot=arr[h];
		int i=l-1;
		for(int j=l;j<h;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,h);
		return i+1;
	}
	public static void quickSort(int arr[],int l,int h) {
		if(l>=h) {
			return;
		}
		int p=partition(arr,l,h);
		quickSort(arr,l,p-1);
		quickSort(arr,p+1,h);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		quickSort(arr,0,n-1);
		
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();


	}

}

//TC-
//Best case TC=O(NLogN)  -- when pivot element's real position is at the middle   T(n) = 2T(n/2) + \theta(n)
//Average case TC=O(NLogN)
//Worst case TC=O(N2) --when pivot element's real position is either left or right most end of array (ascending or descending order)
//T(n) = T(0) + T(n-1) + \theta(n)  which is equivalent to  T(n) = T(n-1) + \theta               (n)


//Stable- Not stable
//in place- not
