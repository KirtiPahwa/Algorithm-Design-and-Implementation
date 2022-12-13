package basics;
import java.math.BigInteger;
import java.util.Arrays;
public class Shortcuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
//		gcd
		BigInteger a=BigInteger.valueOf(10);
		BigInteger b=BigInteger.valueOf(18);
		BigInteger gcd=a.gcd(b);
		System.out.println(gcd);
		
//		converting integer to string
		String c=Integer.toString(10);
		System.out.println(c);
		
//		converting string to integer
		System.out.println(Integer.parseInt("1022"));

//		conversion from decimal to any
System.out.println(Integer.parseInt("10101",2));
System.out.println(Integer.parseInt("10723",8));

//conversion from decimal to binary
System.out.println(Integer.toBinaryString(10));  

// conversion from decimal to octal
System.out.println(Integer.toOctalString(19));  

// conversion from decimal to hexadecimal
System.out.println(Integer.toHexString(1029));

// sort function
int arr[]= {5,4,3,2,1};
Arrays.sort(arr);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
	}

}
