package priorityQueues;

import java.util.Scanner;

/*
 * Queue:It is linear data structure which works on the principle of FIFO.(first in first out)/(first in first serve)
 * 
 * Priority Queues: [6,4] ....6 is number and 4 is its priority
 * 					[8,3]
 * 					[3,5]
 * eg., queue=[(6,4),(8,3),(3,5),(2,4),(100,1),(50,2),(70,2),(45,3)]
 * priority queue=[(100,1),(50,2),(70,2),(8,3),(45,3),(6,4),(2,4),(3,5)] //if two has same priority then the ele which comes first will be placed before other one
 * Def:Priority Queue is an abstract data type that is similar to a queue, and every element has some priority value associated with it. The priority of the elements in a priority queue determines the order in which elements are served (i.e., the order in which they are removed). If in any case the elements have same priority, they are served as per their ordering in the queue.

 * Properties of Priority Queue:
 * Every item has a priority associated with it.
 * An element with high priority is dequeued before an element with low priority.
 * If two elements have the same priority, they are served according to their order in the queue.
 * 5.In a priority queue,generally,the value of an element is considered for assigning the priority.
 * 6.For eg., the element with the highest value is assigned the highest priority and the element with the 
 * lowest value is assigned the lowest priority. The reverse case can also be used i.e.,the element with the 
 * lowest value can be assiged the
 * 
 * Operations of a Priority Queue:
 * 1. Insertion in Priority queue(inqueue)
 * 2. Deletion in a Priority Queue (dequeue)
 * 3. Peek in a Priority Queue
 * 
 * Types of Priority Queue:
 * 1.Ascending order priority queue. (eg.,minheap)
 * 2.Descending order priority queue.  (eg.,maxqueue)
 * 
 * How to Implement Priority Queue? 
Priority queue can be implemented using the following data structures: 

Arrays
Linked list
Heap data structure
Binary search tree
  
 * 
 * Two methods to decide the priority level
 * Numerical:max value has maximum priority/minimum value has minimum priority
 * Ordinary value:1st,2nd,3rd,4th,..
 * 
 */
class PQue{
	private int data[][];
	private int front;
	private int rear;
	
	PQue(int size)
	{
		data=new int[size][2];
		front=0;
		rear=0;
		
	}
	
	public void enque(int data,int priority)
	{
		  if(front==rear)
		  {
			  this.data[rear][0]=data;
			  this.data[rear][1]=priority;
			  rear++;
			  
		  }
		  else
		  {
			  for(int i=front;i<rear;i++)
			  {
				   if(this.data[i][1]<=priority)
				   {
					   continue;
				   }
				   else
				   {
					  for(int j=rear;j>i;j--)
					  {
						  this.data[j][0]=this.data[j-1][0];
						  this.data[j][1]=this.data[j-1][1];
					  }
					  this.data[i][0]= data;
					  this.data[i][1]= priority;
					  rear++;
					  break;
					  
				   }
					   
			  }
		  }
	}
	
	public int deque()
	{
		/*System.out.println("Processed Data");
		System.out.print(this.data[front][0]);
		System.out.print(this.data[front++][1]);
		System.out.println();*/
		return(this.data[front++][0]);
	}
	
	public void display()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(this.data[i][0]+" ");
			System.out.print(this.data[i][1]);
			System.out.println();
		}
	}
}


public class Program1 {

	public static void main(String[] args) {
		
		PQue Obj=new PQue(10);
		int data, priority;
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
				Obj.enque(data, priority);
				break;
			case 2:
				 data=Obj.deque();
				 System.out.println("Processed Data="+data);
				 break;
			case 3:
				Obj.display();
				
				
			}
			
			
		}
	}

}
