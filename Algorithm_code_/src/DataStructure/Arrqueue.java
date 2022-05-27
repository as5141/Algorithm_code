package DataStructure;

public class Arrqueue implements queueimpl{
	private int rear;
	private int front;
	private int queueSize;
	private char[] arrQueue;
	
	public Arrqueue(int queueSize) {
		this.queueSize = queueSize;
		this.front = 0;
		this.rear = 0;
		arrQueue = new char[this.queueSize];
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (rear == queueSize);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front == rear) {
			System.out.println("already Empty - resetStart");
			reset();
			return true;
		}else {
			return false;
		}
	}

	@Override
	public char top() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return 0;
		}else {
			System.out.println("top:"+arrQueue[front]);
			return arrQueue[front];
		}
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return 0;
		}else {
			System.out.println("pop: "+ arrQueue[front]);
			return arrQueue[front++];
		}
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("already Full");
		}else {
			arrQueue[rear++] = item;
			System.out.println("push:"+item);
		}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (rear-front);
	}
	
	public void printQueue() {
		if(isEmpty()) {
			
		}else{
			for(int i=front; i<rear; i++) {
				System.out.print(arrQueue[i]+" ");
			}
		}
		System.out.println();
	}
	
	public void reset() {
		System.out.println("reset");
		front = 0;
		rear = 0;
	}
	
	public static void main(String[] args) {
		int queueSize = 5;
		Arrqueue arrqueue = new Arrqueue(queueSize);
		
		//push(char), pop(), top(), size(), printQueue() 등으로 Queue를 확인해보세요.
		arrqueue.push('A');
		arrqueue.push('B');
		arrqueue.printQueue();
		arrqueue.pop();
		
	}

}
