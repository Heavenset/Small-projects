package smallProjects.StringProjects;

public class GettingMiddleOfString {

	public static void main(String[] args) {
		String str = "Butter";
		middleString(str);
	}

	private static String middleString(String str) {
		if (str.length() >= 2) {
			StringBuilder sb = new StringBuilder();
			sb.append(str);
			sb.deleteCharAt(0);
			sb.deleteCharAt(str.length() - 2);
			str = sb.toString();
			System.out.println(str);
		} else {
			System.err.println("String lenght MUST be atleast 2 chars.");
		}
		return str;
	}
}
