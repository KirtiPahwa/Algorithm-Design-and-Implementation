package basics;
import java.util.*;
class Searching{
	private int n=10;
	private int arr[]=new int[n];
	Scanner sc=new Scanner(System.in);
	public void getData() {
		for(int i=0;i<n;i++) {
			System.out.println("Enter value at "+(i+1));
			arr[i]=sc.nextInt();
		}
	}
	public int searchData() {
		System.out.println("Enter the data to be searched");
		int key=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<n;i++) {
			if(key==arr[i]) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Key exists");
			return key;
		}else {
			System.out.println("Key does not exist");
			return -1;
		}
		
	}
}

public class Program18 {
	
	public static void main(String[] args) {
		Searching s=new Searching();
		s.getData();
		System.out.println(s.searchData());
		

	}

}
