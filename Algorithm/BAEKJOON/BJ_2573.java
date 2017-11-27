package BAEKJOON;

import java.util.Scanner;

public class BJ_2573 {
	
	static int N,M;
	static int[][] Map, tempMap, copyMap;
	static int year = 0;
	static int cnt;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Map = new int[N][M];
		tempMap = new int[N][M];
		copyMap = new int[N][M];
		boolean flag = true;
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				Map[i][j] = sc.nextInt();
			}
		}
		
		while (flag) {
			cnt = 0;
			year++;
			down();			//¸Å³â ³·¾ÆÁü
			countLand();	//ºù»êÀÇ °³¼ö
			checkZero();
			
			if(cnt != 1){
				flag = false;
			}
		
		}
		
		System.out.println(year);
		
	}
	
	static void down(){
		int zero;
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				zero = 0;
				if(Map[i][j] != 0){
					for(int k=0; k<4; k++){
						if(Map[i+dx[k]][j+dy[k]] == 0){
							zero++;
						}
					}
					copyMap[i][j] = zero;
				}				
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				
				Map[i][j] -= copyMap[i][j];
				
				if(Map[i][j] < 0){
					Map[i][j] = 0;
				}
			}
		}
	}
	
	static void countLand(){
		
		for(int i=0; i<N; i++){	
			for(int j=0; j<M; j++){
				copyMap[i][j] = Map[i][j];	// ºù»êÀÇ °³¼ö¸¦ À§ÇÑ Map
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(copyMap[i][j] > 0){
					copyMap[i][j] = -1;
					find(i,j);
					cnt++;
				}
			}
		}
	}
	
	static void find(int x, int y){
		for(int i=0; i<4; i++){
			if(copyMap[x+dx[i]][y+dy[i]] > 0){
				copyMap[x+dx[i]][y+dy[i]] = -1;
				find(x+dx[i],y+dy[i]);
			}
		}
	}
	
	static void checkZero(){
		boolean allZero = true;
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(Map[i][j] != 0){				
					allZero = false;
				}
			}
			if(allZero == false)	break;
		}
		
		if(allZero == true){
			year = 0;
		}
	}

}
