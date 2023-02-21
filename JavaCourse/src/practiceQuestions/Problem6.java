package practiceQuestions;
import java.util.Scanner;
import java.util.HashMap;
public class Problem6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<Integer,Character>mp=new HashMap<Integer,Character>();
		mp.put( 2,'a');
//		mp.put('e', 3);
		mp.put(5,'i');
//		mp.put('o', 7);
//		mp.put('c', 2);
//		mp.put('d', 1);
		mp.put( 4,'l');
		mp.put(6,'m');
//		mp.put('u', 8);
//		mp.put('v', 9);
		String []temp=s.split("\\s");
		
		
		String ans="";
		for(String x:temp) {
			for(int i=0;i<x.length();i++) {
				int c=Integer.parseInt(x.charAt(i)+"");
				if(mp.containsKey(c)) {
					ans+=(mp.get(c));
				}	
				}
		ans+=" ";
			
		}
		System.out.println(ans);
		
		
		

	}

}
