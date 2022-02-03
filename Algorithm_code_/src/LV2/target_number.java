package LV2;

public class target_number {
	static int answer;
	
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		System.out.println(solution(numbers,target));
	}
	
	public static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers,target,0,0);
        
        return answer;
    }
	
	public static void dfs(int[] numbers,int target,int idx,int sum){
        if(idx == numbers.length){   
            if(sum == target) answer++;
            return;
        }
        dfs(numbers,target,idx+1,sum+numbers[idx]);
        dfs(numbers,target,idx+1,sum-numbers[idx]);
        
    }
    
    
}
