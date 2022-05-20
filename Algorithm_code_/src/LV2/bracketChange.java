package LV2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class bracketChange {
	public static void main(String[] args) {
		String p = "()))((()";
		System.out.println(solution(p));
		
	}
	
	public static String solution(String p) {
        String answer = "";
        Stack<Character> bracKet = new Stack<Character>();
        Map<Character, Integer> bracKetCnt = new HashMap<Character, Integer>();
        for(Character charct : p.toCharArray()) {
        	if(charct == '(') {
        		bracKetCnt.put(charct, bracKetCnt.getOrDefault(charct, 1)+1);
        		
        	}else if(charct == ')') {
        		bracKetCnt.put('(', bracKetCnt.getOrDefault('(', 0)-1);
        		if(bracKetCnt.get('(') < 0) {
        			bracKetCnt.put('(', 1);
        			bracKet.add('(');
        		}else {
        			bracKet.add(')');
        		}
        	}
        }
        System.out.println("bracKet: "+bracKet);
        System.out.println("Map: "+bracKetCnt);
        answer = bracKet.toString();
        return answer;
    }
}
