package LV1;


public class dart_game {
	public static void main(String[] args) {
		String dartResult = "1S*2T*3S";
		
		System.out.println(solution(dartResult));
	}
	
	public static int solution(String dartResult) {
        int answer = 0;
       
        return answer;
    }
	
	public static int pow(String number, String pow) {
		int output= 0;
		if(pow.equals("S")) {
			output = 1;
		}else if(pow.equals("D")) {
			output = 2;
		}else if(pow.equals("T")) {
			output = 3;
		}
		
		output = (int) Math.pow(Integer.parseInt(number), output);
			
		
		return output;
	}
}
