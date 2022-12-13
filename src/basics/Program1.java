package basics;
import java.util.Scanner;

public class Program1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int []a=new int[20];
	for(int i=0;i<20;i++) {
		int b=sc.nextInt();
		a[i]=b;
		
	}
	for(int i=0;i<20;i++) {
		System.out.println(i);
	}
}
}
