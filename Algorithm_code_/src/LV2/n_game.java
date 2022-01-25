package LV2;

import java.util.Arrays;

public class n_game {
	static int tubenum = 1;
	static int total = 1;
	static int rank = 0;

	public static void main(String[] args) {
		int n = 16;
		int t = 16;
		int m = 2;
		int p = 1;
		System.out.println(solution(n, t, m, p));
	}

	public static String solution(int n, int t, int m, int p) {      
	        int len = m*(t-1)+p;
	        System.out.println("len: "+len);
	        String s = "";
	        int num = 0;
	        
	        while(s.length() < len){
	            s += Integer.toString(num,n).toUpperCase();
	            num++;
	        }
	        System.out.println(s);
	        
	        String answer = "";
	        int idx = 0;
	        while(true){
	        	System.out.println("idx: "+idx);
	            answer += s.charAt(idx*m+p-1);  
	            System.out.println("s.charAt(idx*m+p-1): "+s.charAt(idx*m+p-1));
	            idx++;
	            if(idx == t) break;
	        }
	        return answer;
	    }
}
