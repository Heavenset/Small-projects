package smallProjects.StringProjects;

public class TwoLettersFromXChar {

	public static void main(String[] args) {
		String str = "java";
		int startingIndex = -1;
		twoCharsFromX(str, startingIndex);
	}

	private static String twoCharsFromX(String str, int startingIndex) {
		if (str.length() > 2) {
			if (startingIndex + 2 > str.length() || startingIndex < 0) {
				str = str.substring(0, 2);
				System.out.println(str);
				return str;
			}
			str = str.substring(startingIndex, startingIndex + 2);
			System.out.println(str);
		} else if (str.length() == 2) {
			System.out.println(str);
			return str;
		}
		return str;
	}
}