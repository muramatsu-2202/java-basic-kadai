package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		 // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 sercWord = new Dictionary_Chapter21();

        // 辞書を初期化
        sercWord.furuDict();

        // 調べる英単語を配列にセット
        String[] searchWords = {"apple", "banana", "grape", "orange"};

        // 配列に含まれる各単語について辞書を検索
        for (String word : searchWords) {
            sercWord.setSearchWord(word); // 検索したい単語を設定
            sercWord.searchDic();         // 辞書を検索し、結果を出力
        }
		
		
		
	}

}
