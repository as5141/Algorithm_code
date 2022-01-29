package LV2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Distancing_check {
	
	public static void main(String[] args) {
		String a = "[[\"POOOP\", \"OXXOX\", \"OPXPX\", \"OOXOX\", \"POXXP\"], [\"POOPX\", \"OXPXP\", \"PXXXO\", \"OXXXO\", \"OOOPP\"], [\"PXOPX\", \"OXOXP\", \"OXPOX\", \"OXXOP\", \"PXPOX\"], [\"OOOXX\", \"XOOOX\", \"OOOXX\", \"OXOOX\", \"OOOOO\"], [\"PXPXP\", \"XPXPX\", \"PXPXP\", \"XPXPX\", \"PXPXP\"]]";
		a = a.replaceAll("[\\[]","{");
		a = a.replaceAll("[\\]]","}");
		a = a.replaceAll("\\{[^ ]+\\}","");
		System.out.println(a);
		//프로그래머스에서 옮겨왔는데 저렇게 옮겨지길래 귀찮아서 repalceAll로 지우고 출력된 거 복붙해서 씀..
		String arr[][] = {{"POOOP","OXXOX","OPXPX","OOXOX","POXXP"},{"POOPX","OXPXP","PXXXO","OXXXO","OOOPP"},{"PXOPX","OXOXP","OXPOX","OXXOP","PXPOX"},{"OOOXX","XOOOX","OOOXX","OXOOX","OOOOO"},{"PXPXP","XPXPX","PXPXP","XPXPX","PXPXP"}};
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for(int i=0; i<places.length;i++) {
        	for(int j=0; j<places.length; j++) {
        		String answer_S = "";
        		System.out.println("i: "+i + "j: "+j);
        		answer_S += P_return(places[i][j]);
        		System.out.println("answer_S: "+answer_S);
        	}
        }
        return answer;
    }
      
    public static int P_return(String places) {
    	int result = 1;
    	int P = 0;
    	int P2 = 0;
    	System.out.println("places: "+places);
    	for(int char_num =0; char_num < places.length(); char_num++) {
    		
       	}
    	return result;
    }
    
}
