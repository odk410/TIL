package Programmers_Level4;

public class Expressions {

	public int expressions(int num) {
		int answer = 0;
		int cnt = 1;
		int sum;
	
		while(cnt < num){
			for(int i=1; i<=num-cnt+1; i++){
				sum = 0;
				for(int j=i; j<=i+cnt-1; j++){
				  sum += j;	
				  if(sum>num){
					  break;
				  }
				}
				
				if(sum == num){
					answer++;
				}
			}
			cnt++;
		}

		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(187));
	}
}