package DataStructure;

public class circularQueue implements circularQueueimpl{
	private int rear;
	private int front;
	private int size;
	private int queueSize;
	private char[] circularQueue;
	
	public circularQueue(int queueSize) {
		this.queueSize = queueSize;
		this.front = 0;
		this.rear = 0;
		this.size = 0;
		circularQueue = new char[this.queueSize];
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (size == queueSize);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return(size == 0);
	}

	@Override
	public char top() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return 0;
		}else {
			System.out.println("top:"+circularQueue[front]);
			return circularQueue[front];
		}
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return 0;
		}else {
			System.out.println("pop: "+ circularQueue[front]);
			size--;
			if(front == this.queueSize-1) {
				front = 0;
				return circularQueue[this.queueSize-1];
			}
			return circularQueue[front++];
		}
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("already Full");
		}else{
			circularQueue[rear++] = item;
			System.out.println("push:"+item);
			size++;
			if(rear == this.queueSize) {
				//순환해줌
				rear = 0;
			}
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public void printQueue() {
		int printsize = size;
		int printfront = front;
		if(isEmpty()) {
			
		}else{
			//size가 0 보다 크다면 반복
			while(printsize > 0) {
				//순환해서 출력을 위해 size max에 도달하면 다시 index 0 으로 보내주어 순환
				if(printfront == queueSize) {
					printfront = 0;
				}
				System.out.print(circularQueue[printfront]+" ");
				printfront++;
				printsize--;
			}
			System.out.println();
			System.out.println("front: "+front+"       rear: "+rear+"       size: "+size);
		}
	}
	
	public static void main(String[] args) {
		int queueSize = 5;
		circularQueue circularqueue = new circularQueue(queueSize);
		
		//push(char), pop(), top(), size(), printQueue() 등으로 환형 Queue를 확인해보세요.
		circularqueue.push('A');
		
	}
}
