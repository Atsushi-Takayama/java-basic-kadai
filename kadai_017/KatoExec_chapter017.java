package kadai_017;

public class KatoExec_chapter017 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      KatoTaro_chapter017 taro = new KatoTaro_chapter017();
      KatoIchiro_chapter017 ichiro = new KatoIchiro_chapter017();
      KatoHanako_chapter017 hanako = new KatoHanako_chapter017();
      
      
      hanako.setGivenName("花子");
      ichiro.setGivenName("一郎");
      taro.setGivenName("太郎");
      
      taro.commonIntroduce();
      taro.eachIntroduce();
      ichiro.commonIntroduce();
      ichiro.eachIntroduce();
      hanako.commonIntroduce();      
      hanako.eachIntroduce();
      
      
	}

}
