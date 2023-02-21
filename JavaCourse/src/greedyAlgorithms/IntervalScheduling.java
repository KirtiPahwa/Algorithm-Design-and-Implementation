package greedyAlgorithms;

import java.util.Arrays;
import java.util.*;

/*
 * Given the starting time and ending time of the job. No 2 jobs should overlap. You have to find the maximum no. of jobs that can be scheduled.
 * Intuition: To schedule more no. of jobs, our job should finish soon. So we will schedule to the job which have finish time soon.
 * So sort on the basis of finish time.Pick the job of less finish time.
 */
class Interval{
	public int start;
	public int end;
	public int id;
	public Interval(int s,int e,int i){
		start=s;
		end=e;
		id=i;
	}
}
public class IntervalScheduling {
	public static void IntervalScheduling(int s[],int e[]) {
		int n=s.length;
		Interval arr[]=new Interval[n];
		for(int i=0;i<n;i++) {
			arr[i]=new Interval(s[i],e[i],i);
		}
		Arrays.sort(arr,new Comparator<Interval>() {
			@Override public int compare(Interval a,Interval b) {
				if(a.end>b.end) {
					return 1;
				}else {return -1;}
			}
		});
		for(int i=0;i<n;i++) {
			System.out.println(arr[i].start+" "+arr[i].end);
		}
		ArrayList<Interval> ans=new ArrayList<Interval>();
		ans.add(arr[0]);
		Interval curr=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i].start>curr.end) {
				ans.add(arr[i]);
				curr=arr[i];
			}
		}
		
		for(Interval itr:ans) {
			System.out.println(itr.start+" "+itr.end+" "+itr.id);
		}
	}

	public static void main(String[] args) {
		int n=6;
		int startTime[]= {2,3,6,8,13,12};
		int endTime[]= {5,7,10,12,15,18};
	IntervalScheduling(startTime, endTime);
		
	}
	

}
