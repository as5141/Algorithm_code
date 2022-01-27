package LV2;

import java.util.*;
import java.util.Map.Entry;

public class combi {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D", "E"};
		//2개 조합부터 ~ 4개의 조합까지
		int[] course = {2, 4};

		for (int r = course[0]; r<=course[1]; r++) {
			//굳이 돌 필요 없는 index 제외(중복 제외)
		      	for (int j = 0; j < arr.length - (r - 1); j++) {
		        	String com = "";
		            	//i는 j부터 시작해서 만들어질 조합보다 1적을 때까지 문자열 더하기
		                for (int i = j; i < j+(r-1); i++) {
		                	com = com + arr[i];
		                }
		                
		                //다음 문자를 차례로 더해주고 리스트에 넣기
		                for (int i = j+(r-1); i < arr.length; i++) {
		                	String comb = com + arr[i];
		                    System.out.print(comb+" ");
		                }
		        }
		}
		System.out.println();
		
		int r = 2;
		for (int j = 0; j < arr.length - (r - 1); j++) {
			String com = "";
			
			//i는 j부터 시작해서 만들어질 조합보다 1적을 때까지 문자열 더하기
			for (int i = j; i < j+(r-1); i++) {
				com = com + arr[i];
			}
			
			//다음 문자를 차례로 더해주고 리스트에 넣기
			for (int i = j+(r-1); i < arr.length; i++) {
				String comb = com + arr[i];
				System.out.print(comb+", ");
			}
		}
		
	}

}
