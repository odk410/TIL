package Programmers_Level2;

class Collatz {
public int collatz(int num) {
		int answer = -1;
		int cnt = 1;
		int n = num;
		
		while(cnt<=500){
			if(n%2==0){
				n /= 2;
			}
			else{
				n = (n*3)+1;
			}
			
			if(n==1){
				answer = cnt;
				break;
			}
			else{
				cnt++;
			}			
		}
		return answer;
	}
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}
