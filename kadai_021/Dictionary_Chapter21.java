package kadai.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> dictionaryMap;
	
	// コンストラクタ
	 public Dictionary_Chapter21() {
		// 辞書として機能するHashMapを宣言
		dictionaryMap = new HashMap<String, String>();
		
		// 辞書に、10通りの英単語と意味を追加
		dictionaryMap.put("apple", "りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウィ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
	}
	// 辞書を調べる機能
	 public String getMeaning(String word) {
		 return dictionaryMap.get(word); 
		 
	 }
}
