package Programmers_Level2;

class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;
		// �Լ��� �ϼ��ϼ���.
		
		for(int i=2; i<=n; i++){
			
			int ok = 1;						//�Ҽ� �� 1 �Ҽ�X : 0
					
			if(i == 2){					    //2�� ������ �Ҽ�
				ok = 1;
			}
			else{
				for(int j=2; j<i; j++){	    //1�� �Ҽ��� �ƴϱ� ������ 2���ͽ��� �׸��� i-1���� ������ �������� ���� ����� �Ѵ�.
					if(i%j == 0){			//���� ������ �������� ���� �ִٸ�
						ok = 0;				//�Ҽ����� �Ǻ��ϴ� ok ������ �Ҽ�X�� 0�� �����Ѵ�.
						break;				//�ϳ��� ������ �������ٸ� �Ҽ��� �ƴϱ� ������ ���߰� ���� ������ �����Ѵ�.
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