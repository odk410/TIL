package Programmers_Level2;

public class HarshadNumber{
	public boolean isHarshad(int num){
		int n = num;
		int nmg = 0;
		int sum = 0;
		
		while(n!=0){
			nmg = n%10;
			n/=10;			
			sum += nmg;
		}
	
		if(num%sum == 0){
			return true;
		}
		else{
			return false;
		}
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}