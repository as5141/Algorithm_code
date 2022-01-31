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
        //배열화 및 문장 검열
        for(int i=0; i<info.length; i++) {
            query[i] = query[i].replace(" and","");
            Info[i] = info[i].split(" ");
            Query[i] = query[i].split(" ");
        }
        //Score가 5면 (조건이 5가지 모두 충족하면 person +1 ) 후 배열에 값 대입
        for(int Q = 0; Q<Query.length; Q++) {
        	int person = 0;
        	for(int i=0; i<Info.length; i++) {
        		int Score = 0;
            	for(int q=0; q<Query[Q].length; q++) {
            		if(q == 4) {
            			if(Integer.parseInt(Info[i][q]) >= Integer.parseInt(Query[Q][q]) ) {
            				Score += 1;
            			}
            		}else if(Query[Q][q].equals(pass) || Info[i][q].equals(Query[Q][q])) {
            			Score += 1;
            		}
            	}
            	if(Score >= 5) {
            		person += 1;
            	}
            }
        	answer[Q] = person;
        }
        
        return answer;
    }
}
