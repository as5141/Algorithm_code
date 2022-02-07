package LV2;

import java.util.ArrayList;
import java.util.Arrays;

public class matrix_border {
	static int[][] arr = {};
	public static void main(String[] args) {
		int rows = 3;
		int columns = 3;
		int[][] queries = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
		System.out.println(Arrays.toString(solution(rows, columns, queries)));
	}
	
	public static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];
		arr = new int[rows][columns];
		int number = 1;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				arr[i][j] = number;
				number++;
			}
		}
		
		for(int i=0; i<queries.length; i++) {
			answer[i] = watch(queries[i]);
		}
		return answer;
	}
	
	public static int watch(int[] queries_in) {
		int num = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=queries_in[1]; i<queries_in[3]; i++)	list.add(arr[queries_in[0]-1][i-1]);
		for(int i=queries_in[0]; i<queries_in[2]; i++)	list.add(arr[i-1][queries_in[3]-1]);
		for(int i=queries_in[3]; i>queries_in[1]; i--)	list.add(arr[queries_in[2]-1][i-1]);
		for(int i=queries_in[2]; i>queries_in[0]; i--)	list.add(arr[i-1][queries_in[1]-1]);
		
		for(int i=queries_in[1]; i<queries_in[3]; i++)	{arr[queries_in[0]-1][i] = list.get(num); num++;}
		for(int i=queries_in[0]; i<queries_in[2]; i++)	{arr[i][queries_in[3]-1] = list.get(num); num++;}
		for(int i=queries_in[3]; i>queries_in[1]; i--)	{arr[queries_in[2]-1][i-2] = list.get(num); num++;}
		for(int i=queries_in[2]; i>queries_in[0]; i--)	{arr[i-2][queries_in[1]-1] = list.get(num); num++;}
		list.sort(null);
		
		return list.get(0);
	}
	
	
}
