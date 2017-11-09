package Programmers_Level1;

import java.util.Arrays;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
		
		int cnt = 0;
		
		for(int i=0; i<array.length; i++){
			if(array[i]%divisor ==0){
				cnt++;
			}
		}
		
		int[] ret = new int[cnt];
		
		int j = 0;
		
		for(int i=0; i<array.length; i++){
			if(array[i]%divisor ==0){
				ret[j] = array[i];
				j++;
			}
		}
		
		return ret;
	}
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}