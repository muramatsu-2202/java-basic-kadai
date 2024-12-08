package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		
		 
        Dictionary_Chapter21 sercWord = new Dictionary_Chapter21();

        
        sercWord.furuDict();

        
        String[] searchWords = {"apple", "banana", "grape", "orange"};

        
        for (String word : searchWords) {
            sercWord.setSearchWord(word); 
            sercWord.searchDic();         
            
        }
		
		
		
	}

}
