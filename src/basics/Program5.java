package basics;

import java.util.*;
/*
 * public classes can be only created in separate file i.e., in 1 file there can be just one public file
 * 
 * There are four types of Java access modifiers:

Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

 */

class Base{
	private int l=0; //available in this class only . Not accessible in the program5 class even
	int i,j;
	Base(){ //default constructor 
		i=0;
		j=0;
	}
	Base(int i,int j){ //parametrised constructor
		this.i=i;
		this.j=j;
	}
//	methods
	void display() {
		System.out.println("i is : "+i+"\nj is : "+j);
	}
	
}
public class Program5{
	private static  int k=0; // we are in the static functions so this k integer should also be static then only it will be accessible inside this static main function --compile time error
	public static void main(String args[]) {
		Base obj=new Base(1,2);
		obj.display();
		System.out.println(k);
	}

}

