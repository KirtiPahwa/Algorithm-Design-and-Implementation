package heaps;

public class MinHeap {
	private int Heap[];
	int size;
	int maxSize;
	public MinHeap(int maxSize) {
		this.maxSize=maxSize;
		this.size=0;
		Heap=new int[this.maxSize];
	}
	private int parent(int pos) {
		return (pos-1)/2;
	}
	private int leftChild(int pos) {
		return 2*pos+1;
	}
	private int rightChild(int pos) {
		return 2*pos+2;
	}
	private boolean isLeaf(int pos) {
		if(pos>size/2 && pos<=size) {
			return true;
		}
		return false;
	}
	private void swap(int pos1,int pos2) {
		int temp=Heap[pos1];
		Heap[pos1]=Heap[pos2];
		Heap[pos2]=temp;
	}
	public void insert(int element) {
		Heap[size]=element;
		int curr=size;
		while(Heap[curr]<Heap[parent(curr)]) {
			swap(curr,parent(curr));
			curr=parent(curr);
		}
	
		size++;
	}
	
	public void minHeapify(int pos) {
		if(isLeaf(pos)) {
			return;
		}
		if(Heap[pos]>Heap[leftChild(pos)] || Heap[pos]>Heap[rightChild(pos)]) {
			if(Heap[leftChild(pos)]<Heap[rightChild(pos)]) {
				swap(Heap[pos],Heap[leftChild(pos)]);
				minHeapify(leftChild(pos));
			}else {
				swap(Heap[pos],Heap[rightChild(pos)]);
				minHeapify(rightChild(pos));
			}
		}
	}
	public  void display()
	{
		         for(int i=0;i<size;i++)
		         {
		            System.out.println(Heap[i]+" ")  ;       	 
		}
	}

	public int extractMin() {
		int popped=Heap[0];
		Heap[0]=Heap[--size];
		minHeapify(0);
		return popped;
	}

	public static void main(String[] args) {
		int n=9;
		MinHeap obj = new MinHeap(n);
		obj.insert(5);
		obj.insert(6);
		obj.insert(7);
		obj.insert(8);
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.display();
//		System.out.println(obj.extractMin());
		


	}

}
