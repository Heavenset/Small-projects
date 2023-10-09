package smallProjects.StringProjects;

public class GrabingXChars {

	public static void main(String[] args) {
		String str = "Hello";
		int n = 4;
		grabingX(str, n);
	}

	private static String grabingX(String str, int n) {
		if (str.length() > n) {
			String firstLetters = str.substring(0, n);
			String lastLetters = str.substring(str.length() - n);
			str = firstLetters + lastLetters;
			System.out.println(str);
		}
		if(str.length() == n) {
			str = str + str;
		}
		return str;
	}
}
