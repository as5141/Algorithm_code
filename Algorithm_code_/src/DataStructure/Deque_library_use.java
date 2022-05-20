

import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque_library_use {
	public static void main(String[] args) {
		ArrayDeque<String> deque1 = new ArrayDeque<String>();
		
		deque1.addFirst("H"); // Deque의 앞쪽에 데이터를 삽입, 용량 초과시 Exception
		System.out.println(deque1);
		deque1.offerFirst("G"); //  Deque의 앞쪽에 데이터를 삽입 후 true, 용량 초과시 false
		System.out.println(deque1);
		deque1.addLast("H"); // Deque의 뒤쪽에 데이터를 삽입, 용량 초과시 Exception
		System.out.println(deque1);
		deque1.add("D"); // addLast()와 동일
		System.out.println(deque1);
		deque1.offerLast("S"); //Deque의 뒤쪽에 데이터를 삽입 후 true, 용량 초과시 false
		System.out.println(deque1);
		deque1.offer("S"); // offerLast()와 동일
		System.out.println(deque1);
		deque1.push("E"); // addFirst()와 동일
		System.out.println(deque1);
		deque1.pop(); // removeFirst()와 동일
		
		
//		
//		deque1.removeFirst(); // Deque의 앞에서 제거, 비어있으면 예외
//		deque1.remove(); // removeFirst()와 동일
//		deque1.poll(); // Deque의 앞에서 제거, 비어있으면 null 리턴
//		deque1.pollFirst(); // poll()과 동일
//		
//		deque1.removeLast(); // Deque의 뒤에서 제거, 비어있으면 예외
//		deque1.pollLast(); // Deque의 뒤에서 제거, 비어있으면 null 리턴
//		
//		//Deque의 앞쪽에서 찾아서 첫 번째 데이터를 삭제
//		deque1.removeFirstOccurrence("H");
//		// Deque의 뒤쪽에서 찾아서 첫 번째 데이터를 삭제
//		deque1.removeLastOccurrence("H");
//		// removeFirstOccurrence() 메소드와 동일
//		deque1.remove("H");
//	
//		deque1.getFirst(); // 첫 번째 엘리먼트를 확인, 비어있으면 예외
//	
//		deque1.peekFirst(); // 첫 번째 엘리먼트를 확인, 비어있으면 null 리턴
//	
//		deque1.peek();// peekFirst()와 동일
//	
//		deque1.getLast(); // 마지막 엘리먼트를 확인, 비어있으면 예외
//		deque1.peekLast();// 마지막 엘리먼트를 확인, 비어있으면 null 리턴
//	
//		deque1.contains("H"); // Object 인자와 동일한 엘리먼트가 포함되어 있는지 확인
//		deque1.size(); // Deque에 들어있는 엘리먼트의 개수
//	
//		//for 문을 이용한 순회
//		for(String elem : deque1) {
//		System.out.println(elem);}// Iterator를 이용한 순회
//	
//		Iterator<String> iterator = deque1.iterator();
//		while(iterator.hasNext()){
//			String elem = iterator.next();
//			System.out.println(elem);
//		}// 역순순회
//		
//		Iterator<String> reverseIterator = deque1.descendingIterator();
//		while(reverseIterator.hasNext()){
//			String elem = reverseIterator.next();
//			System.out.println(elem);
//		}

	}
}
