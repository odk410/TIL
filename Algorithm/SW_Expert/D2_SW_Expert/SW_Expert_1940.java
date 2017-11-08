package D2_SW_Expert;

import java.util.Scanner;

public class SW_Expert_1940 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N, status, speed, totalSpeed, distance;
		
		for(int testcase = 1; testcase<=T; testcase++){
			N = sc.nextInt();
			distance = 0;
			totalSpeed = 0;
			
			for(int i=0; i<N; i++){
				status = sc.nextInt();
				if(status != 0){
					speed = sc.nextInt();
					
					if(status == 1){
						totalSpeed += speed;
						distance+=totalSpeed;
					}
					else if(status == 2){
						if(totalSpeed < speed){
							totalSpeed = 0;
							distance += totalSpeed;
						}else{
							totalSpeed -= speed;
							distance += totalSpeed;
						}
					}
				}
				
				else{
					distance += totalSpeed;
				}
			}
			
			System.out.println("#" + testcase + " " + distance);
			
		}
		

	}

}
