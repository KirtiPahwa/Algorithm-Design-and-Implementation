package practiceQuestions;
import java.util.Scanner;
public class Problem16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int swap=0;
		for(int i=0;i<n-1;i++) {
			int minIdx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIdx]) {
					minIdx=j;
				}
			}
			if(i!=minIdx) {
			int temp=arr[minIdx];
			arr[minIdx]=arr[i];
			arr[i]=temp;
			swap++;
			}
		}
		System.out.println(swap);
	}

}
