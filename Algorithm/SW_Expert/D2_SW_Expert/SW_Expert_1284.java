package D2_SW_Expert;

import java.util.Scanner;

public class SW_Expert_1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int P, Q, R, S, W, a, b;
		
		for(int testcase = 1; testcase<=T; testcase++){
			P = sc.nextInt();
			Q = sc.nextInt();
			R = sc.nextInt();
			S = sc.nextInt();
			W = sc.nextInt();
			
			a = W*P;
			if(W<=R){
				b = Q;
			}
			else{
				b = Q + S*(W-R);
			}
			
			System.out.println("#" + testcase + " " +Math.min(a, b));
		}
		
	}

}
