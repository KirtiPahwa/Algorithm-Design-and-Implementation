package basics;
import java.util.*;
import java.math.*;
public class Program15 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			arr[i]=(int)Math.pow(arr[i], 3);
		}
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
