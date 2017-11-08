package D2_SW_Expert;

import java.util.Scanner;

public class SW_Expert_1945 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    int N;
	    int num[] = {2,3,5,7,11};
	    int a,b,c,d,e;
	    
	    for(int testcase = 1; testcase<=T; testcase++){
	    	N = sc.nextInt();
	    	a=0; 
	    	b=0;
	    	c=0;
	    	d=0;
	    	e=0;
	    	
	    	for(int i=0; i<5; i++){
	    		while(N%num[i] == 0){
	    			if(num[i] == 2){
	    				a++;
	    				N /= num[i];	    				
	    			}
	    			else if(num[i] == 3){
	    				b++;
	    				N/=num[i];
	    			}
	    			else if(num[i] == 5){
	    				c++;
	    				N/=num[i];
	    			}
	    			else if(num[i] == 7){
	    				d++;
	    				N/=num[i];
	    			}
	    			else if(num[i] == 11){
	    				e++;
	    				N/=num[i];
	    			}
	    		}
	    	}
	    	
	    	System.out.println("#" + testcase + " " + a + " " + b + " " + c + " " + d + " " + e);
	    }
	

	}

}
