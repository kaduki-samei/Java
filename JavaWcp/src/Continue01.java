
public class Continue01 {
	public static void main(String[] args) {
		for (int count = 0; count <5; count++) {
			if (count == 2) {
				continue;
			}
			System.out.println("Continue01 = " + count);
		}
	}
}

//countが2の場合、この後の処理をスキップ
//2の場合は出力処理はされない
//for文に戻りまた++されて、次は3なので出力処理される