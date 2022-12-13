package algorithms;

public class MergeSort {
	static void merge(int arr[],int l,int m,int r) {
		int n=arr.length;
		int temp[]=new int[n];
		int i=l,j=m+1,k=l;
		while(i<=m && j<=r) {
			if(arr[i]<arr[j]) {
				temp[k++]=arr[i++];
				
			}else {
				temp[k++]=arr[j++];		
			}
		}
		while(i<=m) {
			temp[k++]=arr[i++];
		}
		while(j<=r) {
			temp[k++]=arr[j++];
		}
		for(i=l;i<=r;i++) {
			arr[i]=temp[i];
		}
	}
	static void mergeChar(char arr[],int l,int m,int r) {
		int n=arr.length;
		char temp[]=new char[n];
		int i=l,j=m+1,k=l;
		while(i<=m && j<=r) {
			if(arr[i]<arr[j]) {
				temp[k++]=arr[i++];
				
			}else {
				temp[k++]=arr[j++];		
			}
		}
		while(i<=m) {
			temp[k++]=arr[i++];
		}
		while(j<=r) {
			temp[k++]=arr[j++];
		}
		for(i=l;i<=r;i++) {
			arr[i]=temp[i];
		}
	}

	 static void mergeSort(int []arr,int l,int r) {
		 if(l>=r) {
			 return;
		 }
		int mid=(l+r)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,mid,r);
		
	 }
	 static void mergeSortChar(char []arr,int l,int r) {
		 if(l>=r) {
			 return;
		 }
		int mid=(l+r)/2;
		mergeSortChar(arr,l,mid);
		mergeSortChar(arr,mid+1,r);
		mergeChar(arr,l,mid,r);
		
	 }

	public static void main(String[] args) {
		int []arr= {5,4,3,2,1};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		String s="kjadkflshod";
		char []carr=s.toCharArray();
		mergeSortChar(carr,0,carr.length-1);
		for(int i=0;i<carr.length;i++) {
			System.out.print(carr[i]+" ");
		}
	}

}

//TC-O(NlogN) 
//SC-O(N)
//Stable-yes (4,4) so in this 4 which comes earlier will be earlier after sorting even
//in place- no , not sorting in original array
