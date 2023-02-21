package practiceQuestions;
public class Problem7 {
	public static String reverse(String s) {
		String arr[]=s.split("\\s");
		String ans="";
		for(String x:arr) {
			ans=x+" "+ans;
		}
		return ans;
	}

	public static void main(String[] args) {
	String s="me hurt not do Please";
	System.out.println(reverse(s));

	}

}
