package practice03;

public class Practice03No1 {
	public static void main(String[] args) {
		
		//正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。		
		int x = 1;
		if (x % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
		
		//「aが7より大きいならtrue」という式を記述し、実行結果を得てください。
		int a = 3;
		if (a > 7) {
			System.out.println(a + "は7より大きいです");
		} else {
			System.out.println(a + "は7以下です");
		}
		
		//20歳以上の会員は1100円、非会員は1500円です。
		//20歳未満の会員は800円、非会員は500円です。
		//ageとmembersの値に基づいて、入場料金を求めるプログラムを作成してください。
		
		int age = 15;
		boolean members = true;
		int fee = 0;
		if (age >= 20 && members == false) {
			fee += 1500;
		} else if (age >= 20 && members == true) {
			fee += 1100;
		} else if (age < 20 && members == false) {
			fee += 800;
		} else {
			fee += 500;
		}
		System.out.println("入場料は" + fee + "円です");
		
		//二重ループを使い、かけ算九九を表示するプログラムを記述してください。
		for (int n = 1; n <= 9; n++) {
			for (int y = 1; y <= 9; y++) {
				System.out.print(n * y + " ");
			}
			System.out.println("");
		}
		
		//配列arrayの各要素の値を２倍にして表示してください。
		int[] array = { 1, 2, 3, 4, 5 };
		for (int pp : array) {
			System.out.println(pp * 2);
		}
		
		
		
	}	
}
