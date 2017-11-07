package SW_Expert;
import java.util.Scanner;

public class SW_Expert_2071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[10];
		int sum;
		double avg;
		
		for(int i=1; i<=T; i++){
			sum = 0;
			avg = 0;
			
			for(int j=0; j<10; j++){
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			avg = sum/10.0;
			
			System.out.println("#" + i + " " + Math.round(avg));
		}
		
	}

}
