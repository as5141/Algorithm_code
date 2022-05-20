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
		//�Ÿ��α⸦ �ؼ��ϸ� 1, ��Ű�� �ʴ´ٸ� 0�� ���
        int[] answer = new int[5];
        //1. ���̶� Ȯ��, �� �Ʒ� Ȯ��
        
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
