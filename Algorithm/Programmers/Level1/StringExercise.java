package Programmers_Level1;

class StringExercise{
    String getMiddle(String word){
    	
    	String result = "";
    	
    	if(word.length()%2 == 0){
    		result += word.substring(word.length()/2-1, word.length()/2+1); //subString�� ���� ������ �������� �ʴ´� �׷��� +1�� ���ش�.
    	}
    	else{
    		result += word.charAt(word.length()/2);
    	}

    	return result;    
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("tree"));
    }
}
