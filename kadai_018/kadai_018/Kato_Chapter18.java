package kadai_018;

abstract public class Kato_Chapter18 {
	//姓フィールド
	String familyName = "加藤";
	//名フィールド
	String givenName;
	//住所フィールド
	String address    = "東京都中野区○×";
	
	//メソッド
	//共通紹介用
	public void commonlntroduce(String familyName, String givenName, String address) {
		this.familyName = familyName;
		this.givenName  = givenName;
		this.address    = address;
	};
	
	//個別用
	abstract void eachintroduce();
	
	//実行メソッド
	public void execlntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	};

}
