package strings;

import java.util.Scanner;

public class StringPatternMatching_BruteForce {
	public static boolean isMatching(String s,String p) {
		int m=s.length();
		int n=p.length();
		for(int i=0;i<m-n;i++) {
			boolean flag=true;
			for(int j=0;j<n;j++) {
				if(s.charAt(i+j)!=p.charAt(j)) {
					flag=false;
				}
			}
			if(flag) {
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
	    System.out.println(isMatching(s,p)); 
		
	}
}
