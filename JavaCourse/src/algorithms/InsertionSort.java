package algorithms;
import java.util.Scanner;

// We can directly assign one array to other array in java . But this is not possible in c++
class Insertion{
	int arr[];
	int i,j,key,space;
	public Insertion(int arr[]) {
		this.arr=arr;
		this.space=arr.length;
	}
	public void sort() {
		for( i=1;i<space;i++) {
			 key=arr[i];
			 j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	public void display() {
		for(int i=0;i<space;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
class InsertionOnString {
	char arr[];
	int i,j,space;
	char key;
	public InsertionOnString(String str) {
		this.arr=str.toCharArray();
		this.space=arr.length;
	}
	public void sort() {
		for( i=1;i<space;i++) {
			 key=arr[i];
			 j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	public void display() {
		for(int i=0;i<space;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
public class InsertionSort {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		Insertion a= new Insertion(arr);
//		a.display();
//		a.sort();
//		a.display();
//		
	    String s="kirti";
	    String d="angil";
		char a='k';
		char b='a';
		if(s.compareTo(d)==1) {
			System.out.println();
		}
//		InsertionOnString a= new InsertionOnString(s);
//		a.display();
//		a.sort();
//		a.display();
	}

}


//TC-O(N) (best case-ascending)
//TC-O(N2)(worst case -descending) or (average)
//Stable- (4,4) so in this 4 which comes earlier will be earlier after sorting even
//in place- sorting in original array




