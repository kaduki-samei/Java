package Practice04;

public class No03 {
	
	public static void main(String[] args) {
		
		int vs[] = {0, 1, 0, 1, 1, 1, 0, 0, 1, 0};
		int win = 0;
		
		for (int i : vs) {
			if (i == 1) {
				win += 1;
			}
		}
		System.out.println("勝ち数:" + win + " 負け数:" + (10-win));
	}

}
