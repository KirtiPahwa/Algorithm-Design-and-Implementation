package dynamicProgramming;
import java.util.*;
/*
 * Given a distance ‘dist’, count total number of ways to cover the distance with 1, 2 and 3 steps. 

Examples: 

Input: n = 3
Output: 4
Explanation:
Below are the four ways
 1 step + 1 step + 1 step
 1 step + 2 step
 2 step + 1 step
 3 step

 */

public class CountWaysToCoverDistance {
public static int func(int n,int arr[]) {
	if(n==0) {
		return 1;
	}else if(n<=0) {
		return 0;
	}
	if(arr[n-1]!=-1) {
		return arr[n-1];
	}
	return arr[n-1]=func(n-1,arr)+func(n-2,arr)+func(n-3,arr);
}
public static int TopDownApp(int n) {
	int arr[]=new int[n+1];
	Arrays.fill(arr, 0);
	arr[0]=1;
	
	for(int i=1;i<=n;i++) {
		if(i-1>=0) {
			arr[i]+=arr[i-1];
		}
		if(i-2>=0) {
			arr[i]+=arr[i-2];
		}
		if(i-3>=0) {
			arr[i]+=arr[i-3];
		}	

	}
	return arr[n];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	Arrays.fill(arr, -1);
	System.out.println(func(n,arr));
	System.out.println(TopDownApp(n));

	}

}
