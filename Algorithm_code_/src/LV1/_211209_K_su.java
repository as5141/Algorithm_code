package LV1;
import java.util.Arrays;

public class _211209_K_su {
	public static void main(String[] args) {
		int[] array = { 1,5,2,6,3,7,4};
		int[][] command = { {1,4,1 }, {2,3,1},{7,7,1}};

		System.out.println(solution(array,command));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] output = new int[commands.length];
		
        for(int i =0; i< commands.length; i++) {
        	int num = 0;
        	int answer_size = commands[i][1] - (commands[i][0]-1);
        	int[] answer = new int[answer_size];
        	for(int j=(commands[i][0]-1); j<commands[i][1]; j++) {
        		answer[num] = array[j];
        		num++;
        	}
        	Arrays.sort(answer);
        	output[i] = answer[(commands[i][2]-1)];
        }
        return output;
    }
}
