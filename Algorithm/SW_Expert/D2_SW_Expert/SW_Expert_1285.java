package D2_SW_Expert;

import java.util.Scanner;

public class SW_Expert_1285 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n;
		int arr[];
		int check[] = new int[100001];
		for(int testcase = 1; testcase<=T; testcase++){
			n = sc.nextInt();
			arr = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
				check[Math.abs(arr[i])]++;				
			}
			
			for(int i=0; i<check.length; i++){
				if(check[i] != 0){
					System.out.println("#" + testcase + " " + i + " " + check[i]);
					break;
				}
			}
		}
	}

}
