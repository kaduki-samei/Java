package Practice04;

//２の１乗から８乗まで

public class No01 {
	
	public static void main(String[] args) {
		
		int x = 1;
		
		for (int i = 1; i <= 8; i++) {
			x *= 2;
			System.out.println("2の" + i + "乗は " + x);
		}
	}

}
