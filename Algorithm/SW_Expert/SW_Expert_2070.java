package SW_Expert;
import java.util.Scanner;

public class SW_Expert_2070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i=1; i<=T; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a==b){
				System.out.println("#" + i + " " + "=");
			}
			else if(a>b){
				System.out.println("#" + i + " " + ">");
			}
			else if(a<b){
				System.out.println("#" + i + " " + "<");
			}
		}
	}

}
