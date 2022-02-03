package LV2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class skilcoding {
	
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55, 60, 70};
		int[] speeds = {1,30,5, 10, 2};
		System.out.println(solution(progresses, speeds));
	}
	
	public static ArrayList solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<Integer> progress = new LinkedList<Integer>();
		
		for(int i : progresses) {
			progress.add(i);
		}
		
		int i =0;
		int num =0;
		while(progress.size() >= 0) {
			for(int wf_i=0+i; wf_i < progresses.length; wf_i++) {
				progress.remove();
				progresses[wf_i] = progresses[wf_i]+speeds[wf_i];
				progress.add(progresses[wf_i]);
			}
			if(progress.peek() >= 100) {
				num=0;
				while(progress.peek() >= 100) {
					num++;
					i++;
					progress.remove();
					if(progress.size() == 0) {
						break;
					}
				}
				list.add(num);
			}else { }
			
			if(i == progresses.length) {
				break;
			}else if(progress.size() <= 1) {
				list.add(1);
				break;
			}
		}
		return list;
	}
}
