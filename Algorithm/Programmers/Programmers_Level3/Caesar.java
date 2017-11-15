package Programmers_Level3;

class Caesar {
	String caesar(String s, int n) {
		String result = "";
		// 함수를 완성하세요.
		
		n %= 26;	//26을 넘으면 어차피 처음부터이니까 시작부터 26을 나누어준다.
		
		for(int i=0; i<s.length(); i++){
			
			if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
				if((int)s.charAt(i)+n>90){
					result += (char)(s.charAt(i)+n-26);
				}
				else{
					result += (char)(s.charAt(i)+n);
				}
			}
			else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
				if((int)s.charAt(i)+n>122){
					result += (char)(s.charAt(i)+n-26);
				}
				else{
					result += (char)(s.charAt(i)+n);
				}
			}
			else if(s.charAt(i)==' '){
				result += " ";
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 26));
	}
}