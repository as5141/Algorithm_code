package LV2;

import java.util.*;

public class tuple_2_suc {
	static int tubenum = 1;
	static int total = 1;
	static int rank = 0;

	public static void main(String[] args) {
		String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		System.out.println(Arrays.toString(solution(s)));
	}

	public static int[] solution(String s) {      
		int[] answer= null;
		List<Object> list = new ArrayList<Object>();
       
        s = s.replaceAll("[//},//{]","-");
        s = s.replaceAll("--","=");
        s = s.replaceAll("-",",");
        s = s.replaceAll("=,","-");
        s = s.replaceAll("=","");
        
        String[] tuple_single = s.split("-");
        String[][] tuple_d = null;
        tuple_d = new String[tuple_single.length][];
        
        for(int j = 0; j<tuple_single.length; j++) {
        	tuple_d[j] = tuple_single[j].split(",");
        }
        String[] tuple_tmp = null;
        
        //배열 길이별 정렬
        for(int i=0; i<tuple_d.length;i++) {
        	for(int j =0; j<tuple_d.length; j++) {
        		if(tuple_d[i].length<tuple_d[j].length) {
        			tuple_tmp = new String[tuple_d[j].length];
        			tuple_tmp = tuple_d[j];
        			tuple_d[j] = tuple_d[i];
        			tuple_d[i] = tuple_tmp;
        			
        		}
        	}
        }
        
        //배열 길이 정렬 후 중복 제거
        for(int i=0; i<tuple_d.length; i++) {
        	for(int j=0; j<tuple_d[i].length; j++) {
        		boolean found = false;
        		if(list.size() == 0) {
        			list.add(tuple_d[i][j]);
        		}else {
        			for(Object tmp : list) {
        				found = tuple_d[i][j].equals(tmp) ? true : found ;
        			}
            		if(found == false) {
                		list.add(tuple_d[i][j]);
            		}
        		}
        	}
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = Integer.parseInt((String) list.get(i));
        }
        
        return answer;
	    }
}
