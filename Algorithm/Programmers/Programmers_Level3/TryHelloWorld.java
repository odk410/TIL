package Programmers_Level3;

import java.util.ArrayList;

class TryHelloWorld
{
    public int nextBigNumber(int n)
    {
        int answer = 0;
        boolean flag = true;
        ArrayList<Integer> bin = new ArrayList<Integer>();
        ArrayList<Integer> binBig = new ArrayList<Integer>();
        int mok = n;
        int cnt = 0;
        
        while(flag){
        	
        	if(mok%2==1){
        		cnt++;
        	}
        	
        	mok /= 2;
        	
        	if(mok == 1 || mok == 0){
        		if(mok == 1){
        			cnt++;
        		}
        		flag = false;
        	}
        }
        
        flag = true;
        
        for(int i=n+1; i<1000000; i++){
        	int mokBig = i;
        	int cntBig = 0;
        	flag = true;
        	
        	while(flag){
            	if(mokBig%2==1){
            		cntBig++;
            	}
         
            	mokBig /= 2;
            	
            	if(mokBig == 1 || mokBig == 0){
            		if(mokBig == 1){
            			cntBig++;
            		}
            		flag = false;
            	}
            }
        	
        	if(cnt == cntBig){
        		answer = i;
        		break;
        	}
        }
        
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}