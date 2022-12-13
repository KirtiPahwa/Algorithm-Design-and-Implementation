package basics;
// compile: javac myclass22.java
// if you give the class public then your name of the class and name of the file should be same
// Run:java myclass22 2 3
// args[0]=1
// args[1]=2 here 1 and 2 are strings so have to convert it into integer using parseInteger() method

// static is different in c++ and java . Here in java, elements inside the static class or function should also be static else it will give you compile time error
// static is also used to execute the files
// String args[] is command line argument. We have to pass the parameter else it will not work because in java object need to be allocated the memory to work even it is null. Therefore written string args[] to allocate some memory to the main function else the automatic garbage collection will pass it into garbage collection

// In java, there is automatic garbage collection. But in c++, there is not ,we have to delete the object or variable after creating . But in java , automatic garbage collection will clear the data allocated to the object or variable when they are not in use.
// In scanner class object , we pass current input stream System.in in the object to link it with current input stream and fetch the data and store it in the taken scanner object

/*The static can be:

Variable (also known as a class variable)
Method (also known as a class method)
Block
Nested class

) Java static variable
If you declare any variable as static, it is known as a static variable.

The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.
Advantages of static variable
It makes your program memory efficient (i.e., it saves memory).



2) Java static method
If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.

3) Java static block
Is used to initialize the static data member.
It is executed before the main method at the time of classloading.

// There is not multiple inheritance unlike java

*/
public class HelloWorld {
public static void main(String args[]) { 

	System.out.println("Welcome to Java");
}
}
