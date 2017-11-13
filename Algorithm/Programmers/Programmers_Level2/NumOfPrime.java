package Programmers_Level2;

class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;
		// 함수를 완성하세요.
		
		for(int i=2; i<=n; i++){
			
			int ok = 1;						//소수 ㅣ 1 소수X : 0
					
			if(i == 2){					    //2는 무조건 소수
				ok = 1;
			}
			else{
				for(int j=2; j<i; j++){	    //1은 소수가 아니기 때문에 2부터시작 그리고 i-1까지 나누어 떨어지는 수가 없어야 한다.
					if(i%j == 0){			//만약 나누어 떨어지는 수가 있다면
						ok = 0;				//소수인지 판별하는 ok 변수에 소수X인 0을 설정한다.
						break;				//하나라도 나누어 떨어진다면 소수가 아니기 때문에 멈추고 다음 루프를 진행한다.
					}
				}
			}
			
			if(ok==1){
				result++;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println( prime.numberOfPrime(10) );
	}

}