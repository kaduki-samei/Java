package practice02;

//配列内の２番目に大きい数値を表示する

public class Practice02No06 {
	
	public static void main(String[] args) {
		
		int array[] = {40, 66, 57, 86, 2, 5, 90};
		int c = 0; //負けた回数
		
		for (int i = 0; i < array.length; i++) {
			for (int n = 0; n < array.length; n++) {
				if (array[i] < array[n]) {
					c++;
				}
			}
			if (c == 1) {
				System.out.println(array[i]);
			}
			c =0;
		}
	}
}

//それぞれ勝負させて負けた回数が１回だけの奴が２番目に大きい数値だー！ってやり方