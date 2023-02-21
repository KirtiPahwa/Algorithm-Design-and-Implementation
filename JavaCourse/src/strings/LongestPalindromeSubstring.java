package strings;
//preferrable algorithm
public class LongestPalindromeSubstring {
	public static String updatedString(String s) {
		StringBuilder sb=new StringBuilder();
		sb.append('@');  
		for(int i=0;i<s.length();i++) {
			sb.append('#');
			sb.append(s.charAt(i));
		}
		sb.append('#');
		sb.append('$');
		return sb.toString();
	}
	public static void manacherAlgo(String originalString) {
	
		String s=updatedString(originalString);
		System.out.println(s);
		
//		update s=@#a#a#b#b#b#a#$. Here $ and @ added 
		int ans=0;
		int n=s.length();
		int []LPS=new int[n];  //n will be here 2*orginalString.length+1
		int c=0;
		int r=0; //r of zbox
		for(int i=1;i<n-1;i++) {
			
//			mirror palindrome's index
			int mirror=c-(i-c);
			
//			to check if case1,case3,case4
			if(i<r) {
				LPS[i]=Math.min(LPS[mirror], r-i);
			}
			
//			loop runs in case3,case4.....(in case4 also,bcz we dont know that whats the outer element comes in palindrome of i or not bcz mirror plaindromes ranges exceed cetner's palindrome
			while(s.charAt(i+1+LPS[i])== s.charAt(i-1-LPS[i])) { // add i-1-LPS[i]>=0 && i+1+LPS[i]<n  condn. in while loop or add $ and @ in updated string in starting and end. (here @ and $ will help to make the while loop stop as $ and @ will not match and we are iterating i from 1 (leaving @) to n-1 (leaving $)
				LPS[i]++;
			}
			
//		this if condition passed only when loop runs. In case3 can be if while loop increases its LPS value. And in case4,also if value inc. by while loop
			if(i+LPS[i]>r) {
				c=i;     //new center can be in case3,4 if their palindromic range inc.
				r=i+LPS[i];
			}
			
//			to check for Case 2	
			if(r==n-2) { //n-2 bcz at the end we are having $ also which doesnot comes under r as $ doesnot match with @
				ans=LPS[i];
				break;
			}
/*
 * Case1:Totally contained under current palindrome.(not taken as centre).
 * Case2:Current palindrome expand till end of input.(stop there).
 * Case3:Palindrome expands till right edge and its mirror palindrome is prefix (means under the left border of zbox of current.)..(pick that as centre if right boundary of this increases thorogh while loop).
 * Case4:Palindrome expands till right edge and its mirror expands beyond left edge.(pick that as centre if right boundary of this increases through while loop).
 * 
 * 
 */
		}
		int maxLen=0;
		int maxIdx=0;
		System.out.println("Len"+LPS.length);
		for(int i=0;i<LPS.length;i++) {
			System.out.print(LPS[i]+" ");
			
			if(LPS[i]>maxLen) {
				maxLen=LPS[i];
				maxIdx=i;
			}
		}
		System.out.println();
		System.out.println(maxLen+" "+maxIdx);
		int firstIdx=maxIdx-maxLen+1; //first index of that palindrome  // 7-5+1 //will point to first character idx of palindrome
		int actIdx=(firstIdx-2)/2;  //actual index acc to actual string //-2 bcz to remove starting @# of updated string
		System.out.println(firstIdx+" "+actIdx);
		System.out.println(originalString.substring(actIdx,actIdx+maxLen));
	}

	public static void main(String[] args) {
		manacherAlgo("lifeefql");
	    

	}

}
