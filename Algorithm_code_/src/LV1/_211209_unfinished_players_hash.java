package LV1;

import java.util.HashMap;
import java.util.Map.Entry;

public class _211209_unfinished_players_hash {
	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };

		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		// getOrDefault -> 없으면 Default Value 부분에 쓴 값 반환, 있다면 매핑된 값 반환.
		for (String player : participant)
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		// 있다면 해당 키에서 -1해서 다시 put
		for (String player : completion)
			hm.put(player, hm.get(player) - 1);
		// entry로 Map을 가져옴.
		for (Entry<String, Integer> entry : hm.entrySet()) {
			if (entry.getValue() != 0) {
				// 해당 키 값이 0이 아니라면 answer에 entry.getKey() 값을 넣고 반환.
				answer = entry.getKey();
			}
		}
		return answer;
	}
}
