package kapitel11;

import kapitel9.Student;

public class StudentTree {
	
	private Node root = null;
	
	public void insert(Student data){
		Node newNode = new Node(data);
		if(root != null){
			// TODO
		}else{
			this.root = newNode;
		}
	}
	
	public Student find(int matrikelNr){
		// TODO
		return null;
	}
	
	
	private class Node{
		private Student data;
		private Node leftNode = null;
		private Node rightNode = null;
		
		public Node(Student data){
			this.data = data;
		}
		
		public Student getData(){
			return this.data;
		}
		
		public void setLeftNode(Node node){
			this.leftNode = node;
		}
		
		public void setRightNode(Node node){
			this.rightNode = node;
		}
		
		public Node getLeftNode(){
			return this.leftNode;
		}
		
		public Node getRightNode(){
			return this.rightNode;
		}
	}

}
