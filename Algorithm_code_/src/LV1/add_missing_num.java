package LV1;

public class add_missing_num {
	public static void main(String[] args) {
		int[] numbers = {5,8,4,0,6,7,9};
		
		System.out.println(solution(numbers));
	}
	
	public static int solution(int[] numbers) {
        int answer = 0;
        for(int number = 0; number<10; number++) {
        	int yes = 0;
        	for(int i:numbers) {
            	if(number != i) {}else {
            		yes = 1;
            		break;
            	}
            }
        	answer += (yes != 1) ? number : 0;
        }
        return answer;
    }
}
