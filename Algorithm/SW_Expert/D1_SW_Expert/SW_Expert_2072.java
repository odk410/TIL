package D1_SW_Expert;
import java.util.Scanner;

public class SW_Expert_2072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[10];
		int sum;
		
		for(int i=1; i<=T; i++){
			sum = 0;
			
			for(int j=0; j<10; j++){
				arr[j] = sc.nextInt();
				
				if(arr[j]%2 == 1){
					sum += arr[j];	
				}
			}
			System.out.println("#"+ i + " " + sum);
		}

	}

}
