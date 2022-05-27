package DataStructure;

public class ArrStack implements Stack {
	
	private int top;
	private int stackSize;
	private char ArrStack[];
	
	
	public ArrStack(int stackSize) {
		this.stackSize = stackSize;
		//만약 데이터가 없으면 -1
		top = -1;
		ArrStack = new char[this.stackSize];
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		//top이 -1이라면 빈 배열
		return (top == -1);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		//top이 stackSize-1 즉, 배열의 크기만큼 커졌다면 Full
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
			//pop한 값을 출력한 후 ArrStack[top]을 retuen 해주고 -1하여 pop 구현
			return ArrStack[top--];
			
		}
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			//처리해주기 전 top+1 해주어 push
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
			//top을 초기화 시켜주고 새로운 배열을 생성
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
		//배열의 사이즈를 정해줌
		int stackSize = 5;
		//사이즈를 기반으로 배열 선언
		ArrStack arrStack = new ArrStack(stackSize);
		char a,b;
		
		arrStack.push('A');
		arrStack.printArrStack();
		
		arrStack.push('B');
		arrStack.push('C');
		
		arrStack.printArrStack();
		//peek 같은 경우 char을 리턴하여 리턴값이 있음.
		a = arrStack.peek();
		System.out.println("a: "+a);
		
		//pop 같은 경우 char을 리턴하여 리턴값이 있음.
		b = arrStack.pop();
		System.out.println("b: "+b);
		arrStack.push('A');
		arrStack.printArrStack();
		System.out.println("A가 있는가? "+arrStack.contains('A'));
		arrStack.clear();
		arrStack.printArrStack();
		arrStack.clear();
		
		
	}
}
