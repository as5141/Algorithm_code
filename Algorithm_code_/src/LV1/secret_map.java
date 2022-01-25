package LV1;

public class secret_map {
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		String[] output = solution(n, arr1, arr2);
		for(String output_ : output) System.out.println(output_+", ");
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i< answer.length; i++) answer[i] = "";
        
        for(int i=0; i<arr1.length; i++) {
        	String arr1_bt = Integer.toBinaryString(arr1[i]); //2Áø¼ö 01001
        	String arr2_bt = Integer.toBinaryString(arr2[i]);
        	
        	if(arr1_bt.length() < n) {
        		String k_for = "";
        		for(int k=0; k<n-arr1_bt.length(); k++) {
        			k_for += "0";
        		}
        		arr1_bt = k_for + arr1_bt;
        	}
        	if(arr2_bt.length() < n) {
        		String k_for = "";
        		for(int k=0; k<n-arr2_bt.length(); k++) {
        			k_for += "0";
        		}
        		arr2_bt = k_for + arr2_bt;
        	}
        	for(int j = 0; j< arr1_bt.length(); j++) {
        		if(arr1_bt.charAt(j) == '1' || arr2_bt.charAt(j) == '1') {
        			answer[i] += "#"; 
        		}else {
        			answer[i] += " ";
        		}
        		
        	}
        }
        return answer;
    }
}
