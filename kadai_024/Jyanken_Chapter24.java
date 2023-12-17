package kadai_024;
import java.util.HashMap;
import java.util.Scanner;
public class Jyanken_Chapter24 {
  public String getMyChoice() {
	  String[]myHands = {"r","s","p"};
	  System.out.println("自分のじゃんけんの手を入力しましょう");
	  System.out.println("グーはrockのrを入力しましょう");
	  System.out.println("チョキはscissorsのsを入力しましょう");
	  System.out.println("パーはpaperのpを入力しましょう");
	  Scanner scanner = new Scanner(System.in);
	  String input = scanner.next();
	  for(int i = 0; i < myHands.length; i++) {
		  if(input.equals(myHands[i])) {
			  return input;
		  }
		  scanner.close();
	  }
	  System.out.println("正しいじゃんけんの手ではありません");
	  return getMyChoice();
	  
		  
		  
			  
	  
	  }
  public String getRandom() {
	  String[] enemyHands = {"r","p","s"};
	  String enemyHand = enemyHands[(int)Math.floor(Math.random()*3)];
	  return enemyHand;
  }
  
  public void playGame() {
	  String me = getMyChoice();
	  String enemy = getRandom();
	  
	  HashMap<String,String>output = new HashMap<String,String>();
	  output.put("r", "グー");
	  output.put("s", "チョキ");
	  output.put("p", "パー");
	  
	  System.out.println("自分の手は" + output.get(me) +",対戦相手の手は" + output.get(enemy));
	  
	  if(output.get("me") == "r" && output.get("enemy") == "r") {
		  System.out.println("あいこです");
	  }else if(output.get("me") == "r" && output.get("enemy") == "s") {
		  System.out.println("自分の勝ちです");
	  }else if(output.get("me") == "r" && output.get("enemy") == "p") {
		  System.out.println("自分の負けです");
	  }else if(output.get("me") == "s" && output.get("enemy") == "r") {
		  System.out.println("自分の負けです");
	  }else if(output.get("me") == "s" && output.get("enemy") == "s") {
		  System.out.println("あいこです");
	  }else if(output.get("me") == "s" && output.get("enemy") == "p") {
		  System.out.println("自分の勝ちです");
	  }else if(output.get("me") == "p" && output.get("enemy") == "r") {
		  System.out.println("自分の勝ちです");
	  }else if(output.get("me") == "p" && output.get("enemy") == "s"){
		  System.out.println("自分の負けです");
	  }else{
		  System.out.println("あいこです");
	  }
  }
  
}
