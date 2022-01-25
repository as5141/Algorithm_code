package LV1;

import java.util.Arrays;

public class _211209_K_su_again {
	public static void main(String[] args) {
		int[] array = { 1,5,2,6,3,7,4};
		int[][] command = { {1,4,1 }, {2,3,1},{7,7,1}};

		System.out.println(solution(array,command));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
