package LV2;

import java.util.Arrays;

public class search_rank {

	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		System.out.println(Arrays.toString(solution(info, query)));
	}
	
	public static int[] solution(String[] info, String[] query) {
        int[] answer = new int[info.length];
        String[][] Info = new String[info.length][5];
        String[][] Query = new String[query.length][5];
        String pass = "-";

        int person = 0;
        int Score = 0;
        //�迭ȭ �� ���� �˿�
        for(int i=0; i<info.length; i++) {
            query[i] = query[i].replace(" and","");
            Info[i] = info[i].split(" ");
            Query[i] = query[i].split(" ");
        }
        //Score�� 5�� (������ 5���� ��� �����ϸ� person +1 ) �� �迭�� �� ����
        for(int Q = 0; Q<Query.length; Q++) {
        	person = 0;
        	for(int i=0; i<Info.length; i++) {
        		Score = score(Query[Q], Info[i], pass);
            	
            	if(Score >= 5) {
            		person += 1;
            	}
            }
        	answer[Q] = person;
        }
        return answer;
    }
	
	public static int score(String[] Query, String[] Info, String pass) {
		int Score = 0;
		
		for(int q=0; q<Query.length; q++) {
    		if(q == 4) {
    			if(Integer.parseInt(Info[q]) >= Integer.parseInt(Query[q]) ) {
    				Score += 1;
    			}
    		}else if(Query[q].equals(pass) || Info[q].equals(Query[q])) {
    			Score += 1;
    		}
    	}
		
		
		return Score;
	}
}
