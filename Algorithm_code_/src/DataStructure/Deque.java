package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class Deque {
	static String[] list = new String[5];
	static int Last = list.length/2;
	static int Front = list.length/2;
	
	public static void main(String[] args) {
		push_Last();
		push_Last();push_Front();push_Front();push_Last();
		pop_Last();pop_Last();pop_Last();pop_Last();pop_Last();
		push_Last();
		
		
	}
	
	public static void reset() {
		System.out.println("reset 진입");
		Front = list.length/2;
		Last = list.length/2;
		System.out.println("Last:"+Last +"   Front:"+Front);
		
	}
	
	public static int check() {
		System.out.println("check 진입");
		for(int i = 0; i<list.length; i++) {
			if(list[i] == null) {
				
			}else {
				//null 이 아니면
				return -1;
			}
		}
		//null이면
		return 0;

	}
	
	public static void push_First(char str) {
		System.out.println("push_First 진입");
		if(str == 'F') {
			list[Front] = "Data-F_First";
			Last++;
			Front--;
		}else if(str == 'L') {
			list[Last] = "Data-L_First";
			Front--;
			Last++;
			System.out.println(list[Last]);
			System.out.println("Last:"+Last +"   Front:"+Front);
		}else {
			System.out.println("다시 실행해주세요.");
		}	
	}
	
	
	public static void pop_Last() {
		if(check() == -1) {
			Last--;
			if(Last >= Front) {
				list[Last] = null;
				System.out.println("null_L");
				System.out.println("Last:"+Last +"   Front:"+Front);
				if((Front-Last) == -1) {
					reset();
				}
			}else {
				reset();
			}
		}else {
			System.out.println("데이터가 없습니다.");
		}
		System.out.println(Arrays.toString(list));
	}
	
	public static void pop_Front() {
		if(check() == -1) {
			Front++;
			if(Front <= Last) {
				list[Front] = null;
				System.out.println("null_F");
				System.out.println("Last:"+Last +"   Front:"+Front);
				if((Last-Front) == -1) {
					reset();
				}
				
			}else {
				
			}
		}else {
			System.out.println("데이터가 없습니다.");
		}
		System.out.println(Arrays.toString(list));
	}
	
	public static void push_Last() {
		if(check() == -1) {
			if(Last < list.length) {
				list[Last] = "Data_L";
				Last++;
				System.out.println("Data_L");
				System.out.println("Last:"+Last +"   Front:"+Front);
			}else {
				Last--;
				System.out.println("over_push_Last");
			}
		}else {
			push_First('L');
		}
		
		System.out.println(Arrays.toString(list));
	}
	
	public static void push_Front() {
		if(check() == -1) {
			if(Front > -1) {
				list[Front] = "Data_F";
				Front--;
				System.out.println("Data_F");
			}else {
				Front++;
				System.out.println("over_push_Front");
			}
		}else {
			push_First('F');
		}
		
		System.out.println(Arrays.toString(list));
	}
}
