
public class DoWhile01 {
	public static void main(String[] args) {
//		DoWhile文…必ず一度は処理し、条件がtrueの間繰り返す
		int number = 1;
		do {
			number *= 2;
			System.out.println("While01= " + number);
		} while (number < 50);
	}
}
