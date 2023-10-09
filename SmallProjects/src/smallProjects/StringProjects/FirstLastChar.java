package smallProjects.StringProjects;

public class FirstLastChar {

	public static void main(String[] args) {
		String str = "1234567890";
		returnChar(str);

	}

	private static String returnChar(String str) {
		boolean charChanger = false;
		StringBuilder sb = new StringBuilder();
		if (str.length() >= 1) {
			// here we are getting 1st char of string if boolean charChanger == true
			if (charChanger == true) {
				sb.append(str.charAt(0));
				str = sb.toString();
				System.out.println(str);
				// and here we are getting last if charChanger == false
			} else if (charChanger == false) {
				// str.length() - 1 outputs last char because counting in programming starts from 0
				// but length is countring from 1, idk why :>
				sb.append(str.charAt(str.length() - 1));
				str = sb.toString();
				System.out.println(str);
			} else {
				System.err.println("Something went wrong.");
			}
			return str;
		}
		return str;
	}
}
