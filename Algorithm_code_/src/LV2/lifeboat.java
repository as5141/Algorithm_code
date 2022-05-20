package LV2;

import java.util.*;

public class lifeboat {

	public static void main(String[] args) {
		int[] people = { 70, 50, 80, 50 };
		int limit = 100;

		System.out.println(solution(people, limit));
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;
		int pass = 0;
		Queue<Integer> weight = new LinkedList<Integer>();
		Stack<Integer> weightStack = new Stack<Integer>();
		weightStack.push(people[0]);
		for (int i = 1; i < people.length; i++) weight.add(people[i]);

		
		while (weight.size() > 1) {
			if (weight.peek() + weightStack.peek() <= limit) {
				weight.remove();
				weightStack.clear();
				answer += 
						1;
				weightStack.add(weight.peek());
			}else if(pass == weight.size()){
				answer += 1;
				weightStack.clear();
				weightStack.add(weight.poll());
				if(weight.size() == 1) {
					answer += 1;
					break;
				}
			}else {
				pass += 1;
				weight.add(weight.poll());
			}
		}
		
		answer += 1;

		return answer;
	}
}
