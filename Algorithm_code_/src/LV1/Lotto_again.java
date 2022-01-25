package LV1;
// --> 8Á¡
public class Lotto_again {
	public static void main(String args[]) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		solution(lottos,win_nums);
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int x  = 0;
        int cnt = 0;
        for(int i : lottos) {
        	x = (i == 0) ? x+1 : x;
        	for(int j : win_nums) {
        		cnt = (i == j) ? cnt+1 : cnt;
        	}
        }
        answer[0] = rank(x+cnt);
        answer[1] = rank(cnt);
        
        return answer;
    }
	
	public static int rank(int num) {
		switch(num) {
			case 1: return 6;
			case 2: return 5;
			case 3: return 4;
			case 4: return 3;
			case 5: return 2;
			case 6: return 1;
			default: return 6;
			
		}
	}
	
}
