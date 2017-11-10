package D2_SW_Expert;

import java.util.Scanner;

public class SW_Expert_1970 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int price[];
		
		for(int testcase = 1; testcase<=T; testcase++){
			N = sc.nextInt();
			
			price = new int[8];
			
			if(N/50000 != 0){
				price[0] = N/50000;
				N %= 50000;
			}
			if(N/10000 != 0){
				price[1] = N/10000;
				N %= 10000;
			}
			if(N/5000 != 0){
				price[2] = N/5000;
				N %= 5000;
			}
			if(N/1000 != 0){
				price[3] = N/1000;
				N %= 1000;
			}
			if(N/500 != 0){
				price[4] = N/500;
				N %= 500;
			}
			if(N/100 != 0){
				price[5] = N/100;
				N %= 100;
			}
			if(N/50 != 0){
				price[6] = N/50;
				N %= 50;
			}
			if(N/10 != 0){
				price[7] = N/10;
				N %=10;
			}
			
			System.out.println("#" + testcase + " ");
			for(int i=0; i<8; i++){
				System.out.print( price[i] + " ");
			}
			System.out.println(" ");
		}

	}

}
