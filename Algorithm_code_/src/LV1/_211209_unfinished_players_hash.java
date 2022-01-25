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
		// getOrDefault -> ������ Default Value �κп� �� �� ��ȯ, �ִٸ� ���ε� �� ��ȯ.
		for (String player : participant)
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		// �ִٸ� �ش� Ű���� -1�ؼ� �ٽ� put
		for (String player : completion)
			hm.put(player, hm.get(player) - 1);
		// entry�� Map�� ������.
		for (Entry<String, Integer> entry : hm.entrySet()) {
			if (entry.getValue() != 0) {
				// �ش� Ű ���� 0�� �ƴ϶�� answer�� entry.getKey() ���� �ְ� ��ȯ.
				answer = entry.getKey();
			}
		}
		return answer;
	}
}
