package hashing;
import java.util.*;
public class LinearProbing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Integer [] num=new Integer[n];
		int [] hash=new int[10];
		for(int i=0;i<n;i++) {
			num[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			int j=num[i]%10;
			if(hash[j]!=0) {
				int k=j;
				boolean f=false;
				while(k<10) {   //checking empty space from j to last index
					if(hash[k]==0) {
						f=true;
						hash[k]=num[i];
						break;
					}
					k++;
				}
				if(k==10) {    //if k reached the hash size
					k=0;  //pointing k to 0 index
					while(k<j) {  //checking empty space from 0 to j
						if(hash[k]==0) {
							f=true;
							hash[k]=num[i];
							break;
						}
						k++;
					}
				}
				if(f==false) {
					System.out.println("All the places are filled");
				}
				
			}
			else {
				hash[j]=num[i];
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(hash[i]+" ");
		}

	}


}
