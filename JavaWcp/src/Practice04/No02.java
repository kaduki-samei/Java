package Practice04;

//7!

public class No02 {
	public static void main(String[] args) {
		
		int n = 1;
		
		for (int i = 7; i >= 1; i--) {
			n *= i;
		}
		System.out.println(n);
	}

}
