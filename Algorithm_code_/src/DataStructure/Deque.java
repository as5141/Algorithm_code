package DataStructure;

//addFirst -> �տ� �߰�
//addLast -> �ڿ� �߰�
//pollFirst 	-> �տ� ���� �����ϰ� �ش� ���� ����
//pollLast		-> �ڿ� ���� �����ϰ� �ش� ���� ����
//removeFirst 	-> ���� ���� �տ� ���� ����
//removeLast 	-> ���� ���� �ڿ� ���� ����
//peekFirst 	-> �տ� �� ����
//peekLast 		-> �ڿ� �� ����
//size			-> ��ũ�� ����� ���
//printDeque	-> ��ũ ����Ʈ

public class Deque implements Dequeimpl{
	
	private int dequeSize;
	private int rear;
	private int front;
	private int rearEmpty;
	private int frontEmpty;
	private char[] ArrDeque;
	
	public Deque(int dequeSize) {
		this.dequeSize = dequeSize;
		ArrDeque = new char[this.dequeSize];
		rear = this.dequeSize/2 -1;
		front = this.dequeSize/2 +1;
	}

	@Override
	public boolean firstEmpty() {
		// TODO Auto-generated method stub
		return (front == frontEmpty);
	}

	@Override
	public boolean lastEmpty() {
		// TODO Auto-generated method stub
		return (rear == rearEmpty);
	}

	@Override
	public boolean firstFull() {
		// TODO Auto-generated method stub
		return (front == 0);
	}

	@Override
	public boolean lastFull() {
		// TODO Auto-generated method stub
		return (rear == this.dequeSize-1);
		
	}

	@Override
	public char pollFirst() {
		// TODO Auto-generated method stub
		if(firstEmpty()) {
			System.out.println("first Empty");
			return 0;
		}else {
			System.out.println("poll_first: "+ArrDeque[front]);
			return ArrDeque[front++];
		}
		
	}

	@Override
	public char pollLast() {
		// TODO Auto-generated method stub
		if(lastEmpty()) {
			System.out.println("last Empty");
			return 0;
		}else {
			System.out.println("poll_last: "+ArrDeque[rear]);
			return ArrDeque[rear--];
		}
	}

	@Override
	public char peekFirst() {
		// TODO Auto-generated method stub
		if(firstEmpty()) {
			System.out.println("first Empty");
			return 0;
		}else {
			System.out.println("peek_first: "+ArrDeque[front]);
			return ArrDeque[front];
		}
	}

	@Override
	public char peekLast() {
		// TODO Auto-generated method stub
		if(lastEmpty()) {
			System.out.println("last Empty");
			return 0;
		}else {
			System.out.println("peek_last: "+ArrDeque[rear]);
			return ArrDeque[rear];
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return ((rear-front)+1==-1) ? 0 : (rear-front)+1;
	}

	@Override
	public void addFirst(char item) {
		// TODO Auto-generated method stub
		if(firstFull()) {
			System.out.println("first Full");
		}else {
			//first�� ù �������� ���
			if(rear == (this.dequeSize/2)-1 && front == (this.dequeSize/2)+1 ) {
				rear++;
				rearEmpty = rear;
				frontEmpty = this.dequeSize/2 +1;
				System.out.println("ù�����ʹ� first");
			}
			ArrDeque[--front] = item;
			System.out.println("first add: "+item);
		}
		
	}

	@Override
	public void addLast(char item) {
		// TODO Auto-generated method stub
		if(lastFull()) {
			System.out.println("last Full");
		}else {
			//last�� ù �������� ��� 
			if(rear == (this.dequeSize/2)-1 && front == (this.dequeSize/2)+1 ) {
				front--;
				frontEmpty = front;
				rearEmpty = this.dequeSize/2 -1;
				System.out.println("ù�����ʹ� last");
			}
			ArrDeque[++rear] = item;
			System.out.println("last add: "+item);
		}
	}

	@Override
	public char removeFirst() {
		// TODO Auto-generated method stub
		if(firstEmpty()) {
			if(lastEmpty()) {
				//front, rear �ʱ�ȭ
				reset();
			}else {
				System.out.println("first Empty");
			}
			return 0;
		}else {
			System.out.println("first remove: "+ArrDeque[front]);
			return ArrDeque[front++];
		}
	}

	@Override
	public char removeLast() {
		// TODO Auto-generated method stub
		if(lastEmpty()) {
			if(firstEmpty()) {
				//front, rear �ʱ�ȭ
				reset();
			}else {
				System.out.println("last Empty");
			}
			return 0;
		}else {
			System.out.println("last remove: "+ ArrDeque[rear]);
			return ArrDeque[rear--];
		}
		
	}
	
	public void printDeque() {
		for(int i=front; i<=rear; i++) {
			System.out.print(ArrDeque[i]+" ");
		}
		System.out.println();
	}
	
	public void reset() {
		rear = this.dequeSize/2 -1;
		front = this.dequeSize/2 +1;
	}
	
	public static void main(String[] args) {
		int dequeSize = 5;
		Deque arrDeque = new Deque(dequeSize);
		
		arrDeque.addLast('R');
		arrDeque.addFirst('A');
		arrDeque.printDeque();
		arrDeque.addLast('B');
		arrDeque.printDeque();
		arrDeque.addFirst('C');
		arrDeque.addFirst('B');
		arrDeque.printDeque();
		arrDeque.addFirst('D');
		arrDeque.addLast('E');
		arrDeque.addLast('T');
		arrDeque.printDeque();
		arrDeque.peekFirst();
		arrDeque.peekLast();
		arrDeque.removeFirst();
		arrDeque.removeLast();
		arrDeque.peekFirst();
		arrDeque.peekLast();
		arrDeque.printDeque();
		
	}
	
}
