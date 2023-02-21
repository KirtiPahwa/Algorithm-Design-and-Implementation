package practiceQuestions;
import java.util.*;
class Trie1{
	int count=0;
	Scanner sc=new Scanner(System.in);
	int num;
	Trie1(String []arr){
		num=arr.length;
		for(int i=0;i<num;i++) {
			insert(arr[i]);
		}
	}
	private class TrieNode{
		TrieNode[] children=new TrieNode[26];
		boolean wordEnd;
		TrieNode() {
			for(int i=0;i<26;i++) {
				children[i]=null;
				wordEnd=false;
			}
		}
	}
	TrieNode root=new TrieNode();
	void insert(String word) {
		TrieNode node=root;
		for(int i=0;i<word.length();i++) {
			int ind=word.charAt(i)-'a';
			if(node.children[ind]==null) {
				node.children[ind]=new TrieNode();
			}
			if(i==word.length()-1) {
				node.children[ind].wordEnd=true;
			}
			node=node.children[ind];
			}
	}
	boolean wordSearch(String s) {
		TrieNode node=root;
		for(int i=0;i<s.length();i++) {
			int idx=s.charAt(i)-'a';
			if(node.children[idx]==null) {
				return false;
			}
			if(i==s.length()-1 && node.children[idx].wordEnd==false) {
				return false;
			}
			node=node.children[idx];
			}
		return true;
	}
	boolean wordBreak(String word) {
		if(word.length()==0)return true;
//		boolean flag=false;
		for(int i=1;i<=word.length();i++) {
			String first=word.substring(0,i);
			String second=word.substring(i);
			if(wordSearch(first) && wordSearch(second)) {
//				flag=true;
				count++;
				return true;
				
			}
		}
		return false;
	}
}

public class Program1 {
	

	public static void main(String[] args) {
		String s="mango man go mangoes goes es";
		String arr[]=s.split("\\s");
		Trie1 a=new Trie1(arr);
		a.wordBreak("mangoesman");
System.out.println(a.count);
	}

}
