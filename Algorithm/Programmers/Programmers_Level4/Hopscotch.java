package Programmers_Level4;

class Hopscotch {
    int hopscotch(int[][] board, int size) {
        int result = 0;
        int check;
        int max = 0;
        
               
        // 함수를 완성하세요.
        
        for(int i=0; i<board.length; i++){
        	for(int j=0; j<board[0].length; j++){
        		if(max < board[i][j] ){
        			max = board[i][j];
        			check = j;
        		}
        	}        	
        	result += max;
        	max = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 3));
    }

}