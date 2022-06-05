package practice02;

//1~10までの整数をカンマ区切りで横並びで表示させる(10にはカンマをつけない)

public class Practice02No3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + (i!=10? "," : ""));
		}
	}
}

//すぐできた！多分あってる