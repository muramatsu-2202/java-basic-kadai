package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//インスタンス作成
		KatoTaro_Chapter18 taro     = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		//太郎実行
		taro.setGivenName();
		taro.execlntroduce();
		taro.eachintroduce();
		//一郎実行
		ichiro.setGivenName();
		ichiro.execlntroduce();
		ichiro.eachintroduce();
		//花子実行
		hanako.setGivenName();
		hanako.execlntroduce();
		hanako.eachintroduce();

	}

}
