package kadai.kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 調べる英単語を配列にセット
		ArrayList<String> words = new ArrayList<String>();
		words.add("apple");
		words.add("banana");
		words.add("grape");
		words.add("orange");
		
		// 辞書を調べる
		for(String word :  words ) {
			String meaning = dictionary.getMeaning(word);
			if(meaning != null) {
				System.out.println(word + ": " + meaning);
			} else {
				System.out.println(word + " is not exist.");
			}
		}

	}

}
