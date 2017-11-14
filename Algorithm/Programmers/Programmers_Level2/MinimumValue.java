package Programmers_Level2;

import java.util.Arrays;

class TryHelloWorld
{
    public int getMinSum(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<A.length; i++){
        	answer += A[i] * B[A.length-i-1];	
        }
        
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int []A = {1805, 9730, 1575, 7506, 7285, 843, 6414, 3733, 8214, 4113};
        int []B = {6392, 1199, 1792, 4003, 6221, 8994, 9329, 4161, 5299, 3514};
        System.out.println(test.getMinSum(A,B));
    }
}