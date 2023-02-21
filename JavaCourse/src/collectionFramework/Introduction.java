

package collectionFramework;
	 

public class Introduction {
	
public static void main(String args[]) {
	System.out.print("k");
}

}

/* collection framework -- basically in java , there are already implemented data structure like linked list ,stack,set,map,queue,etc. 
						-- we dont need to implement them form scratch
	
	Heirarchy:
					Iterable (interface)
			   			|
				   Collections (interface)
			  __________|_____________
			  |         |            |
(interfaces) List    Queue         Set -----Map(implemented by map internally) (these all are interfaces means we cann't make directly the object of any interface.
//	 so to implement the data structure there are some classes which inherit these interfaces . And we use the object of the classes to use data structure.
 * 
// * Methods: add,size,remove,iterate,addAll,removeAll,clear.
 * 
 * 
 * 1.  List(interface)-
 * a.(classes)ArrayList-variable size array(dynamic array whenever the elements more than its size need to be inserted. Then a new array of bigger size is taken,copier them in new array and then insert the new element
 * b.(classes)LinkedList- There are non contiguous list whose nodes are at different places but connected.
 * c.(classes)Vector- similar to array list. Difference is - Vector is thread safe. Whenever multiple threads working, vector used there.
 *         I.Stack(classes)-LIFO. Stack is a class that falls under the Collection framework that extends the Vector class.
 * 
 *  
 *  2.Queue(interface)-FIFO
 *  a.(classes)PriorityQueue- Queue with priorities are here, which put higher priority elements in front of queeu and rest in back of queue.
 *  b.(classes)LinkedList-Linked list is also implemented in FIFO fashion. Therefore this class extends queues as well.
 *  c.(interface)Deque(Double Ended queue)(interface)- Both ends front and deletion possible in queue.
 *         I.(classes)ArrayDeque-it comes under deque inteface. We cannot directly make obj of dequeue bcz its a inteface. But can implement dequeu using arraydeque class.
 *      
 *        
 *  3. Set(interface)-collection which maintains unique elements
 *  a.(classes) HashSet- random order(neither maintain insertion order nor any sorted order). Diff. elements at diff places are connected.
 *  b.(classes) LinkedHashSet-LinkedHashSet maintains the insertion order of the elements. We can not predict the insertion order in HashSet, but we can predict it in LinkedHashSet.
 *  c.(interface) SortedSet- is a interface which maintain sorted order of elements that is in ascneding order.
 *         I.(classes)TreeSet-It extends sortedSet. TreeSet provides an implementation of the Set interface that uses a tree for storage. Objects are stored in a sorted and ascending order
 *         
 *  4. Map(interface)-collection which stores key and its value.
 *  a.(classes)HashMap-Hash map in Java does not maintain insertion order either by key or by order. It does not maintain any sorted order.
 *  b.(classes)LinkedHashMap-LinkedHashMap stores entries (Key-Value pairs) as per insertion-order of Keys
 *  c.(interface)SortedMap-is a interface which maintain sorted order of keys.
 *         I.(class)TreeMap-Extends sortedmap interface. TreeMap stores entries (Key-Value pairs) in sorted-order of Keys
 *
 *
 */