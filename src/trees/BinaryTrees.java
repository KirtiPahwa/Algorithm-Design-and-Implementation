package trees;

/*
 * Important:
 * c++: we usually keep Node*& head in function as a parameter so that if we do
 * void insertAtStart(Node *&head, int ele)  
{
    Node *node = new Node(ele);
        head = node;
     
}int main(){
    Node* root=new Node(5);
    insertAtStart(root,6); //root is passed by address so, root will now pointing to node with ele=6 as we changed the referene of head in insertAtStart function and root is passed by reference therefore root also changed
    cout<<root->data<<endl; //6
    return 0;
} 
//But here root is not passed with reference;
void insertAtStart(Node *head, int ele)  
{
    Node *node = new Node(ele);
        head = node;
     
}int main(){
    Node* root=new Node(5);
    insertAtStart(root,6); //root is not passed by address so, root will keep pointing to node with ele=5 . In functino , only head(variable)'s reference is changed.ie,. head starts pointing to node with ele=6 now . But not root . root will keep pionting to the actual head with ele=5
    cout<<root->data<<endl;  //5
    return 0;
} 

//But if we try to change the data of the root in function then it will change bcz head is poiting to root and head->Data means root->data. So if you change head->Data then root->Data will also be changed
// so if you chngin the data then it doesnot matter that you are passing its reference or not.
void insertAtStart(Node *&head, int ele)
{
    head->data=ele;
     
}int main(){
    Node* root=new Node(5);
    insertAtStart(root,6);
    cout<<root->data<<endl; //6

    return 0;
}

//same ans because we are changing the data
 * void insertAtStart(Node *head, int ele)
{
    head->data=ele;
     
}int main(){
    Node* root=new Node(5);
    insertAtStart(root,6);
    cout<<root->data<<endl; //6

    return 0;
}




IN JAVA:
in java we cannot use & operator to pass th value . therefore in java varaible aree alwasy passed by value . It cannot be referecne . There are methods to change. (eg., return the updated value and assign it to the same variable)
So in trees also, Your cannot pass node's reference . so if you try to change the reference of head which is pointing to the root now. SO if you do head=new nOde , then root will not be affected.
But if you change the data then like c++, it will change the data.


 */


 class BinaryTree{
	public int data;
	public BinaryTree left;
	public BinaryTree right;
	public BinaryTree(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
	public void insertNode(BinaryTree head,int data) {
////		if(head==null) {
////			head=new BinaryTree(data);
////			return;
////		}
//		if(head.left==null) {	
//			head.left=new BinaryTree(data);
//			return;
//		}
//		else if(head.right==null) {
//			head.right=new BinaryTree(data);
//			return;
//		}
//		insertNode(head.left,data);
//		insertNode(head.right,data);
		BinaryTree a=new BinaryTree(7);
		head=a;
		}
	static void inorderTraversal(BinaryTree Node) {
		if(Node!=null) {
			inorderTraversal(Node.left);
			System.out.print(Node.data+" ");
			inorderTraversal(Node.right);
		}
	}
	static void preOrderTraversal(BinaryTree Node) {
		if(Node!=null) {
			System.out.print(Node.data+" ");
			preOrderTraversal(Node.left);
			preOrderTraversal(Node.right);
		}
	}
	static void postOrderTraversal(BinaryTree Node) {
		if(Node!=null) {
			postOrderTraversal(Node.left);
			postOrderTraversal(Node.right);
			System.out.print(Node.data+" ");

		}
	}
}
public class BinaryTrees {
	

	public static void main(String[] args) {
		BinaryTree head=new BinaryTree(1);
//		head.insertNode(head,2);
//		head.insertNode(head,3);
//		head.insertNode(head,4);
//		head.insertNode(head,5);
//		head.insertNode(head,6);
		
		/*     1
		 *    2  3
		 *   4 5 6 7
		 * 
		 *  
		 *  
		 */
		
		head.left=new BinaryTree(2);
		head.right=new BinaryTree(3);
		head.left.left=new BinaryTree(4);
		head.left.right=new BinaryTree(5);
		head.right.left=new BinaryTree(6);
		head.right.right=new BinaryTree(7);

//		BinaryTree.inorderTraversal(head);
//		System.out.println();
//		BinaryTree.postOrderTraversal(head);
//		System.out.println();
		head.insertNode(head,5);
		BinaryTree.preOrderTraversal(head);
		System.out.println();

		

	}

}



