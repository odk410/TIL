package Programmers_Level3;

class Caesar {
	String caesar(String s, int n) {
		String result = "";
		// �Լ��� �ϼ��ϼ���.
		
		n %= 26;	//26�� ������ ������ ó�������̴ϱ� ���ۺ��� 26�� �������ش�.
		
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
		System.out.println("s�� 'a B z', n�� 4�� ���: " + c.caesar("a B z", 26));
	}
}