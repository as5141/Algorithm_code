package LV2;

import java.util.*;
import java.util.Map.Entry;

public class combi {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D", "E"};
		//2�� ���պ��� ~ 4���� ���ձ���
		int[] course = {2, 4};

		for (int r = course[0]; r<=course[1]; r++) {
			//���� �� �ʿ� ���� index ����(�ߺ� ����)
		      	for (int j = 0; j < arr.length - (r - 1); j++) {
		        	String com = "";
		            	//i�� j���� �����ؼ� ������� ���պ��� 1���� ������ ���ڿ� ���ϱ�
		                for (int i = j; i < j+(r-1); i++) {
		                	com = com + arr[i];
		                }
		                
		                //���� ���ڸ� ���ʷ� �����ְ� ����Ʈ�� �ֱ�
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
			
			//i�� j���� �����ؼ� ������� ���պ��� 1���� ������ ���ڿ� ���ϱ�
			for (int i = j; i < j+(r-1); i++) {
				com = com + arr[i];
			}
			
			//���� ���ڸ� ���ʷ� �����ְ� ����Ʈ�� �ֱ�
			for (int i = j+(r-1); i < arr.length; i++) {
				String comb = com + arr[i];
				System.out.print(comb+", ");
			}
		}
		
	}

}
