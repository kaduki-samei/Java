package practice02;

//1~10の間に偶数が何個あるか、また、偶数の合計はいくつか表示させる

public class Practice02No2 {
	public static void main(String[] args) {
		int c = 0;
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				c++;
				s += i;
			}
		}
		System.out.println(c + "個で合計は" + s);
	}
}

//すぐできた　これでいいのかは分からないが