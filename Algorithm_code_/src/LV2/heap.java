package LV2;

import java.util.*;

public class heap {
	public static void main(String[] args) {
		int[] scoville = {1,1,1,1,1,1,1,1,1};
		int K = 60;
		System.out.println(solution(scoville, K));
	}
	
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        int hap = 0;
        PriorityQueue<Integer> MinHeap = new PriorityQueue<Integer>();
        
        for(int i : scoville) {
            MinHeap.add(i);
        }
        
        if(MinHeap.peek() == 0) {
        	return -1;
        }
        while(MinHeap.peek() < K) {
        	hap = MinHeap.poll();
        	hap = hap + (MinHeap.poll()*2);
        	MinHeap.add(hap);
        	answer++;
        	hap = 0;
        	System.out.println(MinHeap);
        	if(MinHeap.size() < 2 && MinHeap.peek() < K) {
        		return -1;
        	}
        }
        return answer;
    }
}
