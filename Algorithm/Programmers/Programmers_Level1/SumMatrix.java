package Programmers_Level1;

class SumMatrix {
	int[][] sumMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][A[0].length];
		
		for(int i=0; i<A.length; i++){					//2차원 배열 length --> 배열의 이름.length는 행의 길이
			for(int j=0; j<A[i].length; j++){			//2차원 배열 length --> 배열의 이름[i].length는 행의 길이
				answer[i][j] = A[i][j] + B[i][j];
			}
		}

		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1, 2 }, { 2, 3 } };
		int[][] B = { { 3, 4 }, { 5, 6 } };
		int[][] answer = c.sumMatrix(A, B);
		if (answer[0][0] == 4 && answer[0][1] == 6 && 
				answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("맞았습니다. 제출을 눌러 보세요");
		} else {
			System.out.println("틀렸습니다. 수정하는게 좋겠어요");
		}
	}
}

