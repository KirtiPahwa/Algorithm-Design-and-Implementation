package practiceQuestions;
import java.util.Scanner;
import java.util.*;

public class Problem11 {
	public static int findLPSubsequence(String s,int i,int j,Integer [][] len) {
		if(len[i][j]!=null) {
			return len[i][j];
		}
		if(i>j) {return 0;}
		if(i==j)return 1;
		if(s.charAt(i)==s.charAt(j)) {
			len[i][j]=findLPSubsequence(s,i+1,j-1,len)+2;
		}else {
			len[i][j]=Math.max(findLPSubsequence(s,i+1,j,len),findLPSubsequence(s,i,j-1,len));			
		}
		return len[i][j];
		
	}
	
	public static String update(String s) {
		String str="@";
		for(int i=0;i<s.length();i++) {
			str+='#';
			str+=s.charAt(i);
		}
		str+="#$";
		return str;
		
	}
	public static int findLPS(String s) {
		String str=update(s);
		System.out.println(str);
		
		int LPS[]=new int[str.length()];
		int i=1;
		int r=0;
		int c=0;
		int ans;
		while(i<str.length()-1) {
		
			if(i<r) {
				LPS[i]=Math.min(LPS[c-(i-c)],r-i);
			}
//			System.out.println(i);
			while(str.charAt(i-LPS[i]-1)==str.charAt(i+LPS[i]+1)) {
//				System.out.println(LPS[i]);
				LPS[i]++;
			}
			if(i+LPS[i]>r) {
				c=i;
				r=i+LPS[i];
			}
			if(r==str.length()-2) {
				ans=LPS[i];
				break;
			}
			i++;
		}
		int mxIdx=0;
		int mxLen=Integer.MIN_VALUE;
		for(i=0;i<str.length();i++) {
//			System.out.print(LPS[i]+" ");
			if(LPS[i]>mxLen) {
				mxLen=LPS[i];
				mxIdx=i;
			}
		}
		System.out.println(mxIdx+" "+mxLen);
		
		int firstChar=((mxIdx-mxLen+1)-2)/2;
		System.out.println(str.substring(firstChar,firstChar+mxLen));
		return mxLen;
//		return str.substring(firstChar,firstChar+mxLen);	
	}
	
	
	public static int find(String s) {
		int n=s.length();		
		int pal=findLPSubsequence(s,0,s.length()-1,new Integer[n][n]);
//		System.out.println(pal);
		return n-pal;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int ans=find(s);
		System.out.println(ans);

	}

}
