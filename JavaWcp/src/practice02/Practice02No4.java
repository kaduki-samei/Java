package practice02;

//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる
//[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる

public class Practice02No4 {
	public static void main(String[] args) {
		int[] num = new int[20];
		for (int n = 1; n < num.length; n++) {
			num[n] += num[(n - 1)] + 5;
		}
		
		for (int index = 0; index <= 10; index++) {
			if (index % 2 == 0) {
				continue;
			}
			System.out.print(num[index] + ",");
		}
		for (int index = 11; index <= 19; index++) {
			if (index % 2 == 0) {
				System.out.print(num[index] + ",");
			}
		}
	}
}

//できたんじゃない？
//いいんだよね？