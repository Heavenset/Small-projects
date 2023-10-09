package smallProjects.StringProjects;

public class Middle2Chars {

	public static void main(String[] args) {
		String str = "Poland";
		middleTwo(str);
	}

	public static String middleTwo(String str) {
		if (str.length() % 2 == 0) {
			int middleIndex = str.length() / 2;
			str = str.substring(middleIndex - 1, middleIndex + 1);
			System.out.println(str);
		} else {
			System.out.println("You cant get 2 middle chars from uneven string.");
		}
		return str;
	}

}
