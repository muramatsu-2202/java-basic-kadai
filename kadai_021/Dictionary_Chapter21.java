package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> dictionary = new HashMap<String,String>();
	String givenWord;
	
	public void furuDict() {
		
	     dictionary.put("apple","りんご");
	     dictionary.put("peach","桃");
	     dictionary.put("banana","バナナ");
	     dictionary.put("lemon","レモン");
	     dictionary.put("pear","梨");
	     dictionary.put("kiwi","キウィ");
	     dictionary.put("strawberry","いちご");
	     dictionary.put("grape","ぶどう");
	     dictionary.put("muscat","マスカット");
	     dictionary.put("cherry","さくらんぼ");
	     
	 }
	
	public void setSearchWord(String givenWord) {
		this.givenWord = givenWord;
	}
	
	public void searchDic() {
		if (dictionary.containsKey(givenWord))  {
			String meaning = dictionary.get(givenWord);
            System.out.println(givenWord + "の意味は " + meaning + " です。");
        } else {
            System.out.println(givenWord + "は辞書に含まれていません。");
		}
	}
}
