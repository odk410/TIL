package Programmers_Level1;

public class PrintTriangle {
	public String printTriangle(int num){
		
		String triangle = "";
		
		for(int i=0; i<num; i++){
			for(int j=0; j<=i; j++){
				triangle += "*";
			}
			triangle += "\n";
		}

		return triangle;		
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}