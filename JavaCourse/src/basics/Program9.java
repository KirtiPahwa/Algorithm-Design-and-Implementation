/*
 * ascii:
 * 0-48
 * A-65
 * a-97
 * " "-32
 */

/*
 * 
 * 
 * String literals: create in string pool area . So no duplicates are allowed
 * An example is as follows.

String s1 = “Hello World”;

Here, the s1 is referring to “Hello World” in the String pool.

Assume that there is another statement as follows.

String s2 = “Hello World”;

As “Hello World” already exists in the String pool, the s2 reference variable will also point to the already existing “Hello World” in the String pool. In other words, now both s1 and s2 refer to the same “Hello World” in the String pool. Therefore, if the programmer writes a statement as follows, it will display true.

System.out.println(s1==s2);




String with new opeartion : crates in heap where there can be mor duplicates
String object is a string created using new operator is a String object. An example is as follows.

String s1 = new (“Hello World”);

String s2 = new (“Hello World”);

Unlike with String literals, in this case, there are two separate objects. In other words, s1 refers to one “Hello World” while s2 refers to another “Hello World”. Here, the s1 and s2 are reference variables that refer to separate String objects. Therefore, if the programmer writes a statement as follows, it will display false.

System.out.println(s1==s2);


 */

package basics;

public class Program9 {

}
