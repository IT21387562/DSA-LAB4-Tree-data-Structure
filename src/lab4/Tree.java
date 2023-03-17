package lab4;

public class Tree {
	
	//first node of the tree
	private Node root;
	
	public Tree() {
		root = null;//empty tree
	}
	
	void insert(int emp, String name) {
		
		Node n = new Node(); //create new node
		
		n.empNo = emp;
		n.empName = name;
		
		//if no node in root
		if(root == null) {
			root = n; //if tree is empty make the new node as tree
		}
		else//insert a new node
			{
			Node current = root; //start at root
			Node parent;
			
			while(true) {
				parent = current;
				
				//go left
				if(emp<current.empNo) {
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = n;
						return;
					}
				}
				else //go right
					{
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = n;
						return;
					}
					
				}
			}
		}	
	}
	
	private void inOrder(Node localRoot) { //left,root,right
		
		if(localRoot!=null) {
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	
	public void TraverseinOrder() {
		inOrder(root);
	}
	
	
	private void preOrder(Node localRoot) { //root,left,right
		
		if(localRoot!=null) {
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	public void TraversepreOrder() {
		preOrder(root);
	}
	
	
	private void postOrder(Node localRoot) { //left, right, root
		
		if(localRoot!=null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	
	public void TraversepostOrder() {
		postOrder(root);
	}
	
	private Node findRecursive(Node localRoot, int emp) {
		
		if(localRoot==null) {
			return null;
		}
		
		else if(localRoot.empNo==emp){
			System.out.println(localRoot.empNo);
			return localRoot;
		}
		
		else if(emp<localRoot.empNo) {
			return findRecursive(localRoot.leftChild, emp);
		}
		else {
			return findRecursive(localRoot.rightChild, emp);
		}
	}
	
	public Node callRecursive(int emp) {
		return findRecursive(root,emp);
	}
	
	public Node find(int emp) {
		
		Node current = root;
		
		while(current.empNo != emp) {
			
			if(emp<current.empNo) 
				current = current.leftChild;
			else
				current = current.rightChild;
			if(current==null)
				return null;	
		}
		
		return current;
	}
	

	
	public void deleteAll() {
		
	}

}
