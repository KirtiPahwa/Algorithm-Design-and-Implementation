package priorityQueues;

import java.util.Scanner;

public class MaxMinStream {
	

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		String choice=null;
		do {
			System.out.println("Enter a number");
			num=sc.nextInt();
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			System.out.println("Do you want to continue....<y/n>?");
			choice=sc.next();
			
		}while(choice.equalsIgnoreCase("Y"));
		
		System.out.println("Maximum number="+max);
		System.out.println("Minimum number="+min);
		

	}

}
