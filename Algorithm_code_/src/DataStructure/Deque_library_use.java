

import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque_library_use {
	public static void main(String[] args) {
		ArrayDeque<String> deque1 = new ArrayDeque<String>();
		
		deque1.addFirst("H"); // Deque�� ���ʿ� �����͸� ����, �뷮 �ʰ��� Exception
		System.out.println(deque1);
		deque1.offerFirst("G"); //  Deque�� ���ʿ� �����͸� ���� �� true, �뷮 �ʰ��� false
		System.out.println(deque1);
		deque1.addLast("H"); // Deque�� ���ʿ� �����͸� ����, �뷮 �ʰ��� Exception
		System.out.println(deque1);
		deque1.add("D"); // addLast()�� ����
		System.out.println(deque1);
		deque1.offerLast("S"); //Deque�� ���ʿ� �����͸� ���� �� true, �뷮 �ʰ��� false
		System.out.println(deque1);
		deque1.offer("S"); // offerLast()�� ����
		System.out.println(deque1);
		deque1.push("E"); // addFirst()�� ����
		System.out.println(deque1);
		deque1.pop(); // removeFirst()�� ����
		
		
//		
//		deque1.removeFirst(); // Deque�� �տ��� ����, ��������� ����
//		deque1.remove(); // removeFirst()�� ����
//		deque1.poll(); // Deque�� �տ��� ����, ��������� null ����
//		deque1.pollFirst(); // poll()�� ����
//		
//		deque1.removeLast(); // Deque�� �ڿ��� ����, ��������� ����
//		deque1.pollLast(); // Deque�� �ڿ��� ����, ��������� null ����
//		
//		//Deque�� ���ʿ��� ã�Ƽ� ù ��° �����͸� ����
//		deque1.removeFirstOccurrence("H");
//		// Deque�� ���ʿ��� ã�Ƽ� ù ��° �����͸� ����
//		deque1.removeLastOccurrence("H");
//		// removeFirstOccurrence() �޼ҵ�� ����
//		deque1.remove("H");
//	
//		deque1.getFirst(); // ù ��° ������Ʈ�� Ȯ��, ��������� ����
//	
//		deque1.peekFirst(); // ù ��° ������Ʈ�� Ȯ��, ��������� null ����
//	
//		deque1.peek();// peekFirst()�� ����
//	
//		deque1.getLast(); // ������ ������Ʈ�� Ȯ��, ��������� ����
//		deque1.peekLast();// ������ ������Ʈ�� Ȯ��, ��������� null ����
//	
//		deque1.contains("H"); // Object ���ڿ� ������ ������Ʈ�� ���ԵǾ� �ִ��� Ȯ��
//		deque1.size(); // Deque�� ����ִ� ������Ʈ�� ����
//	
//		//for ���� �̿��� ��ȸ
//		for(String elem : deque1) {
//		System.out.println(elem);}// Iterator�� �̿��� ��ȸ
//	
//		Iterator<String> iterator = deque1.iterator();
//		while(iterator.hasNext()){
//			String elem = iterator.next();
//			System.out.println(elem);
//		}// ������ȸ
//		
//		Iterator<String> reverseIterator = deque1.descendingIterator();
//		while(reverseIterator.hasNext()){
//			String elem = reverseIterator.next();
//			System.out.println(elem);
//		}

	}
}
