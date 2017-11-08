package D2_SW_Expert;

import java.util.Scanner;

public class SW_Expert_1288 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int num, cnt, calNum, mok, nmg, cnt2, len, tmp;
		int check[] = new int[10];
		
		for(int testcase = 1; testcase<=T; testcase++){
			num = sc.nextInt();
			cnt = 0;
			cnt2 = 0;
			
			while(cnt2!=10){
				cnt++;
				calNum = cnt*num;
				len = 0;
				tmp = calNum;
				
				while(tmp != 0){
					len++;
					tmp/=10;
				}
				
				for(int i=0; i<len; i++){
					check[calNum%10]++;
					calNum /= 10;					
				}
				
				cnt2 = 0;
				
				for(int i=0; i<10; i++){
					if(check[i] != 0){
						cnt2++;						
					}
				}
				
			}
			
			for(int i=0; i<10; i++){
				check[i] = 0;
			}
			System.out.println("#" + testcase + " " + cnt*num);
		}

	}

}
