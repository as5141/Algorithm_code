package LV2;

import java.util.*;

public class Maximize_the_formula {
	public static void main(String[] args) {
		String expression = "100-200*300-500+20";
		System.out.println(solution(expression));
	}

	public static long solution(String expression) {
		long answer = 0;

		String remind = expression.replaceAll("[^0-9]", "/");
		String[] number = remind.split("/");
		remind = expression.replaceAll("[0-9]", "");
		char[][] compareSign = { { '*', '-', '+' }, { '*', '+', '-' }, { '-', '+', '*' }, { '+', '-', '*' },
				{ '-', '*', '+' }, { '+', '*', '-' } };
		Queue<Integer> numberStack = new LinkedList<>();
		Queue<Character> signStack = new LinkedList<>();
		for (int i = 0; i < number.length; i++) {
			numberStack.add(Integer.parseInt(number[i]));
		}

		for (int i = 0; i < remind.length(); i++) {
			signStack.add(remind.charAt(i));
		}

		return answer;
	}

}
