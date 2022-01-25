package LV1;
//이게 빠름 again 한 것보다 그렇다고 크게 다르진 않음 --> 9점
public class Lotto_my {
	public static void main(String args[]) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		solution(lottos,win_nums);
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int x  = 0;
        int cnt = 0;
        for(int i=0; i<lottos.length; i++) {
        	x = (lottos[i] == 0) ? x+1 : x;
        	for(int j =0; j<win_nums.length; j++) {
        		cnt = (lottos[i] == win_nums[j]) ? cnt+1 : cnt;
        	}
        }
        answer[0] = rank(x+cnt);
        answer[1] = rank(cnt);
        return answer;
    }
	
	public static int rank(int num) {
		int rank=0;
		switch(num) {
			case 0: rank = 6; break;
			case 1: rank = 6; break;
			case 2: rank = 5; break;
			case 3: rank = 4; break;
			case 4: rank = 3; break;
			case 5: rank = 2; break;
			case 6: rank = 1; break;
			
		}
		return rank;
	}
	
}
