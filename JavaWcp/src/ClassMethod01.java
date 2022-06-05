
public class ClassMethod01 {
	public static void main(String[] args) { //mainメソッド・実行処理を書く場所
		Human01 yamada = new Human01(); //"Human01"クラスのインスタンス"yamada"を生成
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です");
		//引数なしコンストラクタで用意された初期値が設定される
		
		Human01 sato = new Human01("佐藤", 25); //"Human01"クラスのインスタンス"sato"を生成
		System.out.println("名前は" + sato.name + "で、年齢は" +  sato.age + "です");
		//引数２つのコンストラクタ・thisでインスタンス生成時に値を代入している
		
		Human01 sakai = new Human01("酒井"); //"Human01"クラスのインスタンス"sakai"を生成
		System.out.println("名前は" + sakai.name + "で、年齢は" + sakai.age + "です");
		//引数１つのコンストラクタ・thisで酒井を採用、年齢は初期値が準備されている
		
		
		Human01 ozawa = new Human01("小澤", 24);
		System.out.println("名前は" + ozawa.name + "で、年齢は" + ozawa.age + "です");
		
		Human01 lee = new Human01("李");
		System.out.println("名前は" + lee.name + "で、年齢は" + lee.age + "です");
	}
}

//なるほどね・・・？？
