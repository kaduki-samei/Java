
public class Null01 {
	public static void main(String[] args) {
		String string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());
		
		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());
		
//		string1 = null;
//		System.out.println(string1 + "の文字数：" + string1.length());
		
		
		int[] array1 = new int[3];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		
		int int2 = array1[2];
		
//		int array2[] = null;
		int[] array3 = new int[] { 10, 20, 30, 40 };
		int array4[] = { 10, 20, 30 };
		
		System.out.println(int2);
		System.out.println(array3[3]);
		System.out.println(array4[0]);
	}
}
