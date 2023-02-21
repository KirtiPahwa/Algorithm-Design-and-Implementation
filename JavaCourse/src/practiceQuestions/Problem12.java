package practiceQuestions;

import java.util.Scanner;
import java.util.HashMap;
public class Problem12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		        HashMap<Character,Integer>mp=new HashMap<Character,Integer>();
		        mp.put('I',1);
		        mp.put('V',5);
		        mp.put('X',10);
		        mp.put('L',50);
		        mp.put('C',100);
		        mp.put('D',500);
		        mp.put('M',1000);
		        int n=s.length();
		        int ans=0;
		        for(int i=0;i<n-1;i++){
		            if(mp.get(s.charAt(i))<mp.get(s.charAt(i+1))){
		                ans-=mp.get(s.charAt(i));
		            }else{
		                ans+=mp.get(s.charAt(i));
		            }
		        }
		        ans+=mp.get(s.charAt(n-1));
		        System.out.print(ans);
		       
		    
		
	}

}
