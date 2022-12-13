package basics;
//	String functions 
	import java.io.*;
	import java.lang.*;

public class Program12 {
	public static void main(String[] args) throws IOException
	{
	String a = "   true  ";
	String y = "inspiration";
	String x = "INSPIRATION";
	StringBuffer sh1=new StringBuffer("INS");	// creates string buffer sh1 and store INS in it
	sh1.append("PI");				// adds PI to (INS) sh1
	sh1.append("RATION");			// adds RATION to INSPI (now value of sh1)
	sh1.append(" Tarun");				// adds Tarun to INSPIRATION
	System.out.println(x.charAt(7));			// output will be T
	System.out.println(x.substring(5));		// output will be RATION
	System.out.println(x.substring(3,7));		// output will be PIRA
	if(x.equals(y))
	{
	System.out.println(" "+y);		
	}
	else
	{
	System.out.println(" "+x);		// since strings are not equal output - INSPIRATION
		}
	System.out.println(x.length());			// output will be 11
	System.out.println(x.equalsIgnoreCase(y));	// output will be true
	System.out.println(x.compareTo(y));		// output will be -32
	System.out.println(y.toUpperCase());		// output will be INSPIRATION
	System.out.println(x.toLowerCase());		// output will be inspiration
	System.out.println(sh1);				// output will be INSPIRATION Tarun
	System.out.println(a.trim());			// output will be true
	System.out.println(x.concat(y));			// output will be INSPIRATIONinspiration
	System.out.println(sh1.reverse());		// output will be nuraT NOITARIPSNI
	System.out.println(y.replace('i','2'));		// output will be 2nsp2rat2on
	System.out.println(x.indexOf("I",0));		// output will be 0
	System.out.println(x.lastIndexOf("I",10));	// output will be 8
	System.out.println(sh1.insert(3,"y"));		// output will be nuryaT NOITARIPSNI
	}
	}

