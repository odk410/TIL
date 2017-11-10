package D2_SW_Expert;

import java.util.Arrays;
import java.util.Scanner;

public class SW_Expert_1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int arr[];
		
		for(int testcase = 1; testcase<=T; testcase++){
			N = sc.nextInt();
			arr = new int[N];
			
			for(int i=0; i<N; i++){
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			System.out.print("#" + testcase);
			for(int i=0; i<N; i++){
				System.out.print(" " + arr[i]);
			}
			System.out.println("");
			
		}

	}

}
