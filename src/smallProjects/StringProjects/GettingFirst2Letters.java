package smallProjects.StringProjects;

public class GettingFirst2Letters {
	public static void main(String[] args) {
		String str = "Hello";
		firstTwo(str);
	}

	public static String firstTwo(String str) {
		if (str.length() <= 2) {
			return str;
		} else {
			str = str.substring(0, 2);
		}
		return str;
	}
}