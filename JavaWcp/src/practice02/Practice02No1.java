package practice02;

//1~10の整数のうち、偶数だけを昇順で表示させる

public class Practice02No1 {	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
