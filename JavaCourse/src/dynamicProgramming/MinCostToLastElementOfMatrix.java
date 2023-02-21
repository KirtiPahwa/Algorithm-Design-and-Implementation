package dynamicProgramming;

import java.util.*;
public class MinCostToLastElementOfMatrix {
//	public static int mcp(int i,int j,int arr[][],int m,int n,int sum) {
//		if(i<0 || j<0 || i>=m || j>=n) {
//			return 0;
//		}
//		System.out.println(i+" right "+(j+1));
//		int right=arr[i][j]+mcp(i,j+1,arr,m,n,arr[i][j]);
//		System.out.println(right+" after right traversal ");
//		System.out.println((i+1)+" right "+j);
//		int down=arr[i][j]+mcp(i+1,j,arr,m,n,arr[i][j]);
//		System.out.println(down+" after down traversal ");
//		return Math.min(down,right);
//	}
	public static int mcpTopDown(int arr[][],int m,int n) {
		int dp[][]=new int[m][n];
		dp[0][0]=arr[0][0];
		for(int i=1;i<m;i++) {
			dp[i][0]=arr[i][0]+dp[i-1][0];
		}
		for(int i=1;i<n;i++) {
			dp[0][i]=arr[0][i]+dp[0][i-1];
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+arr[i][j];
			}
		}
		return dp[m-1][n-1];
	}
	public static void main(String[] args) {
		int m,n;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		int ans=mcp(0,0,arr,m,n,arr[0][0]);
		int ans2=mcpTopDown(arr,m,n);
		System.out.println(ans2);
		

	}

}

//3
//4
//1
//7
//3
//2
//4
//6
//5
//8
//2
//9
//7
//3
