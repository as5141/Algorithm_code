package LV2;

import java.util.Arrays;

public class coloringbook {
	
	public static void main(String[] args) {
		int m = 6;
		int n = 4;
		int[][] picture = {{1,1,1,0},{1,2,2,0},{1,0,0,1}, {0,0,0,1},{0,0,0,3},{0,0,0,3}};
		System.out.println(Arrays.toString(solution(m,n,picture)));
	}
	
	public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}
