package Programmers_Level1;

public class WaterMelon {
	public String watermelon(int n){
		String su = new String("��");
	    String bak = new String("��");
	    String total = "";
	    
	    for(int i = 0; i < n; i++){
	    	if(i%2 == 0){
	    		total += su;
	    	}
	    	else{
	    		total += bak;
	    	}
	    }
		
		return total;
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}
}