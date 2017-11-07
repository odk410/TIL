package SW_Expert;

import java.util.Scanner;

public class SW_Expert_2058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int sum = 0;
		
		for(int i=0; i<N.length(); i++){
			sum += N.charAt(i) - '0';	// char형을 int 형으로 만드는 방법 중 하나~~!!
		}
		
		System.out.println(sum);

	}

}
