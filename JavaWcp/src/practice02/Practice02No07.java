package practice02;

public class Practice02No07 {
	public static void main(String[] args) {

		String S = "Paiza";
		String line = "";

		for (int i = 1; i <= S.length() + 2; i++) {
			line += "+";
		}

		System.out.println(line);
		System.out.println("+" + S + "+");
		System.out.println(line);

	}
}
