package practiceQuestions;
import java.util.Scanner;
public class Problem17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int []arr=new int[n];
		boolean flag=false;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>=k) {
				flag=true;
				System.out.println(arr[i]+" "+i);
			}
			
		}
		if(flag==false) {
			System.out.println("-1");
		}
		
	
	}

}
