package LV1;

import java.util.Stack;

public class puppet_Lotto_stack {
	public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0},
				{23,33,92,61,6},
				{23,33,92,61,6},
				{23,33,92,61,6},
				{23,33,92,61,6},
				{23,33,92,61,6},
				{23,33,92,61,6},
				{23,33,92,61,6},
				{23,33,92,61,6},
				{23,33,92,61,6}};
		int[] moves = {1,1,1,1,3,5,5,3,2,5,4,2,1,5};
		System.out.println(solution(board, moves));
		
	}
	
	public static int solution(int[][] board, int[] moves) {
		Stack<Integer> bag = new Stack<Integer>();
		int answer = 0;
		for(int i:moves) {
			for(int board_cnt=0; board_cnt < board.length; board_cnt++) {
				if(board[board_cnt][i-1] != 0) {
					if(!bag.empty()) {
						if(bag.peek() == board[board_cnt][i-1]) {
							bag.pop();
							answer += 2;
						}else {
							bag.push(board[board_cnt][i-1]);
						}
					}else {
						bag.push(board[board_cnt][i-1]);
					}
					board[board_cnt][i-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
	
}
