package practice02;

//1~10までの整数をカンマ区切りで横並びで表示させる(10にはカンマをつけない)

public class Practice02No3 {
	
	public static void main(String[] args) {
		
		String str = "";
		boolean flg = true;
		
		for (int i = 1; i <= 10; i++) {
			if (flg) {
				str += i;
				flg = false;
			} else {
				str += "," + i;
			}
		}
		System.out.println(str);
	}
}

//すぐできた！多分あってる