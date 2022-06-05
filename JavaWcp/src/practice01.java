
public class practice01 {
	public static void main(String[] args) {
		
		System.out.println("★問1 1~10のうち偶数のみを昇順で表示させる");
		for (int i =1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("★問2 1~10までに偶数が何個あるか、また、偶数の合計は幾つになるか表示させる");
		int c = 0;
		int s =0;
		for (int i =1; i <= 10; i++) {
			if (i % 2 == 0) {
				c++;
				s += i;
			}
		}
		System.out.println("偶数の数は" + c + "個");
		System.out.println("偶数の合計は" + s);
		
		System.out.println("★問3 1~10までの整数をカンマ区切りで横並びに表示させる");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + (i!=10? "," : ""));
		}
		
		System.out.println();
		System.out.println("★問4 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる");
		System.out.println("[0]~[10]の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる");
		int array[] = new int[20];
	    for (int i = 1; i <  array.length; i++) {
	      array[i] = array[i - 1] + 5;
	    }
	    
	    for (int index = 0; index <= 10; index++) {
	    	if (index % 2 == 0) {
	    		continue;
	    	}
	    	System.out.print(array[index] + ",");
	    }
	    for (int index = 11; index < array.length; index++) {
	    	if (index % 2 == 0) {
	    		System.out.print(array[index] + ",");
	    	}
	    }

	}
}
