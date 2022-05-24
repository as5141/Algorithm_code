package DataStructure;

public interface Stack {
	boolean isEmpty();
	boolean isFull();
	char pop();
	void push(char item);
	void clear();
	char peek();
}
