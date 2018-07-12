package kapitel11;

import kapitel9.Student;

public class LinkedList {
	
	private Node firstNode = null;

	public void add(Student student){
		Node newNode = new Node(student);
		
		if(firstNode == null){	
			firstNode = newNode;
		}else{
			Node currentNode = firstNode;
			while(currentNode.getNextNode() != null){
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}
	
	private class Node{
		private Student data;
		private Node nextNode;
		
		public Node(Student data){
			this.data = data;
		}
		
		public Node getNextNode(){
			return nextNode;
		}
		
		public void setNextNode(Node nextNode){
			this.nextNode = nextNode;
		}
		
		public Student getData(){
			return this.data;
		}
	}
	
	
	/*
	private Node getLastNode(Node node){
		if(node.getNextNode() != null){
			return getLastNode(node.getNextNode());
		}else{
			return node;
		}
	}
	*/
}
