package Programmers_Level2;

import java.util.Arrays;

public class ReverseInt {
	public int reverseInt(int n){
		
		int result = 0;
		String strInt = n+"";
		char charInt[] = strInt.toCharArray();
		String revStr = "";
		
		Arrays.sort(charInt);
		
		for(int i=0; i<charInt.length; i++){
			revStr += charInt[charInt.length-1-i];
		}
		
		result = Integer.parseInt(revStr);
	   
		return result;
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}