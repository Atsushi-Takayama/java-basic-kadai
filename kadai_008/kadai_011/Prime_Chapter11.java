package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     boolean[] primeNumber = new boolean[101];
     for(int i = 0; i < primeNumber.length; i++) {
    	 primeNumber[i] = true;
     }
     int divide = 2;
     while(divide < primeNumber.length) {
    	 for(int i = divide + 1; i < primeNumber.length; i++) {
    		 if(i % divide == 0) {
    			 primeNumber[i] = false;
    			 continue;
    		 }
    		 
    	 }
    	 divide++;
     }
     for(int i = 2; i < primeNumber.length; i++) {
    	 if(primeNumber[i]) {
    		 System.out.println(i);
    	 }
     }
	}

}
