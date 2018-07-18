package kapitel11;

public class Stack<T> {
	
	private Node<T> topNode = null;
	
	public void push(T data){
		Node<T> newNode = new Node<T>(data, topNode);
		topNode = newNode;
	}
	
	public T peek(){
		if(topNode != null){
			return topNode.getData();
		}
		
		return null;
	}
	
	public T pop(){
		if(topNode != null){
			T data = topNode.getData();
			topNode = topNode.getNextNode();
			return data;
		}
		return null;
	}
	
	private class Node<V>{
		
		private V data;
		private Node<V> nextNode;
		
		public Node(V data, Node<V> nextNode){
			this.data = data;
			this.nextNode = nextNode;
		}
		
		public V getData(){
			return this.data;
		}
		
		public Node<V> getNextNode(){
			return this.nextNode;
		}
	}
}
