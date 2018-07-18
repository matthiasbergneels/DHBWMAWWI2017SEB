package kapitel11;

public class Queue<T> {
	
	private Node<T> firstNode = null;
	private Node<T> lastNode = null;
	private int size = 0;
	
	public void enqueue(T data){
		this.size++;
		Node<T> newNode = new Node<T>(data);
		
		if(this.lastNode != null){
			this.lastNode.setNextNode(newNode);
			this.lastNode = newNode;
		}else{
			this.lastNode = newNode;
			this.firstNode = newNode;
		}
	}
	
	public T dequeue(){
		if(this.firstNode != null){
			T data = this.firstNode.getData();
			this.firstNode = firstNode.getNextNode();
			if(this.firstNode == null){
				this.lastNode = null;
			}
			this.size--;
			return data;
		}
		
		return null;
	}

	public int size(){
		return this.size;
	}
	
	private class Node<V>{
		private V data;
		private Node<V> nextNode;
		
		public Node(V data){
			this.data = data;
			this.nextNode = null;
		}
		
		public V getData(){
			return this.data;
		}
		
		public Node<V> getNextNode(){
			return this.nextNode;
		}
		
		public void setNextNode(Node<V> nextNode){
			this.nextNode = nextNode;
		}
	}
}
