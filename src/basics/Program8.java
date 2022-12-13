package basics;
/*
 * String buffer:
 * buffer is virtual space.
 * So at the time of declarataion of string buffer, we can have string upto 32 chars.But after declaration we can have the string upto any length
 * 
 * 
 * 	String vs	StringBuffer
5	String utilises a string constant pool to store the values.	Buffer prefers heap memory to store the objects.
 .replace() function cann't be used with string m can be used with just string buffer because string is immutable and stores in string constant pool(cannt be duplicate) and buffer stores in heap area(mutable area,can be duplicate alos)
 
 *Here null character is not with char array or char string.
 *C++ -- uses a marker, the null character, denoted by '\0', to indicate the end of the string. Note: A string is different from an array of characters in that the null character is at the end of the string.
But there is no null character at the end of string

String	StringBuffer
1)	The String class is immutable.	The StringBuffer class is mutable.
2)	String is slow and consumes more memory when we concatenate too many strings because every time it creates new instance.	StringBuffer is fast and consumes less memory when we concatenate t strings.
3)	String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.	StringBuffer class doesn't override the equals() method of Object class.
4)	String class is slower while performing concatenation operation.	StringBuffer class is faster while performing concatenation operation.
5)	String class uses String constant pool.	StringBuffer uses Heap memory



//throw IOException throws any error occured (general exception)
 */
public class Program8 {
	public static void main(String[]args) {
		
		
	}

}
