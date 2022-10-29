package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {
	public static List<String> solution(List<List<String>> forms) {
		List<String> answer = List.of("answer");
		return answer;
	}

	private static List collectNickname(List<List<String>> da) {
		List<String> collection = new ArrayList<>();
		for (List a : da) {
			collection.add((String)a.get(1));
		}
		return collection;
	}

	private static boolean checkNickname(String name, List<String> comparedNames) {

		for (String target : comparedNames) {
			for (int i = 0; i < name.length() - 1; i++) {
				if (target.contains(name.substring(i, i + 2))) {
					return true;
				}
			}
		}
		return false;
	}
}
