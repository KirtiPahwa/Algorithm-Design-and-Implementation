package basics;
import java.util.*;
public class Program7 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the integer here");
	int n=sc.nextInt();
	System.out.println("Enter the string here");
	String b=sc.nextLine();
	System.out.println("Enter the integer 2 here");
	int s=sc.nextInt();
	System.out.println(n+" "+b+" "+s);
//	So here after using the scanner for integer first , I am trying to input values of certain string and integer variables in Java. But if I am taking the input of string after the integer, in the console the string input is just skipped and moves to the next input.
//	This is a common problem, and it happens because the nextInt method doesn't read the newline character of your input, so when you issue the command nextLine, the Scanner finds the newline character and gives you that as a line.
// If we give input of string in the same line itself then it will work accordingly but then the sysout line after nextInt() will print later after giving the string input in the same line itself
	
//	Solution 1:
	//  A workaround could be this one:
	String name1;
	int id1,age1;

	Scanner in = new Scanner(System.in);
System.out.println("Enter id");
id1 = in.nextInt();

in.nextLine();   // skip the newline character

System.out.println("Enter name");
 name1 = in.nextLine();
 
// Solution2:
 Scanner input=new Scanner(System.in);
	try {
	    System.out.println("Enter id");
	    id1 = Integer.parseInt(input.nextLine());
	} catch (NumberFormatException e) {
	    e.printStackTrace();
	}
	System.out.println("Enter name");
	name1 = in.nextLine();

//	Solution 3: Take another scanner and take the input of the string through different scanner

}
}
