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
		//Queue ���� (�켱������ ���� ���� ��)
	       PriorityQueue<String> pq = new PriorityQueue<>();
	       //course �ݺ�
	        for (int i=0;i<course.length;i++){
	        	//�����ص� map ���� �� �ʱ�ȭ
	            map = new HashMap<>();
	            //�������� �ʱ�ȭ
	            m=0;
	            //
	            for (int j=0;j<orders.length;j++) {
	            	//find �Լ� ���� cnt, str, targetNum, idx, word
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
	    	//cnt�� targetNum�� ���ٸ�
	        if (cnt==targetNum){
	        	//str�� char �迭�� �迭ȭ
	            char[] c = str.toCharArray();
	            //����
	            Arrays.sort(c);
	            //temps �ʱ�ȭ
	            String temps="";
	            //���ڿ� ���� ��ŭ �ݺ�
	            for (int i=0;i<c.length;i++)temps+=c[i];
	            //�� ���ĺ��� ������ value + 1
	            map.put(temps,map.getOrDefault(temps,0)+1);
	            //Max�� �� m�� ����
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
