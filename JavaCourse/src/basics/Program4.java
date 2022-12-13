package basics;
//Binary search
import java.util.*;
public class Program4 {
public static void main(String args[]) {
	int arr[]= {5,4,3,2,1};
	Scanner sc=new Scanner(System.in);
	Arrays.sort(arr);		
	System.out.println("Enter the key you want to search");
	int key=sc.nextInt();
	int s=0,e=arr.length-1,m;
	boolean flag=false;
	while(s<=e) {
		m=(s+e)/2;
		if(arr[m]==key) {
			flag=true;
			break;
		}else if(arr[m]>key) {
			e=m-1;
		}else {
			s=m+1;
		}
	}
	if(flag) {
		System.out.println("Element exists");
	}else {
		System.out.println("Element does not exists");
	}
	
}
}
