package hashing;

import java.util.Scanner;

public class indexBasedHashing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the key set");
		int n=sc.nextInt();
		int keys[]=new int[n];
		int mx=Integer.MIN_VALUE;
		System.out.println("Enter the keys:");
		for(int i=0;i<n;i++) {
			keys[i]=sc.nextInt();
			mx=Math.max(mx, keys[i]);
		}
		
		int hashTable[]=new int[mx+1];
		for(int i=0;i<n;i++) {
			hashTable[keys[i]]=keys[i];
		}
		
		System.out.println("Hash table is shown below:");
		for(int i=0;i<=mx;i++) {
			if(hashTable[i]==0) {
				System.out.print(" ");
			}else
			System.out.print(hashTable[i]);
		}
		
		
		
		

	}

}
