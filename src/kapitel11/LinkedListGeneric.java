package kapitel11;

//import kapitel9.Student;

public class LinkedListGeneric<V> {
	
	private Node<V> firstNode = null;

	public void add(V student){
		Node<V> newNode = new Node<V>(student);
		
		if(firstNode == null){	
			firstNode = newNode;
		}else{
			Node<V> currentNode = firstNode;
			while(currentNode.getNextNode() != null){
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}
	
	public boolean remove(V data){
		if(firstNode != null){
			if(firstNode.getData().equals(data)){
				firstNode = firstNode.getNextNode();
				return true;
			}else{
				Node<V> currentNode = firstNode;
				while(currentNode.getNextNode() != null){
					if(currentNode.getNextNode().getData().equals(data)){
						currentNode.setNextNode(currentNode.getNextNode().getNextNode());
						return true;
					}
					currentNode = currentNode.getNextNode();
				}
			}
		}
		
		return false;
	}
	
	/*
	public Student remove(int matrikelNr){
		
		if(firstNode == null){
			return null;
		}else{
			if(firstNode.getData().getMatrikelNummer() == matrikelNr){
				Student data = firstNode.getData();
				firstNode = firstNode.getNextNode();
				return data;
			}
			Node currentNode = firstNode;
			while(currentNode.getNextNode() != null){
				if(currentNode.getNextNode().getData().getMatrikelNummer() == matrikelNr){
					Student data = currentNode.getNextNode().getData();
					currentNode.setNextNode(currentNode.getNextNode().getNextNode());
					return data;
				}
				currentNode = currentNode.getNextNode();
			}
		}
		return null;
	}
	*/
	
	public void printLinkedList(){
		if(firstNode == null){
			System.out.println("Die Liste ist leer!");
		}else{
			Node<V> currentNode = firstNode;
			do{
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNextNode();
			}while(currentNode != null);
		}
	}
	
	public void printLinkedListRecursiv(){
		printNode(firstNode);
	}
	
	private void printNode(Node<V> currentNode){
		if(currentNode == null){
			return;
		}else{
			System.out.println(currentNode.getData());
			printNode(currentNode.getNextNode());
		}
	}
	
	private class Node<T>{
		private T data;
		private Node<T> nextNode;
		
		public Node(T data){
			this.data = data;
		}
		
		public Node<T> getNextNode(){
			return nextNode;
		}
		
		public void setNextNode(Node<T> nextNode){
			this.nextNode = nextNode;
		}
		
		public T getData(){
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
