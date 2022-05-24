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
	private int top;
	private int rear;
	private int topEmpty;
	private int rearEmpty;
	private char[] ArrDeque;
	
	public Deque(int dequeSize) {
		this.dequeSize = dequeSize;
		ArrDeque = new char[this.dequeSize];
		top = this.dequeSize/2 -1;
		rear = this.dequeSize/2 +1;
	}

	@Override
	public boolean firstEmpty() {
		// TODO Auto-generated method stub
		return (rear == rearEmpty);
	}

	@Override
	public boolean lastEmpty() {
		// TODO Auto-generated method stub
		return (top == topEmpty);
	}

	@Override
	public boolean firstFull() {
		// TODO Auto-generated method stub
		return (rear == 0);
	}

	@Override
	public boolean lastFull() {
		// TODO Auto-generated method stub
		return (top == this.dequeSize-1);
		
	}

	@Override
	public char pollFirst() {
		// TODO Auto-generated method stub
		if(firstEmpty()) {
			System.out.println("first Empty");
			return 0;
		}else {
			System.out.println("poll_first: "+ArrDeque[rear]);
			return ArrDeque[rear++];
		}
		
	}

	@Override
	public char pollLast() {
		// TODO Auto-generated method stub
		if(lastEmpty()) {
			System.out.println("last Empty");
			return 0;
		}else {
			System.out.println("poll_last: "+ArrDeque[top]);
			return ArrDeque[top--];
		}
	}

	@Override
	public char peekFirst() {
		// TODO Auto-generated method stub
		if(firstEmpty()) {
			System.out.println("first Empty");
			return 0;
		}else {
			System.out.println("peek_first: "+ArrDeque[rear]);
			return ArrDeque[rear];
		}
	}

	@Override
	public char peekLast() {
		// TODO Auto-generated method stub
		if(lastEmpty()) {
			System.out.println("last Empty");
			return 0;
		}else {
			System.out.println("peek_last: "+ArrDeque[top]);
			return ArrDeque[top];
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (top-rear)+1;
	}

	@Override
	public void addFirst(char item) {
		// TODO Auto-generated method stub
		if(firstFull()) {
			System.out.println("first Full");
		}else {
			//first�� ù �������� ���
			if(top == (this.dequeSize/2)-1 && rear == (this.dequeSize/2)+1 ) {
				top++;
				topEmpty = top;
				rearEmpty = this.dequeSize/2 +1;
				System.out.println("ù�����ʹ� first");
			}
			ArrDeque[--rear] = item;
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
			if(top == (this.dequeSize/2)-1 && rear == (this.dequeSize/2)+1 ) {
				rear--;
				rearEmpty = rear;
				topEmpty = this.dequeSize/2 -1;
				System.out.println("ù�����ʹ� last");
			}
			ArrDeque[++top] = item;
			System.out.println("last add: "+item);
		}
	}

	@Override
	public char removeFirst() {
		// TODO Auto-generated method stub
		if(firstEmpty()) {
			System.out.println("first Empty");
			return 0;
		}else {
			System.out.println("first remove: "+ArrDeque[rear]);
			return ArrDeque[rear++];
		}
	}

	@Override
	public char removeLast() {
		// TODO Auto-generated method stub
		if(lastEmpty()) {
			System.out.println("last Empty");
			return 0;
		}else {
			System.out.println("last remove: "+ ArrDeque[top]);
			return ArrDeque[top--];
		}
		
	}
	
	public void printDeque() {
		for(int i=rear; i<=top; i++) {
			System.out.print(ArrDeque[i]+" ");
		}
		System.out.println();
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
		System.out.println(arrDeque.size());
		
	}
	
}
