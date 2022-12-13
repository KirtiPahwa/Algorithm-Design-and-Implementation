package basics;
import java.util.*;
import java.math.*;
//2345  5432   232 232
public class Program13 {
	static boolean checkPalindrome(int n) {
//		double no_of_digits=((Math.log(n)+1));
//		System.out.println(no_of_digits);
		
		//reversing the number
		int reversed=0;
		int temp=n;
		while(n!=0) {
			reversed=reversed*10+(n%10);
			n/=10;
		}
		n=temp;
		if(n==reversed)return true;
		
		return false;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int s=3;
		int []arr=new int[s];
		
		for(int i=0;i<s;i++) {
		arr[i]=sc.nextInt();
		}
		for(int i=0;i<s;i++) {
			if(checkPalindrome(arr[i])) {
				System.out.println(arr[i]+" is palindrome ");
			}else {
				System.out.println(arr[i]+" is not a palindrome ");
			}
		}
	}

}
