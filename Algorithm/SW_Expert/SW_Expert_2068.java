package SW_Expert;
import java.util.Scanner;

public class SW_Expert_2068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[10];
		int Max;
		
		for(int i=1; i<=T; i++){
			Max = 0;
			
			for(int j=0; j<10; j++){
				arr[j] = sc.nextInt();
				Max = Math.max(Max, arr[j]);
			}
			
			System.out.println("#" + i + " " + Max);
		}
		
				
	}

}
