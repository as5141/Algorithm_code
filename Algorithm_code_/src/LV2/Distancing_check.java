package LV2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Distancing_check {

	public static void main(String[] args) {

		String arr[][] = { { "POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP" },
				{ "POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP" }, { "PXOPO", "OXOXP", "OXPOX", "OXXOP", "PXPOX" },
				{ "OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO" }, { "PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP" } };
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(String[][] places) {
		//거리두기를 준수하면 1, 지키지 않는다면 0을 출력
        int[] answer = new int[5];
        //1. 옆이랑 확인, 위 아래 확인
        
        for(int i =0; i<places.length; i++) {
        	answer[i] = POX(places, i);
        }
        return answer;
    }

	public static int POX(String[][] places, int i) {
		Stack<Character> PoxStack = new Stack<>();
		
    	for(int j=0; j<places[i].length; j++) {
    		PoxStack.clear();
    		PoxStack.add(places[i][j].charAt(0));
    		for(int user = 1; user<=places[i][j].length(); user++) {
    			if(user<places[i][j].length() && PoxStack.peek() == 'P' && places[i][j].charAt(user) == 'P') {
    				return 0;
    			}else if(j < places[i].length-1 && PoxStack.peek() == 'P' && places[i][j+1].charAt(user-1) == 'P'){
    				return 0;
    			}else if(user<places[i][j].length() && j < places[i].length-1 && PoxStack.peek() == 'P' && places[i][j+1].charAt(user-1) == 'O' && places[i][j+1].charAt(user) == 'P'){
    				return 0;
    			}else if(j < places[i].length-1 && user >= 2 && PoxStack.peek() == 'P' && places[i][j+1].charAt(user-1) == 'O' && places[i][j+1].charAt(user-2) == 'P'){
    				return 0;
    			}else if(user<places[i][j].length() && j >= 1 && PoxStack.peek() == 'P' && places[i][j-1].charAt(user-1) == 'O' && places[i][j-1].charAt(user) == 'P'){
    				return 0;
    			}else if(j >= 1 && user >= 2 && PoxStack.peek() == 'P' && places[i][j-1].charAt(user-1) == 'O' && places[i][j-1].charAt(user-2) == 'P'){
    				return 0;
    			}else if(user<places[i][j].length()) {
    				PoxStack.add(places[i][j].charAt(user));
    			}else {}
    		}
        }
    	return 1;
    }
    
}
