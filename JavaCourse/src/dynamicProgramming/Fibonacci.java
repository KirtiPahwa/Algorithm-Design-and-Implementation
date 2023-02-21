package dynamicProgramming;
import java.util.*;


public class Fibonacci {
	public static void fibonacci(int n) {
		int arr[]=new int[n];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static int recursiveFibonacci(int n) {
		if(n==0 || n==1) {
			return 1;
			
		}
		return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
	}
	public static void iterativeFibonacci(int n) {
		int a=1;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	
/*
 * 1 1   1 1
 * 1 0   1 0
 * 
 */
	public static void multiply(int F[][],int M[][]) {
		int x=F[0][0]*M[0][0]+F[0][1]*M[1][0];
		int y=F[0][0]*M[0][1]+F[0][1]*M[1][1];
		int z=F[1][0]*M[0][0]+F[1][1]*M[1][0];
		int w=F[1][0]*M[0][1]+F[1][1]*M[1][1];
				
				F[0][0]=x;
		F[0][1]=y;
		F[1][0]=z;
		F[1][1]=w;
	}
	public static void power(int F[][],int n) {
		
		int M[][]= {{1,1},{1,0}};
		
//		n-1 times multiply the matrix with M;
		
		for(int i=2;i<=n;i++) {
			multiply(F,M);
		}
		
	}
	public static int matrixMultiplication(int n) {
		int F[][]= {{1,1},{1,0}};
		if(n==0) {
			return 0;
		}
		power(F,n-1);
		return F[0][0];
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	fibonacci(n);
	System.out.println();
	iterativeFibonacci(n);
	System.out.println();
	System.out.println(recursiveFibonacci(n));
	System.out.println(matrixMultiplication(n));
	}

}
