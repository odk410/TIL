Dir.chdir('src')

puts Dir.pwd

#entries는 Dir에 있는 파일들을 배열로 만들어 우리에게 보여준다.
#Dir.entries('C:/Users/student/project/src')와 같은 의미
list = Dir.entries(Dir.pwd).reject {|name| name[0] == "."}

# 배열의 개수가 출력된다.
# puts list.length
# puts list.class


# 먼저 1개의 파일이름만 바꿔보기
# File.rename("원래파일명", "바꿀 파일명")
# File.rename("1 test.txt", "sap_1 test.txt")


# 20번 반복하면서 바꾸기
# 20.times do |n|
#   File.rename("#{n+1} test.txt","sap#{n+1}list.txt")
# end


# Array를 사용할때는 하나하나 돌리는게 좋다. each를 사용해서
# each를 사용하면 .과 .. 이 나오기 때문에 이것을 제외해주어야한다.
# list = Dir.entries(Dir.pwd).reject {|name| name[0] == "."}
# reject를 사용해 이름의 첫번째 자리가 .인 경우를 제외한다.
# 때문에 .으로 시작하는 . 과 .. 은 제외된다.
list.each do |f|
  File.rename(f, "2017" + f)
end
