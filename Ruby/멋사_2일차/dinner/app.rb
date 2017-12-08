require 'sinatra'

get '/' do
  # "Welcome to dinner app"
  # "
  # !DOCTYPE
  # <html>
  #   <head>
  #     <title>Dinner App</title>
  #   </head>
  #   <body>
  #     <h1>This is Dinner App</h1>
  #     <p>Dinner Recommendation</p>
  #     <a href='/me'>About me</a>
  #   </body>
  # </html>
  # "

  send_file 'home.html'

end


get '/dinner' do
  #점심추천 로직
  # 1. 배열 만들어 메뉴 넣고
  # 2. 랜덤으로 하나 뽑아 출력

  menu = ["참치회", "성게알밥", "스테이크"]
  @choice = menu.sample

  # 해시로 만들기 key와 value로 이루어짐
  # 각 문장 끝에는 쉽표를 써주기
  @url ={
    "참치회" => "http://image.chosun.com/sitedata/image/201503/16/2015031602655_3.jpg",
    "성게알밥" => "http://cfile230.uf.daum.net/image/115585504D9183A534DE91",
    "스테이크" => "http://9tschool.net/xe/files/attach/images/235047/912/238/00a614c7f40dc1c0dc682cc0976126a2.jpg"
  }

  # 해시값 가져오는 방법
  # url["참치회"]
  # url["성게알밥"]
  # url["스테이크"]

  # "<p>#{choice}</p>
  # <img src=#{url[choice]}>
  # "

  erb :Dinner

  # url = ""
  # if choice =="참치회"
  #   url = 'http://image.chosun.com/sitedata/image/201503/16/2015031602655_3.jpg'
  #
  # elsif choice =="성게알밥"
  #   url = 'http://cfile230.uf.daum.net/image/115585504D9183A534DE91'
  #
  # elsif choice =="스테이크"
  #   url = 'http://9tschool.net/xe/files/attach/images/235047/912/238/00a614c7f40dc1c0dc682cc0976126a2.jpg'
  # end

  # "<p>#{choice}</p>
  # <img src=#{url}>
  #"

end

get '/me' do
  # "
  # <html>
  #   <head>
  #     <title>Dinner App</title>
  #   </head>
  #   <body>
  #     <h1>My name is DongKeun</h1>
  #     <p>I am DongKeun</p>
  #   </body>
  # </html>
  # "

  send_file 'me.html'
  # 위와 같은 문법
  # send_file('me.html')

end
