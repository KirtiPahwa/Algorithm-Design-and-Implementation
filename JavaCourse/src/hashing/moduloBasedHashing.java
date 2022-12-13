package hashing;

import java.util.Scanner;

public class moduloBasedHashing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the key set");
		int n=sc.nextInt();
		int keys[]=new int[n];
		System.out.println("Enter the keys:");
		for(int i=0;i<n;i++) {
			keys[i]=sc.nextInt();
		}
		
		int hashTable[]=new int[10];
		for(int i=0;i<n;i++) {
			hashTable[keys[i]%10]=keys[i];
		}
		
		System.out.println("Hash table is shown below:");
		for(int i=0;i<10;i++) {
			if(hashTable[i]==0) {
				System.out.print(" ");
			}else
			System.out.print(hashTable[i]);
			System.out.print(",");
		}
	}

}

//Collision can be here
