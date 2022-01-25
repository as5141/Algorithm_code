package LV1;

public class keypad {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";

		System.out.println(solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int left = 10;
		int right = 12;
		for (int i : numbers) {
			if (i == 1 || i == 4 || i == 7) {
				answer += "L";
			}
			if (i == 3 || i == 6 || i == 9) {
				answer += "R";
			}
			if (i == 2 || i == 5 || i == 8 || i == 0) {
				int leftdiff = 0;
				int rightdiff = 0;
				int j = (i == 0) ? 11 : i;
				int l = (left == 0) ? 11 : left;
				int r = (right == 0) ? 11 : right;
				if (left == 2 || left == 5 || left == 8 || left == 0) {
					leftdiff = Math.abs(j - l) / 3;
				} else {
					leftdiff = intselect(Math.abs(j - l));
				}
				if (right == 2 || right == 5 || right == 8 || right == 0) {
					rightdiff = Math.abs(j - r) / 3;
				} else {
					rightdiff = intselect(Math.abs(j - r));
				}
				if (leftdiff == rightdiff) {
					answer += (hand.equals("left")) ? "L" : "R";
				} else if (leftdiff > rightdiff) {
					answer += "R";
				} else {
					answer += "L";
				}
			}
			if (answer.charAt(answer.length() - 1) == 'L') {
				left = i;
			} else {
				right = i;
			}
		}
		return answer;
	}

	public static int intselect(int num) {
		int output = 0;
		if (num >= 8) {
			output = 4;
		} else if (num >= 5) {
			output = 3;
		} else if (num >= 2) {
			output = 2;
		} else {
			output = 1;
		}
		return output;
	}
}
