package LV2;

import java.util.*;
import java.util.Map.Entry;

public class menu_re {
	
	public static void main(String[] args) {
		String[] orders = {"ABDFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		System.out.println(Arrays.toString(solution(orders, course)));
	}

	public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        Map<Object, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(String key : orders) {
        	for(int i =0; i<key.length(); i++) {
        		map.put(key.charAt(i), 0);
        	}
        }
        String[] arr = new String[map.size()];
        int n = arr.length;
        String[] combArr = new String[n];
        
        int num = 0;
        for (Entry<Object, Integer> entry : map.entrySet()) {
        	arr[num] = String.valueOf(entry.getKey());
        	num++;
		}
        
        //r 은 원소의 개수
        //문자열로 경우의 수 만들기
        for(int r : course) {
        	System.out.println("r: "+r);
        	for(int i=0; i<arr.length-(r-1); i++) {
            	String comb = "";
            	for(int j=i; j<i+(r-1); j++) {
            		comb = (r==2) ? arr[j] : arr[j]+arr[j+1];
            		System.out.println("comb1: "+comb);
            	}
            	int oh = (i == arr.length-(r-1)) ? arr.length : arr.length - (r-1);
            	for(int t=i+(r-1); t<oh; t++) {
            		String comb2 = comb;
            		comb2 = comb+arr[t];
            		System.out.println("comb2: "+comb2);
                    map2.put(comb2, 0);
                    list.add(comb2);
            	}
            }
        }
        
        
        
        
        System.out.println("map: "+map);
        System.out.println("map2: "+map2);
        System.out.println("list: "+list);
        
        return answer;
    }
	
}
