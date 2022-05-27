package DataStructure;

import java.util.ArrayDeque;

public class DequeImport {
	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<String>();
		
		
		deque.addFirst("FFF");
		deque.addLast("LLL");
		deque.add("hi");
		System.out.println("deque: "+deque);
		System.out.println("size: "+deque.size());
		System.out.println("first peek(): "+deque.peekFirst());
		System.out.println("last peek():"+deque.peekLast());
		System.out.println("peek:"+deque.peek());
	}
	
}
