package practiceQuestions;
import java.util.HashMap;
import java.util.Map;
public class Problem10 {
	public static String count(String s) {
		String []words=s.split("\s");
		HashMap<String,Integer> mp=new HashMap<String,Integer>();
		for(String x:words) {
			String temp=x.charAt(0)+"";
			for(int i=1;i<x.length();i++) {
				if(Character.isUpperCase(x.charAt(i))) {
					break;
				}
				temp+=x.charAt(i);
			}
			if(mp.containsKey(temp)) {
			mp.put(temp,mp.get(temp)+1);
			}else {
				mp.put(temp,1);
			}
		}
		int ans=0;
		String temp="";
		for(Map.Entry<String,Integer> e:mp.entrySet()) {
//			System.out.println(e.getKey()+" "+e.getValue());
			if(ans<e.getValue()) {
				temp=e.getKey();
				ans=e.getValue();
			}
		}
//		System.out.println(ans+" "+temp);
		return temp;
	}

	public static void main(String[] args) {
		String s="AnujSaxena AnujRawat MananjayKumar MananjaySingh AnujRaturi AmanSingh";
		
		String ans=count(s);
System.out.println(ans);
	}

}
