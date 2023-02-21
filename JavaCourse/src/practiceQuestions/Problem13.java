package practiceQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Problem13 {
	public static boolean feasible(int mid,int []arr,int n,int k) {
		int ans=1;
		int pos=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]-pos>=mid) {
				pos=arr[i];
				ans++;
			
			if(ans==k) {
				return true;
			}
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		Arrays.sort(arr);
		int l=1;
		int res=-1;
		int r=arr[n-1];
		while(l<=r) {
			int mid=(l+r)/2;
			if(feasible(mid,arr,n,k)) {
				res=Math.max(res, mid);
				l=mid+1;

			}else {
				r=mid-1;
			}
		}
System.out.println(res);
	}

}
