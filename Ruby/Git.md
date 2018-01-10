# Git

---

##1. Git 이란?

   - 코드의 history를 관리하는 도구

   - 개발된 과정과 역사를 볼 수 있고, 특정 시점으로 복구가 가능

     ​

##2. 알아두기

   - .git 과 Github는 서로 다른 것이다.

   - git을 기반으로 한 서비스는 Github만 있는 것이 아니다.

     ​

##3. Git 기본

   - add 커밋할 목록에 추가

   - commit 커밋 (히스토리의 한 단위) 만들기

   - push 현재까지의 history (commits)가 기록되어 있는 곳에 새로 생성한 커밋들 반영하기

   - 터미널 창 실행 후, 미리 설정되어 있을지 모를 계정 정보 삭제 (처음 설치시 생략 가능)

     `$ git config --global --unset credential.helper`

     `$ git config --system --unset credential.helper`

   - 나의 github 계정 이메일과 본인의 영문 이름으로 계정 정보 등록

     `$ git config --global user.email '이메일@적어라'`

     `$ git config --global user.name "이름 적어라"`

     ​

##4. Git 연습하기

   1. Basic routine

      `$ git status` : 파일의 상태 확인

      `$ git show HEAD` : 가장 마지막 커밋을 조회

      `$ git log` : 저장소의 커밋 히스토리를 시간순으로 보여줌

      ​

   2. Check differences

      `$ git diff` : 파일의 변경사항을 보여줌

      `puts "hello"`

      `-puts "hi"`

      `+puts "bye"`

      `$ git log -p` : 각 커밋의 diff 결과를 보여줌

      `$ git log -p-숫자` : 가장 최근 숫자개의 커밋 diff를 보여줌

      ​

   3. Bring the repository

      - `$ git clone Repository 주소 ` : 로컬에 해당 Repository의 파일들을 가져옴

      - Clone을 사용하지 않고 Download ZIP을 사용하게 된다면 git init 부터 즉 처음부터 하나하나 입력해야 함

      - 그리고 open in Desktop은 되도록 사용하지 말 것~~!!! 사용하다 꼬이면 닶이 없다~!!!

        ​

      1. 이번에는 두 대의 컴퓨터를 이용하여 git을 관리하는 실습을 진행함~

         - mkdir git_local / 집에서 사용하는 컴퓨터라고 가정
         - mkdir git_other / 학교 또는 회사에서 사용하는 컴퓨터라고 가정

         ​

         < other 환경 >

         1. clone 으로 local 환경에서 작업한 것을 불러오기

            `$ git clone Repository 주소`

         2. other에서 작업한 것을 commit 하기

            `$ git add 파일명 .`

            `$ git commit -m "커밋내용"`

            `$ git push -u origin master`

         < local 환경 >

         3. 여기서는 other에서 작업한 내용을 불러오면 된다 

            `git pull`

      2. 실수로 `git add .`를 해버려서 특정 add파일을 취소하는 방법

         1. 먼저 `git add .`한 상태

            `$ git reset HEAD 파일명` : 가장 최근에 add한 프로젝트

            ​

  4. Undo

      `$ git commit --amend` : 가장 최근의 커밋 메세지를 수정

      `$ git reset HEAD 파일명` : 가장 최근 커밋에서 해당 파일을 add 취소

      ​

   5. Versioning

      `$ git checkout HEAD~1` : 하나 직전 커밋으로 돌아감

      `$ git checkout 커밋해시코드` :  6자리 해당 커밋으로 돌아감

      ​

   6. 에러 무시하고 강제 push하는 방법

      `$ git push -f origin master` : 이건 협업할때 사용하지 말기 ! 에러를 무시하고 강제로 push하는 것임~!

      ​

##5. Fork 사용하기

   - Repository에서 Fork 누른 상태로 가정한 후

     Fork 후 내 Repository에 생성된 Repository

     `$ git clone Repository 주소`

     ​

   - 브런치 추가하기

     `$ git checkout -b "브런치 명"`

     ​

   - 브런치에 커밋하기

     `$ git add "파일명"`

     `$ git commit -m "커밋내용"`

     `$ git push -u origin "브런치 명"`

     ​

   - pull request 수정하기

   ​

   - 브런치에서 Compare & pull request 누른뒤 내용을 수정하고 create 버튼 누르기

   ​

   - 브런치 합치기

     1. test 브런치를 만들고

        `$ git checkout -b test`

     2. 파일을 하나 생성해주기

        `$ touch test.txt`

     3. 이후 add와 커밋을 한 뒤

        `$ git add test.txt`

        `$ git commit -m "another test branch"`

     4. develop 브런치로 이동하자

        `$ git checkout develop`

     5. 이후 브런치를 합치기

        `$ git merge test`

     ​

