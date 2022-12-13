/*
 * Strings:
 * readline() will read the line
 * 
 * function 
 * BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
 * String s=inp.readLine(); //works as getline() so no harm on inputting integer first and then string unlike scanner do as integer leaves the nextline in the buffer , so string of char just reads the nextline() which is empty and will not read the nextstring. 
 * to resolve the problem with scanner in this case : int then taking string from the user, either use the readline() or create other scanner and take input through that. 
 * int a =Integer.parseInt(a);
 */

//Static: It makes the code executable without creating a object.Means we can access the static function or variables without creating any object. Therefore our main function runs without creating any object.
// program in scanner on inputting integer first and then string

package basics;

import java.util.*;
class function22{
	static Scanner sc=new Scanner(System.in);
//	 Scanner sc=new Scanner(System.in); cann't refer to this

	static int a=1;
//	int b=0; //cann't refer to b
	static void inp() {
		//we cann't make the reference to non static vraiblaes inside the static function. 
		//Even not non static scanner
		a=sc.nextInt();
		System.out.println(a); // now
	}
}

public class Program6 {
	

}
