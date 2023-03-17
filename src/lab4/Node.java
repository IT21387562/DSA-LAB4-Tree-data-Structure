package lab4;

public class Node {
	
	/*Implement a Node class with suitable attributes to store employee number and name of 
	employees. */
	public int empNo; //keyValue
	public String empName; //Data
	public Node leftChild;
	public Node rightChild;
	
	//Implement displayNode ( ) method to display the details stored in a Node.
	public void displayNode() {
		System.out.println("Employee ID : "+empNo);
		System.out.println("Employee Name : "+empName);
	}

}
