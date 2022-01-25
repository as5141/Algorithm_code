package LV1;

import java.util.Arrays;

public class _211209_unfinished_players {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant, completion));
	}
	
	public static String solution(String[] participant, String[] completion) {
		int num = 0;
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(num=0; num<completion.length; num++) {
			if(!participant[num].equals(completion[num])) {
				return participant[num];
			}
		}
		return participant[num];
	}
}
