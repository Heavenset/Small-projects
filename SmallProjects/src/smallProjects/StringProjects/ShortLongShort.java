package smallProjects.StringProjects;

public class ShortLongShort {

	public static void main(String[] args) {
		String stringA = "Butter";
		String stringB = "Cup";
		shortLongshort(stringA, stringB);
	}

	private static String shortLongshort(String stringA, String stringB) {
		String result = null;
		// checking if string isnt empty
		if (stringA.length() != 0 || stringB.length() != 0) {
			// and now checking for which string is bigger
			if (stringA.length() > stringB.length()) {
				result = stringB + stringA + stringB;
				System.out.println(result);
			} else {
				result = stringA + stringB + stringA;
				System.out.println(result);
			}
		}
		return result;
	}
}
