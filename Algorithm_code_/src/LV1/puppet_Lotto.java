package LV1;

import java.util.ArrayList;

public class puppet_Lotto {
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
		int[] moves = {1,1,1,1};
		System.out.println(solution(board, moves));
		
	}
	
	public static int solution(int[][] board, int[] moves) {
		ArrayList<Object> bag = new ArrayList<Object>();
		for(int i:moves) {
			for(int board_cnt=0; board_cnt < board.length; board_cnt++) {
				
				if(board[board_cnt][i-1] != 0) {
					bag.add(board[board_cnt][i-1]);
					board[board_cnt][i-1] = 0;
					break;
				}
			}
		}
		int start = bag.size();
		int i = 0;
		while(i < bag.size()) {
			if((i+1)<bag.size()) {
				if(bag.get(i) == bag.get(i+1)) {
					bag.remove(i);bag.remove(i);
					i =-1;
				}
			}else {
				System.out.println("else");
				break;
			}
			i++;
		}
		return start - bag.size();
	}
	
}
