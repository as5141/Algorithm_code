package LV1;


//코드는 간단하지만 느림 약 3~6배
public class secret_map_again {
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		String[] output = solution(n, arr1, arr2);
		for(String output_ : output) System.out.println(output_+", ");
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		 String[] result = new String[n];
	        for (int i = 0; i < n; i++) {
	            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
	            System.out.println("result:" + result[i]);
	        }
	       

	        for (int i = 0; i < n; i++) {
	            result[i] = String.format("%" + n + "s", result[i]);
	            System.out.println("result2:" + result[i]);
	            result[i] = result[i].replaceAll("1", "#");
	            result[i] = result[i].replaceAll("0", " ");
	        }

	        return result;
    }
}
