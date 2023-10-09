package smallProjects.StringProjects;

public class GettingFirstHalf {

	public static void main(String[] args) {
		String str = "Butter";
		firstHalf(str);
	}

	public static String firstHalf(String str) {
		if (str.length() % 2 == 0) {
			str = str.substring(0, str.length() / 2);
		} else {
			System.err.println("String MUST divide by 2.");
		}
		return str;
	}
}
