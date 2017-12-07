## 멋쟁이사자처럼 프로젝트 실습교육 1일차

챗봇 실습은 chatbot.likelion.io 에서 실시함.

1. **Ruby 문법**

   - 저장
   - 조건
   - 반복

   >1. 무엇을 저장하는가?
   >   1. Numeric
   >      - 현실세계에 존재하는 모든 글자
   >   2. String
   >      - 따옴표로 둘러싸인 **글자** 또는 **숫자**
   >   3. Boolean
   >      - True or False

2. **Ruby 출력**

   1. print

      - 개행 x

   2. puts

      - 개행 o

   3. p

      - 유니코드 출력

     > Ruby의 출력에서 괄호를 안 넣어도 출력이 가능하다.
     >
     > ex) print(day) = print day
     >
     >  ```
     >  date = "03월 26일"
     >  age = 26.5
     >
     >  puts date
     >  puts age
     >
     >  print date
     >  print age
     >  puts
     >
     >  p date
     >  p age
     >
     >  puts
     >  puts date.class
     >  puts age.class
     >  ```
     >
     >  결과 값
     >
     >  03월 26일 26.5 03월 26일26.5 "03\uC6D4 26\uC77C" 26.5
     >
     >  String Float

3. **저장하는 방법**

   1. 변수

      - 저장된 값을 변경 할 수 있는 박스
      - 숫자, 글자, 참거짓을 담을 수 있다.

   2. 배열

      - 박스가 순서대로 여러개가 붙어있다.

   3. 해쉬

      - 견출지 붙인 박스들의 묶음

        ```
        dust = {"영등포구" => 58, "강남구" => 40}

        puts dust["영등포구"]

        결과 값
        58  
        ```





