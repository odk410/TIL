package D2_SW_Expert;

import java.util.Scanner;

public class SW_Expert_1946 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char Ci[];
		int Ki[];
		int N, cnt;
		String result = "";
		
		for(int testcase = 1; testcase<=T; testcase++){
			N = sc.nextInt();
			Ci = new char[N];
			Ki = new int[N];
			
			for(int i=0; i<N; i++){
				Ci[i] = sc.next().charAt(0);
				Ki[i] = sc.nextInt();
			}
			
			for(int i=0; i<N; i++){
				for(int j=0; j<Ki[i]; j++){
					result+=Ci[i];
				}
			}
			
			cnt = 0;
			
			System.out.println("#" + testcase);
			for(int i=0; i<result.length(); i++){
				System.out.print(result.charAt(i));
				cnt++;
				if(cnt%10 == 0){
					System.out.println("");
				}				
			}
			System.out.println("");
			result = "";
		}

	}

}
