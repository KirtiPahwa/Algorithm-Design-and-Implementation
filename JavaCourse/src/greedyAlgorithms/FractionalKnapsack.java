package greedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

class ProfitPerWeight{
	public int weight;
	public double profit;
	
}
public class FractionalKnapsack {
	public static int knapsack(int[]weights,int profits[],int w) {
		int n=weights.length;
		
		ProfitPerWeight actualProfit[]=new ProfitPerWeight[n];
		for(int i=0;i<n;i++) {
			actualProfit[i]=new ProfitPerWeight();
			actualProfit[i].weight=weights[i];
			actualProfit[i].profit=(double)profits[i]/weights[i];
		}
//		for(int i=0;i<n;i++) {
//			actualProfit[i].weight=weights[i];
//			actualProfit[i].profit=(double)profits[i]/weights[i];
//		}
		Arrays.sort(actualProfit,new Comparator<ProfitPerWeight>() {
			@Override public int  compare(ProfitPerWeight a,ProfitPerWeight b) {
				if(a.profit<b.profit)return -1;
				else return 1;
			}
		});
		
	
		int profit=0;
		for(int i=n-1;i>=0;i--) {
			if(w>=actualProfit[i].weight) {
			w-=(actualProfit[i].weight);
			profit+=actualProfit[i].profit*actualProfit[i].weight;
			}else {
				profit+=actualProfit[i].profit*w;	
				w=0;
			}
			if(w==0)break;
		}
		return profit;
		
	}

	public static void main(String[] args) {
		
		int weights[]= {2,3,5,7,1,4,1};
		int profits[]= {10,5,15,7,6,18,3};
		int w=10;
		int ans=knapsack(weights,profits,w);
		System.out.println(ans);
	}

}
