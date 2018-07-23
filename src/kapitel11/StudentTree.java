package kapitel11;

import kapitel9.Student;

public class StudentTree {
	
	private Node root = null;
	
	public void insert(Student data){
		Node newNode = new Node(data);
		if(root != null){
			insert(root, newNode);
			return;
		}else{
			this.root = newNode;
		}
	}
	
	private void insert(Node currentNode, Node newNode){
		if(newNode.getData().compareTo(currentNode.getData()) < 0){
			if(currentNode.getLeftNode() == null){
				currentNode.setLeftNode(newNode);
				return;
			}else{
				insert(currentNode.getLeftNode(), newNode);
				return;
			}
		}else if(newNode.getData().compareTo(currentNode.getData()) > 0){
			if(currentNode.getRightNode() == null){
				currentNode.setRightNode(newNode);
				return;
			}else{
				insert(currentNode.getRightNode(), newNode);
				return;
			}
		}else{
			return;
		}
		
		
	}
	
	public Student find(int matrikelNr){
		
		if(root != null){
			return find(root, matrikelNr);
		}
		
		return null;
	}
	
	private Student find(Node currentNode, int matrikelNr){
		
		if(currentNode.getData().getMatrikelNummer() == matrikelNr){
			return currentNode.getData();
		}else{
			Student result = null;
			if(currentNode.getLeftNode() != null){
				 result = find(currentNode.getLeftNode(), matrikelNr);
			}
			
			if(result != null){
				return result;
			}
			
			if(currentNode.getRightNode() != null){
				return find(currentNode.getRightNode(), matrikelNr);
			}
		}
		
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
