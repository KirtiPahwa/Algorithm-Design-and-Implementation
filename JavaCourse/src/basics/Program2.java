/*
 * Linear Search
 */
package basics;
import java.util.*;

public class Program2 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		System.out.println("Enter a number in the array at "+i);
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the number you want to search");
	int key=sc.nextInt();
	boolean flag=false;
	for(int i=0;i<n;i++) {
		if(arr[i]==key) {
			flag=true;
			break;
		}
	}
	if(flag) {
		System.out.println("Key exists");
	}else {
		System.out.println("Key does not exists");

	} 
	}
}
