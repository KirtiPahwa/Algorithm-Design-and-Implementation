package basics;
import java.util.ArrayList;
import java.util.ListIterator;
public class Program20 {

	public static void main(String[] args) {
	       ArrayList<Integer>vis=new ArrayList<Integer>(5);
	       vis.add(0,1);
	       vis.add(1,2);
	       vis.add(2,3);
	       vis.add(3,4);
	       vis.add(4,5);
	      
	       ListIterator<Integer> it=vis.listIterator();
	       while(it.hasNext()) {
	    	   System.out.println(it.next()+" ");
	       }
	       
	}

}
