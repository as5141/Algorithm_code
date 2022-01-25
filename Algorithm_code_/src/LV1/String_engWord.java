package LV1;


public class String_engWord {
	public static void main(String args[]) {
		String s = "2three45sixseven";
		solution(s);
	}
	
	public static int solution(String s) {
		String[] number = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < number.length; i++) {
            s = s.replaceAll(number[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
