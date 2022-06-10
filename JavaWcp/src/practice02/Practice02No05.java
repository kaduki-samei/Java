package practice02;

//配列内の数値の平均以下のものだけ表示する

public class Practice02No05 {
	
	public static void main(String[] args) {
		
		int array[] = {5, 46, 3, 12, 7, 16, 22, 9};
		int s = 0; //合計
		
		for (int ar : array) {
			s += ar;
		}
		
		int a = s / array.length; //合計
		
		for (int ar : array) {
			if (ar <= a) {
				System.out.println(ar);
			}
		}
	}
}
