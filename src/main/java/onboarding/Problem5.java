package onboarding;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        return answer;
    }

	private static int withdrawMoney(int money, int won) {
		return money / won;
	}

	private static int updateMoney(int money, int won) {
		return money % won;
	}
}
