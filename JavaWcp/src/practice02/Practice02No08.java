package practice02;

public class Practice02No08 {
	public static void main(String[] args) {
		
		int day[] = {2, 3, 5, 7, 9, 11, 12, 15, 18, 22, 23, 27, 30};
		int pay[] = {1200, 1100, 700, 900, 2300, 4000, 1000, 1300, 2000, 1000, 800, 1100, 900};
		double point = 0;
		
		for (int i= 0; i < day.length; i++) {
			if (String.valueOf(day[i]).contains("3")) {
				point += pay[i] * 0.03;
			} else if (String.valueOf(day[i]).contains("5")) {
				point += pay[i] * 0.05;
			} else {
				point += pay[i] * 0.01;
			}
		}
		
		System.out.println((int) point + "ポイント");
	}

}
