package Programmers_Level3;

class JumpCase {

    public int jumpCase(int num) {
        int answer = 0;
        int p1 = 1;
        int p2 = 1;
        int p3 = 0;
        
        if(num == 1){
        	answer = 1;
        }
        else{
        	for(int i=2; i<=num; i++){
        		p3 = p1+p2;
        		p1 = p2;
        		p2 = p3;
        	}	
        	answer = p3;
        }
        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.jumpCase(testCase));
    }
}
