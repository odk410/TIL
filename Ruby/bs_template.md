# bs_template

- 프로젝트 명 : bs_template 
- 컨트롤러 명 : home (index)
- root는 index로~~
- C:\Users\student\Desktop\Unify-v2.4\Unify-v2.4\html 에 위치한 index를 눌러 원하는 것 고르기
- 페이지 만드는 것만 같이함~~
- 기능은 알아서~~



1. file:///C:/Users/student/Desktop/Unify-v2.4/Unify-v2.4/html/multipage/real-estate/ 에 있는 home-page-1.html 파일을 아톰에서 열기

2. 아톰에서 Open한 파일에서 아래 코드 복사하기

   ```html
   <meta charset="utf-8">
       <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   ```

3. view -> application에 추가

   ```html
   <head>
     <title>BsTemplate</title>
   <!-- 추가함 여기에~ -->  
     <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
     <%= stylesheet_link_tag    'application', media: 'all', 'data-turbolinks-track' => true %>
     <%= javascript_include_tag 'application', 'data-turbolinks-track' => true %>
     <%= csrf_meta_tags %>
   </head>
   ```

4. gemfile 추가하기

   ```ruby
   gem 'bootstrap'
   # 버전관리가 필요하다면 gem 'bootstrap', '~> 4.0.0.beta3'
   gem 'font-awesome-rails'
   gem 'simple-line-icons-rails'
   ```

5. app -> assets -> javascripts -> application.js

   ```javascript
   //= require jquery
   //= require jquery_ujs
   //= require turbolinks
   //--추가--
   //= require popper
   //= require bootstrap
   //----
   //= require_tree .
   ```

6. app-> assets -> stylesheets -> application 에 내용 모두 지우고 추가하기

   ```ruby
   @import "bootstrap";
   @import "font-awesome";
   ```

7. 아까 연 home-page-1 의 헤더 부분만 복사하기

8. view에 shared 폴더 만들기

9. 그안에 _nav.html.erb 파일을 만들고 아까 복사한것 붙여주기

10. views -> layout -> application.html.erb 

   ```html
   <!-- 아까 만든것 추가하기 -->
   <%= render 'shared/nav'%>
   <%= yield %>
   ```

11. 이번에는 Footer 부분을 home-page-1 에서 복사하기

12. view에 _footer.html.erb 파일 만들고 붙여 넣기

13. views -> layout -> application.html.erb 

    ```html
    <!-- 여기에 추가하기~ -->
    <%= render 'shared/nav'%>
    <%= render 'shared/footer'%>
    <%= yield %>
    ```

14. home-page-1에서 Category 복사

15. views -> home -> index.html.erb 에 내용 모두 지우고 붙여넣기 하기

16. 복붙하기~~~

    - 아래의 경로에 있는 파일들을 내 프로젝트로 복붙하기. 파일만~~~
    - 복사 파일 경로 : C:\Users\student\Desktop\Unify-v2.4\Unify-v2.4\html\assets\vendor 에서 찾아
    - 붙여넣는 파일 경로 : C:\Users\student\project\bs_template\vendor\assets\stylesheets

    ```html
        <link rel="stylesheet" href="../../assets/vendor/icon-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="../../assets/vendor/icon-line/css/simple-line-icons.css">
        <link rel="stylesheet" href="../../assets/vendor/icon-line-pro/style.css">
        <link rel="stylesheet" href="../../assets/vendor/icon-hs/style.css">
        <link rel="stylesheet" href="../../assets/vendor/animate.css">
        <link rel="stylesheet" href="../../assets/vendor/hs-megamenu/src/hs.megamenu.css">
        <link rel="stylesheet" href="../../assets/vendor/hamburgers/hamburgers.min.css">
        <link rel="stylesheet" href="../../assets/vendor/chosen/chosen.css">
        <link rel="stylesheet" href="../../assets/vendor/slick-carousel/slick/slick.css">
        <link rel="stylesheet" href="../../assets/vendor/fancybox/jquery.fancybox.min.css">

    <!-- CSS Unify Theme -->
    <!-- C:\Users\student\Desktop\Unify-v2.4\Unify-v2.4\html\multipage\real-estate\assets\css -->
        <link rel="stylesheet" href="assets/css/styles.multipage-real-estate.css">
    ```

17. stylesheets에 위에서 복사한 파일 명들을 적어주기

    ```scss
    @import 'icon-line-pro/style';
    @import 'icon-hs/style';
    @import 'animate';
    @import 'hs.megamenu';
    @import 'hamburgers';
    @import 'chosen';
    @import 'slick';
    @import 'jquery.fancybox';
    @import 'styles.multipage-real-estate';
    ```

18. public에 fonts 폴더 만들기

    경로 : C:\Users\student\project\bs_template\public\font

    복붙할 파일 : communication-48-x-48, finance, real-estate 

19. vender에서 마우스 오른쪽 -> search in directory 에서 finance 검색 위에 있는거 누르기

    고치기

    (communication, hs-icons 도 똑같이하기)

    ```css
    /* Finance */
    @font-face {
    	font-family: "finance";
    	src:font_url("finance/finance.eot");
    	src:font_url("finance/finance.eot?#iefix") format("embedded-opentype"),
    	font_url("finance/finance.woff") format("woff"),
    	font_url("finance/finance.ttf") format("truetype"),
    	font_url("finance/finance.svg#finance") format("svg");
    	font-weight: normal;
    	font-style: normal;
    }
    ```

20. rake assets:clobber : precompile 지워 버리는 것

21. gemfile 추가 `gem 'jquery-migrate-rails'`

    app -> assets -> javascripts -> application 에 `//= require jquery-migrate-min`추가하기

22. Java Script 파일도 적용해준다. (app->assets->javascripts->application, stylesheets->application 두 곳에 적용하기)

    ```html
        <!-- JS Implementing Plugins -->
        <script src="../../assets/vendor/hs-megamenu/src/hs.megamenu.js"></script>
        <script src="../../assets/vendor/jquery-ui/ui/widget.js"></script>
        <script src="../../assets/vendor/jquery-ui/ui/widgets/menu.js"></script>
        <script src="../../assets/vendor/jquery-ui/ui/widgets/mouse.js"></script>
        <script src="../../assets/vendor/jquery-ui/ui/widgets/slider.js"></script>
        <script src="../../assets/vendor/chosen/chosen.jquery.js"></script>
        <script src="../../assets/vendor/slick-carousel/slick/slick.js"></script>
        <script src="../../assets/vendor/fancybox/jquery.fancybox.min.js"></script>

        <!-- JS Unify -->
        <script src="../../assets/js/hs.core.js"></script>
        <script src="../../assets/js/components/hs.header.js"></script>
        <script src="../../assets/js/helpers/hs.hamburgers.js"></script>
        <script src="../../assets/js/components/hs.dropdown.js"></script>
        <script src="../../assets/js/components/hs.slider.js"></script>
        <script src="../../assets/js/components/hs.select.js"></script>
        <script src="../../assets/js/components/hs.carousel.js"></script>
        <script src="../../assets/js/components/hs.popup.js"></script>
        <script src="../../assets/js/components/hs.go-to.js"></script>
    ```

    ​

23.  rake assets:precompile : 파일들을 하나로 합친다.