package LV2;

public class jinbub_124 {
	public static void main(String[] args) {
		int n = 15;
		System.out.println(solution(n));
	}
	
	public static String solution(int n) {
	       String[] numbers = {"4", "1", "2"};
	      String answer = "";
	      
	      int num = n;
	      
	      while(num > 0){
	          int remainder = num % 3;
	          System.out.println("remainder: "+ remainder);
	          num /= 3;
	          System.out.println("num: "+ num);
	          if(remainder == 0) num--;
	          
	          answer = numbers[remainder] + answer;
	      }
	      
	      return answer;
	    }
}
