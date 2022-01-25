package LV2;


public class String_pack {

	public static void main(String[] args) {
		String s = "a";
		System.out.println(solution(s));
		
	}
	
	public static int solution(String s) {
        int answer = 0;
        int num = (s.length() > 1) ? s.length()/2 : 1;
        int[] div_array = new int[num];
        
        for(int i=0; i<div_array.length; i++) {
        	div_array[i] = div(s,i+1);
        }
        answer = div_array[0];
        for(int i=0; i<div_array.length-1; i++) {
        	if(answer > div_array[i+1]) {
        		answer = div_array[i+1];
        	}
        }
        return answer;
        
    }
	
	
	public static int div(String s, int div_num) {
		int red = 1;
		String hap = "";
		String x = s.substring(0, (s.length()/div_num)*div_num);
		String y = s.substring(x.length());
		String[] s_array = new String[s.length()/div_num];
		
		for(int i=0; i<s.length()/div_num; i++) {
			String a = "";
			for(int j=0; j<div_num; j++) {
				a += x.charAt((i*div_num)+j);
			}
			s_array[i] = a;
		}
		
		for(int i=0; i<s_array.length; i++) {
			if(i<s_array.length-1 && s_array[i].equals(s_array[i+1])) {
				red++;
			}else {
				if(red != 1) {
					hap += red + s_array[i];
				}else {
					hap += s_array[i];
				}
				red = 1;
			}
		}
		hap += y;
		return hap.length();
	}
}
