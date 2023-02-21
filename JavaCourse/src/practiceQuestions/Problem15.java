package practiceQuestions;
import java.util.Arrays;
import java.util.Scanner;
public class Problem15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int []arr=new int[n];
		int ans=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==k) {
				ans++;
			}
		}
		Arrays.sort(arr);
		int i=0,j=n-1;
		while(i<=j) {
			if(arr[i]+arr[j]==k) {
				System.out.println(i+" "+j);
				ans++;
				i++;
				j--;
			}else if(arr[i]+arr[j]>k) {
				
				j--;
			}else {
				i++;
			}
		}
		System.out.println(ans);
	}
}
