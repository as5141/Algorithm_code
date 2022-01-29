package LV2;

import java.util.*;

public class menu_re {
	static HashMap<String,Integer> map;
    static int m;
	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		System.out.println(Arrays.toString(solution(orders, course)));
	}

	public static String[] solution(String[] orders, int[] course) {
		//Queue 선언 (우선순위가 낮은 숫자 순)
	       PriorityQueue<String> pq = new PriorityQueue<>();
	       //course 반복
	        for (int i=0;i<course.length;i++){
	        	//생성해둔 map 선언 및 초기화
	            map = new HashMap<>();
	            //전역변수 초기화
	            m=0;
	            //
	            for (int j=0;j<orders.length;j++) {
	            	//find 함수 실행 cnt, str, targetNum, idx, word
	                find(0, "", course[i], 0, orders[j]);
	            }
	            for (String s : map.keySet()){
	                if (map.get(s)==m&&m>1){
	                    pq.offer(s);
	                }
	            }
	        }
	        String  ans[] = new String[pq.size()];
	        int k=0;
	        while (!pq.isEmpty()){
	            ans[k++] = pq.poll();
	        }
	        return ans;
	    }
	    static void find(int cnt,String str,int targetNum,int idx,String word){
	    	//cnt가 targetNum과 같다면
	        if (cnt==targetNum){
	        	//str을 char 배열로 배열화
	            char[] c = str.toCharArray();
	            //정렬
	            Arrays.sort(c);
	            //temps 초기화
	            String temps="";
	            //문자열 길이 만큼 반복
	            for (int i=0;i<c.length;i++)temps+=c[i];
	            //각 알파벳이 나오면 value + 1
	            map.put(temps,map.getOrDefault(temps,0)+1);
	            //Max값 을 m에 대입
	            m = Math.max(m,map.get(temps));
	            return;
	        }
	        for (int i=idx;i<word.length();i++){
	        	//now = orders.charAt(i)
	            char now =word.charAt(i);
	            find(cnt+1,str+now,targetNum,i+1,word);
	        }
	    }
	    //1,A,0,1,AC
	    //
	
}
