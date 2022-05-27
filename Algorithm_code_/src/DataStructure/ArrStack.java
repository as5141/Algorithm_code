package DataStructure;

public class ArrStack implements Stack {
	
	private int top;
	private int stackSize;
	private char ArrStack[];
	
	
	public ArrStack(int stackSize) {
		this.stackSize = stackSize;
		//���� �����Ͱ� ������ -1
		top = -1;
		ArrStack = new char[this.stackSize];
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		//top�� -1�̶�� �� �迭
		return (top == -1);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		//top�� stackSize-1 ��, �迭�� ũ�⸸ŭ Ŀ���ٸ� Full
		return (top == this.stackSize-1);
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("already Empty");
			return 0;
		}else {
			System.out.println("pop: "+ArrStack[top]);
			//pop�� ���� ����� �� ArrStack[top]�� retuen ���ְ� -1�Ͽ� pop ����
			return ArrStack[top--];
			
		}
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			//ó�����ֱ� �� top+1 ���־� push
			ArrStack[++top] = item;
			System.out.println("push: "+item);
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("already clear");
		}else {
			//top�� �ʱ�ȭ �����ְ� ���ο� �迭�� ����
			top = -1;
			ArrStack = new char[this.stackSize];
			System.out.println("clear ok");
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		System.out.println("peek :"+ ArrStack[top]);
		return ArrStack[top];
	}
	
	@Override
	public boolean contains(char item) {
		for(int i=0; i<=top; i++) {
			if(item == ArrStack[i]) {
				return true;
			}
		}
		return false;
	}
	
	public void printArrStack() {
		for(int i=0; i<=top; i++) {
			System.out.print(ArrStack[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//�迭�� ����� ������
		int stackSize = 5;
		//����� ������� �迭 ����
		ArrStack arrStack = new ArrStack(stackSize);
		char a,b;
		
		arrStack.push('A');
		arrStack.printArrStack();
		
		arrStack.push('B');
		arrStack.push('C');
		
		arrStack.printArrStack();
		//peek ���� ��� char�� �����Ͽ� ���ϰ��� ����.
		a = arrStack.peek();
		System.out.println("a: "+a);
		
		//pop ���� ��� char�� �����Ͽ� ���ϰ��� ����.
		b = arrStack.pop();
		System.out.println("b: "+b);
		arrStack.push('A');
		arrStack.printArrStack();
		System.out.println("A�� �ִ°�? "+arrStack.contains('A'));
		arrStack.clear();
		arrStack.printArrStack();
		arrStack.clear();
		
		
	}
}
