package Tries;
import java.util.*;

class Trie1
{
	Scanner sc=new Scanner(System.in);
	int numOfWords;
	Trie1()
	{
		System.out.println("Enter number of Words:");
		numOfWords=sc.nextInt();
		System.out.println("Enter the Words:");
		for(int i=0;i<numOfWords;i++)
			insert(sc.next());
		
	}
	
	private class TrieNode
	{
		TrieNode[] children=new TrieNode[26];
		boolean wordEnd;
		
		TrieNode()
		{
//			for(int i=0;i<26;i++) children[i]=null;
			wordEnd=false;
		}
	}
	
	TrieNode root=new TrieNode();
	// add ant, atom
/*	
	'a'-'a' 0
	'b'-'a' 1
	'c'-'a' 2
	
	'z'-'a' 25
	
	
						null
					a
				n		t
			t we=true			o
								m we=false
								i	we=true
	*/
	void insert(String word)
	{
		TrieNode node=root;
		for(int i=0;i<word.length();i++)
		{
			int index= word.charAt(i)-'a';
			if(node.children[index]==null) node.children[index]=new TrieNode();
			if(i==word.length()-1) node.children[index].wordEnd=true;
			node=node.children[index];
		}
	}
	
	boolean wordSearch(String word)
	{
		TrieNode node=root;
		for(int i=0;i<word.length();i++)
		{
			int index=word.charAt(i)-'a';
			if(node.children[index]==null) return false;
			if(i==word.length()-1 && node.children[index].wordEnd==false) return false;
			node=node.children[index];
		}
		return true;
	}
	void wordSearch()
	{
		System.out.println("Enter the word to search");
		String word=sc.next();
		if(wordSearch(word)) System.out.println(word+" is Present");
		else System.out.println(word+" is NOT Present");
	}
	
	boolean wordBreak(String word)
	{
		if(word.length()==0) return true;
		for(int i=1;i<=word.length();i++)
		{
			String first=word.substring(0,i);
			String second= word.substring(i);
			if(wordSearch(first) && wordBreak(second)) return true;
		}
		return false;
	}
	void wordBreak()
	{
		System.out.println("Enter the String to search");
		String word=sc.next();
		if(wordBreak(word)) System.out.println(word+" is Present");
		else System.out.println(word+" is NOT Present");
	}
	
	
	
}

public class trieDSA {

	public static void main(String[] args) {
		Trie1 T=new Trie1();
		T.wordSearch();
		T.wordSearch();
		T.wordSearch();
		
		T.wordBreak();
		T.wordBreak();
		T.wordBreak();
			
	}

}

//Word Break Problem

/*
  i am rajesh not raj
  
  iamrajesh ""
  
  i amrajesh
  ia mrajesh
  i am rajesh
  ia m raj esh
  
  
  i amrajesh
  
  	am rajesh
  	   rajesh ""
  
 */


