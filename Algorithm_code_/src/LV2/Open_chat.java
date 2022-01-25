package LV2;

import java.util.ArrayList;
import java.util.HashMap;

public class Open_chat {
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi","Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		System.out.println(solution(record));
	}
	
	public static ArrayList<String> solution(String[] record) {
        ArrayList<String> answer = new ArrayList<String>();
        HashMap<String, String> nickMap = new HashMap<String, String>();
        
        String nick = "";
        String[][] record_content = new String[record.length][3];
        for(int i=0; i<record.length; i++) {
        	String[] content = record[i].split(" ");
        	record_content[i] = content;
        	nick = (record_content[i].length < 3) ? record_content[i][1] : record_content[i][2];
        	if(!record_content[i][0].equals("Leave")) {
            	nickMap.put(record_content[i][1], nick);
        	}
        	
        }
        for(int i=0; i<record.length; i++) {
        	if(record_content[i][0].equals("Enter")) {
        		answer.add(nickMap.get(record_content[i][1])+"´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
        	}else if(record_content[i][0].equals("Leave")) {
        		answer.add(nickMap.get(record_content[i][1])+"´ÔÀÌ ³ª°¬½À´Ï´Ù.");
        	}else { }
        	
        }
        
        return answer;
    }
}
