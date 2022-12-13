package strings;
import java.util.*;
 class String1 {
	public String mainstring=new String();
	public String substr1=new String();
	public String replaceWith=new String();
	private int str1;
	private int str2;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter main string");
		mainstring=sc.nextLine();
		System.out.println("Enter the substring to replace");
		substr1=sc.nextLine();
		System.out.println("Enter the substring to be replaced with");
		replaceWith=sc.nextLine();

		str1=mainstring.length();
		str2=substr1.length();

	}
	public int searchsubstring() {
		boolean flag=false;
		int ans=-1;
		for(int i=0;i<str1;i++) {
			if(mainstring.charAt(i)==substr1.charAt(0)) {
				int k=0;
				flag=true;
				ans=i;
				for(int j=i;j<str2;j++) {
					if(mainstring.charAt(j)!=substr1.charAt(k)) {
						flag=false;
						ans=-1;
						break;
					}
					k++;
				}
			}
			if(flag==true) {
				return ans;
			}
		}
		return ans;
	}
	public void replacesubstring() {
	int ind=this.searchsubstring();
	if(ind==-1) {
		System.out.println(this.substr1+" do not found at "+this.mainstring);
		return;
	}
	else {
		String newString="";
		for(int i=0;i<ind;i++) {
			newString+=this.mainstring.charAt(i);
		}
		newString+=this.replaceWith;
		for(int i=ind+this.substr1.length();i<str1;i++) {
			newString+=this.mainstring.charAt(i);
		}
		System.out.println("New string is: "+newString);
				
	}
	}


}
 public class Program1 {

		public static void main(String[] args) {
			String1 s=new String1();
			s.input();
			s.replacesubstring();
//			if(ind==-1) {
//				System.out.println(s.substr1+" do not found at "+s.mainstring);
//			}else {
//				System.out.println(s.substr1+" found in "+s.mainstring+" at index: "+ind);
//			}
			
		}
		}
