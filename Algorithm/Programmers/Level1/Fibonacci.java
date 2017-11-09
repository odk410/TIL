package Programmers_Level1;

class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
		long fib[] = new long [num+1];
		fib[1] = 1;
		fib[2] = 1;
		
		for(int i=3; i<=num; i++){
			fib[i] = fib[i-2]+fib[i-1];
		}
		
		answer = fib[num];
		
		return answer;
	}

  // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}

}
	