package onboarding;

public class Problem4 {
	public static String solution(String word) {
		String answer = "";
		return answer;
	}

	private static boolean isAlphabet(char c) {
		return ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z');
	}

	private static char convertAlphabet(char c) {

		if (!isAlphabet(c))
			return c;

		if (Character.isUpperCase(c))
			return (char)(155 - (int)c);

		else
			return (char)(219 - (int)c);

	}
}
