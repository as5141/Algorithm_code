package LV2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class tuple_ {
	static int tubenum = 1;
	static int total = 1;
	static int rank = 0;

	public static void main(String[] args) {
		String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		System.out.println(Arrays.toString(solution(s)));
	}

	public static int[] solution(String s) {      
		 Map<String, Integer> map = new HashMap<>();
	        Pattern pattern = Pattern.compile("[0-9]+");
	        System.out.println("pattern: "+pattern);
	        
	        Matcher matcher = pattern.matcher(s);
	        System.out.println("matcher: "+matcher);
	        
	        while (matcher.find()) {
	            String n = matcher.group();
	            System.out.println("n: "+n);
	            map.put(n, map.getOrDefault(n, 0) + 1);
	        }
	        int size = map.size();
	        int[] answer = new int[size];
	        for (String key: map.keySet()) {
	        	System.out.println("map.get(key): "+map.get(key));
	            answer[size - map.get(key)] = Integer.parseInt(key);
	        }
	        return answer;
	    }
}
