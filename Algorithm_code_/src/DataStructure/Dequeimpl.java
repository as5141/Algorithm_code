package DataStructure;

public interface Dequeimpl {
	boolean firstEmpty();
	boolean lastEmpty();
	boolean firstFull();
	boolean lastFull();
	char pollFirst();
	char pollLast();
	char peekFirst();
	char peekLast();
	int size();
	void addFirst(char item);
	void addLast(char item);
	char removeFirst();
	char removeLast();
}
