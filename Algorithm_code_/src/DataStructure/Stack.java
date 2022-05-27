package DataStructure;

public interface Stack {
	boolean isEmpty();
	boolean isFull();
	boolean contains(char item);
	char pop();
	void push(char item);
	void clear();
	char peek();
}
