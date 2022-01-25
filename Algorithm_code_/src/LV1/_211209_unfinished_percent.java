package LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class _211209_unfinished_percent {
	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4,4,4,4,4};
		System.out.println(solution(N, stages));
	}
	
	public static int[] solution(int N, int[] stages) {
		HashMap<Integer, Float> map = new HashMap<>();
		for (Integer player=1; player<N+1; player++) map.put(player, (float) 0.0);				  //스테이지 개수만큼 생성 후 0으로 초기화
		for (Integer player : stages) map.put(player, map.getOrDefault(player, (float) 0.0) + 1); // 해당 스테이지의 유저 카운트
		float[] answerF = new float[map.size()];												  // Value 넣을 공간
		int i = 0;
		int num = 0;
		for (Entry<Integer, Float> entry : map.entrySet()) {
			float stages_num = (((float)stages.length-num) != 0) ? ((float)stages.length-num) : 1 ;
			answerF[i] = ((float)entry.getValue()/stages_num*100);								//해당 스테이지 유지 / 유지 + 통과
			num += entry.getValue();															//이전 스테이지 유저 수
			map.put(entry.getKey(),answerF[i]);													//해당 스테이지 value에 실패율 value로 변경
			i++;
		}
		map.remove(N+1);											//N+1 키가 있다면 value값 null로 -> 마지막 라운드 통과한 사람 값은 스테이지로 남을 필요 x
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));	//내링차순 정렬
		
		int[] answer= new int[map.size()];					//map 사이즈만큼 동적 할당
		list.removeAll(Arrays.asList("", null));			// N+1 -> null 삭제
		i = 0;												//사용했던 변수 i 초기화
		for(Integer key : list) { answer[i] = key; i++;}
		
		return answer;
	}
}
