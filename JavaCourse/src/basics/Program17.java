package basics;
import java.util.*;
class Time{
	private int hh,mm,ss;
	 void ReadTime() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hours");
		hh=sc.nextInt();
		System.out.println("Enter the minutes");
		mm=sc.nextInt();
		System.out.println("Enter the seconds");
		ss=sc.nextInt();
	}
	 public void showTime() { 
		 System.out.println(hh+":"+mm+":"+ss);
	 }
	 public void addTime(Time x) {
		Time ans=new Time();
		ans.ss=(this.ss+x.ss)%60;
		ans.mm+=(this.ss+x.ss)/60+(this.mm+x.mm)%60;
		ans.hh+=(this.mm+x.mm)/60+(this.hh+x.hh)%60;
		ans.showTime();
	 }
	 
}
public class Program17 {
	public static void main(String[] args) {
		Time t=new Time();
		t.ReadTime();
		t.showTime();
		Time t2=new Time();
		t2.ReadTime();
		t2.showTime();
		t.addTime(t2);		
	}
}
