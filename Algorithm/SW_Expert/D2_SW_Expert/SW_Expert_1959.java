package D2_SW_Expert;

import java.util.Scanner;

public class SW_Expert_1959 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N, M, Max, tmp, cnt;
		int Aj[], Bj[], result[];
		

		for (int testcase = 1; testcase <= T; testcase++) {
			
			N = sc.nextInt();
			M = sc.nextInt();
			Aj = new int[N];
			Bj = new int[M];
			
			Max = 0;
			
			for(int i = 0; i<N; i++){
				Aj[i] = sc.nextInt();
			}
			for(int i = 0; i<M; i++){
				Bj[i] = sc.nextInt();
			}
			
			if(Aj.length > Bj.length){
				for(int i=0; i<Aj.length-Bj.length+1; i++){
					result = new int[Bj.length];
					
					for(int j=0; j<Bj.length; j++){
						result[j] = Bj[j];
					}
					cnt = 0;
					for(int k=i; k<i+Bj.length; k++){
						result[cnt] *= Aj[k];
						cnt++;
					}
					
					tmp = 0;
					
					for(int j=0; j<Bj.length; j++){
						tmp+=result[j];
					}
					
					if(tmp > Max){
						Max = tmp;
					}
					
				}
			}			
			else if(Aj.length < Bj.length){
				for(int i=0; i<Bj.length-Aj.length+1; i++){
					result = new int[Aj.length];
					
					for(int j=0; j<Aj.length; j++){
						result[j] = Aj[j];
					}
					cnt = 0;
					for(int k=i; k<i+Aj.length; k++){
						result[cnt] *= Bj[k];
						cnt++;
					}
					
					tmp = 0;
					
					for(int j=0; j<Aj.length; j++){
						tmp+=result[j];
					}
					
					if(tmp > Max){
						Max = tmp;
					}
					
				}
			
				
			}
			
			System.out.println("#" + testcase + " " + Max);
		}
	}

}
