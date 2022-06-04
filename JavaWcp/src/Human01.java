
public class Human01 { //publicクラス"Human01"・Human01という公開設計書
	public String name; //変数用意・設計書の中にはこんな情報が
	public int age; //変数用意・設計書の中にはこんな情報が
	
	public Human01() { //コンストラクタ"Human01"(引数なし)
		name = "山田"; //初期値用意！
		age = 20; //初期値用意！
	}
	
	public Human01(String name, int age) { //コンストラクタ"Human01"(引数２つ)
		this.name = name; //インスタンス作成時に決めろ
		this.age = age; //インスタンス作成時に決めろ
	}
	
	public Human01(String name) { //コンストラクタ”Human01"(引数１つ)
		this.name = name; //インスタンス作成時に決めろ
		age = 30; //初期値用意！
	}
}

//修飾子 class クラス名 {
//    修飾子 コンストラクタ(引数) {
//        // 初期化処理
//    }
//}
//コンストラクタの定義
//①メソッド(コンストラクタ)名とクラス名が完全一致 今回は"Human01"
//②戻り値なし(voidとか書かない)
//コンストラクタとは、インスタンス生成時に自動で実行される処理
//生まれたてのインスタンスちゃんに初期設定をつけてあげる