package kadai_020;
import java.util.HashMap;
public class Dictionary_chapter20 {
	public void search(String[] words) {
	  HashMap<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
	  String result = "";
	  for(int i =0; i < words.length;i++) {
		  result = dictionary.get(words[i]);
		  if(result == null) {
			  result = words[i] + "は辞書に存在しません。";
		  }else {
			  result = words[i] + "の意味は" + result;
		  }
		  System.out.println(result);
	  }
	}

}
