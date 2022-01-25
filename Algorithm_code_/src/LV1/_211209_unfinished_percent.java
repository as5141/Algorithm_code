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
		for (Integer player=1; player<N+1; player++) map.put(player, (float) 0.0);				  //�������� ������ŭ ���� �� 0���� �ʱ�ȭ
		for (Integer player : stages) map.put(player, map.getOrDefault(player, (float) 0.0) + 1); // �ش� ���������� ���� ī��Ʈ
		float[] answerF = new float[map.size()];												  // Value ���� ����
		int i = 0;
		int num = 0;
		for (Entry<Integer, Float> entry : map.entrySet()) {
			float stages_num = (((float)stages.length-num) != 0) ? ((float)stages.length-num) : 1 ;
			answerF[i] = ((float)entry.getValue()/stages_num*100);								//�ش� �������� ���� / ���� + ���
			num += entry.getValue();															//���� �������� ���� ��
			map.put(entry.getKey(),answerF[i]);													//�ش� �������� value�� ������ value�� ����
			i++;
		}
		map.remove(N+1);											//N+1 Ű�� �ִٸ� value�� null�� -> ������ ���� ����� ��� ���� ���������� ���� �ʿ� x
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));	//�������� ����
		
		int[] answer= new int[map.size()];					//map �����ŭ ���� �Ҵ�
		list.removeAll(Arrays.asList("", null));			// N+1 -> null ����
		i = 0;												//����ߴ� ���� i �ʱ�ȭ
		for(Integer key : list) { answer[i] = key; i++;}
		
		return answer;
	}
}
