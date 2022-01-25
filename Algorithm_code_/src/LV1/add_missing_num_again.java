package LV1;

import java.util.Arrays;

public class add_missing_num_again {
	public static void main(String[] args) {
		int[] numbers = {5,8,4,0,6,7,9};
		System.out.println(solution(numbers));
	}
	
	public static int solution(int[] numbers) {
        
        return 45-Arrays.stream(numbers).sum();
        
    }
}
