package basics;
import java.util.*;
import java.math.*;
 
public class Program16 {
	static int no_of_digits(int n){
	return ((int)Math.ceil(Math.log10(n)));
}
	static int sum_of_digits(int n) {
		int sum=0;
	
		while(n!=0) {
			
		sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}for(int i=0;i<5;i++) {
			System.out.print(sum_of_digits(arr[i])+" ");
		}
		
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(no_of_digits(arr[i])+" ");
		}
		System.out.println();
		
		
	}
}
