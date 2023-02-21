package greedyAlgorithms;

import java.util.*;

/*
 * Jobs are given with their deadlines and profits and each job will take 1 unit of time. you have to schedule the jobs so that profit can be maximised.
 * 
 * Intuition: we will schedule first job with max profit and schedule this job at the end of the deadline. For eg. the j1 with deadline 4 and profit 35(max) will be scheduled on (3-4) means on 3rd index in array (0-based indexing)/
 * Approach: Sort on the basis of profit first and then put the job with max at most last of the dealline if already not filled with any job. If its filled then look for the deadline which is not filled and which is less than its deadline. 
 *
 */

class Job{
	public int id;
	public int profit;
	public int deadline;
	public Job(int id,int profit,int deadline) {
		this.id=id;
		this.profit=profit;
		this.deadline=deadline;
	}
}
public class JobSchedulingWithDeadline {
	public static void JobSchedulingWithDeadline(int profit[],int deadline[]) {
		int n=profit.length;
		Job arr[]=new Job[n];
		int mxDeadline=0;
		for(int i=0;i<n;i++) {
			arr[i]=new Job(i,profit[i],deadline[i]);
			mxDeadline=Math.max(mxDeadline,deadline[i]);
		}
		Arrays.sort(arr,new Comparator<Job>() {
			@Override public int compare(Job a,Job b) {
				if(a.profit<b.profit)return 1;
				else return -1;
			}
		});
		for(int i=0;i<n;i++) {
			System.out.println(arr[i].id+" "+arr[i].profit+" "+arr[i].deadline);
		}
		ArrayList<Job>ans=new ArrayList<Job>();
		boolean flag[]=new boolean[mxDeadline+1];
		int totalProfit=0;
		for(int i=0;i<n;i++) {
			
			int j=arr[i].deadline;
			
			while(j>0 && flag[j]==true) {
				j--;
			}
			
			if(j>0) {
				flag[j]=true;
				ans.add(arr[i]);
				totalProfit+=arr[i].profit;
			}
				
			}
		System.out.println("Total profit"+totalProfit);
		for(Job x:ans) {
			System.out.println(x.id+" "+x.profit);
		
		}
	}

	public static void main(String[] args) {
				
		int profit[]= {35,30,25,20,15,12,5};
		int deadlines[]= {3,4,4,2,3,1,2};
		// ans should be : J4(20) J3(25) J1(35) J2(30) (sequence in  code is 35+30+25+20)
		JobSchedulingWithDeadline(profit,deadlines);
		

	}

}
