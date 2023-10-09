package smallProjects.StringProjects;

public class First2ToEnd {

	public static void main(String[] args) {
		String str = "Example";
		twoToEnd(str);
	}

	private static String twoToEnd(String str) {
		if (str.length() >= 2) {
			if (str.length() > 2) {
				String firstCHARS = str.substring(0, 2);
				String lastCHARS = str.substring(2);
				str = lastCHARS + firstCHARS;
			}
			System.out.println(str);
		} else {
			System.err.println("String lenght HAVE to be at least 2");
		}
		return str;
	}
}
