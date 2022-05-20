package LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class jacad_news {
	public static void main(String[] args) {
		String str1 = "handshake";
		String str2 = "shake hands";
		System.out.println(solution(str1, str2));
	}
	
	public static int solution(String str1, String str2) {
		ArrayList<String> Str1 = new ArrayList<>();
		ArrayList<String> Str2 = new ArrayList<>();
		str1 = str1.replaceAll("[^a-zA-Z]", "0"); str1 = str1.replaceAll(" ", "0");
		str2 = str2.replaceAll("[^a-zA-Z]", "0"); str2 = str2.replaceAll(" ", "0");
		String add = "";
		for(int i=0; i<str1.length()-1; i++) {
			add = String.valueOf(str1.charAt(i)).toUpperCase()+String.valueOf(str1.charAt(i+1)).toUpperCase();
			if(str1.charAt(i) != '0' && str1.charAt(i+1) != '0') {
				Str1.add(add);
			}
			
		}
		for(int i=0; i<str2.length()-1; i++) {
			add = String.valueOf(str2.charAt(i)).toUpperCase()+String.valueOf(str2.charAt(i+1)).toUpperCase();
			if(str2.charAt(i) != '0' && str2.charAt(i+1) != '0') {
				Str2.add(add);
			}
		}
		return Jacade(Str1, Str2);
	}
	
	public static int Jacade(ArrayList<String> Str1, ArrayList<String> Str2) {
		ArrayList<String> intersection = new ArrayList<String>();
		ArrayList<String> union = new ArrayList<String>();
		
		for(String s : Str1){
	          if(Str2.remove(s)){
	            intersection.add(s);
	          }
	          union.add(s);
	      }
	      
	      for(String s : Str2){
	          union.add(s);
	      }
	      double jakard = 0;
	      if(union.size() == 0) {
	          jakard = 1;
	      } else {
	          jakard = (double)intersection.size() / (double)union.size();
	      }
	      return (int)(jakard * 65536);
	}
}
