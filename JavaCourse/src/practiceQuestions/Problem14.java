package practiceQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		int ans=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int diff=Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++) {
			if(Math.abs(arr[i]-arr[i+1])<diff) {
				diff=Math.abs(arr[i]-arr[i+1]);
			}
		}
		System.out.println(diff);
		

	}

}
