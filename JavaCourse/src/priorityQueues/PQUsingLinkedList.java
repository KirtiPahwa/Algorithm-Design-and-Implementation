package priorityQueues;

import java.util.Scanner;

class Node{
	public int data;
	public int priority;
	public Node next;
	public Node(int data,int priority) {
		this.data=data;
		this.priority=priority;
		next=null;
	}
}
class Pqueue{
	public Node front;
	public Node rear;
	
	public Pqueue(){
		front=null;
		rear=null;
	}
	public void enqueue(int data,int priority) {
		Node newNode=new Node(data,priority);
		if(front==null) {
			front=newNode;
			rear=newNode;
			return;
		}
		if(front.priority<newNode.priority) {
			newNode.next=front;
			front=newNode;
			return;
		}
		Node temp=front;
		while(temp!=rear && temp.next!=null && temp.next.priority>=newNode.priority) {
			temp=temp.next;
		}
		if(temp==rear) {
			rear=newNode;
		}
		newNode.next=temp.next;
		temp.next=newNode;	
	}
	public int deque(){
		
		int ans= front.data;
		front=front.next;
		return ans;
	}
	public void display() {
		Node temp=front;
		while(temp!=rear) {
		System.out.print(temp.data+"->");
		temp=temp.next;
		}
		System.out.print(temp.data);
		
	}
	
	
	
	
}
public class PQUsingLinkedList {

	public static void main(String[] args) {
		Pqueue pq=new Pqueue();
		int data;
		int priority;
		int choice;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter your Choice");
			System.out.println("1. For Enque");
			System.out.println("2. For Deque");
			System.out.println("3. For Display");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter data");
				data=sc.nextInt();
				System.out.println("Ente Prioroty");
				priority=sc.nextInt();
				pq.enqueue(data, priority);
				break;
			case 2:
				 data=pq.deque();
				 System.out.println("Processed Data="+data);
				 break;
			case 3:
				pq.display();
				break;
			default:
				break;
				
				
			}


		}}

}
