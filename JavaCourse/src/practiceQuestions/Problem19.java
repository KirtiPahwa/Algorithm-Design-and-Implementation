package practiceQuestions;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;
public class Problem19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		TreeMap<Integer,Integer>mp=new TreeMap<Integer,Integer>(Collections.reverseOrder());
		for(int i=0;i<n;i++) {
		    if(mp.containsKey(arr[i])) {
		    	mp.put(arr[i],mp.get(arr[i])+1);
		    }else{
		    	mp.put(arr[i],1);
		    }
		}
		int i=0;
		int ans=0;
	for(Map.Entry<Integer,Integer> e:mp.entrySet()) {
		if(i==k) {
			break;
		}
		i++;		
		ans+=e.getValue();
	}
	System.out.println(ans);	
	}

}
