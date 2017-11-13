package Programmers_Level1;

class StringExercise{
    String getMiddle(String word){
    	
    	String result = "";
    	
    	if(word.length()%2 == 0){
    		result += word.substring(word.length()/2-1, word.length()/2+1); //subString의 뒤의 범위는 포함하지 않는다 그래서 +1을 해준다.
    	}
    	else{
    		result += word.charAt(word.length()/2);
    	}

    	return result;    
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("tree"));
    }
}
