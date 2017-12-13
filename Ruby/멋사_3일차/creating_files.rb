#파일 만들기
# File.open("test.txt", "w") do |f|
#   f.write("Hack your life")
# end



# 반복문에서 |n|의 값을 설정 안해주면 0부터 시작한다.
#5.times do |n|
#  puts n
#end

#5.times do |n|
#  puts (n+1).to_s + "list"
#end

# .txt 20개를 만든다.
# 파일명 : 몇 번째 파일 + list
# 값 뒤에 .class를 붙이면 그 값의 데이터 타입을 알 수 있다.

# 20.times do |n|
#   File.open((n+1).to_s+"test.txt", "w") do |f|
#     f.write((n+1).to_s+"번째 파일입니다.")
#   end
# end


# concatenation : String을 합체  " " + " "
# interpolation : 인터폴 (수술?) "#{}" 원래 있던 것에 무언가를 집어 넣음
# age = 26
# puts "내 나이는 " + age.to_s
# puts "내 나이는 #{age.to_s}"


#interpolation으로 만들어 보기
# 20.times do |n|
#   File.open("#{n+1} test.txt", "w") do |f|
#     f.write("#{n+1}번째 파일입니다.")
#   end
# end

#파일 경로 바꾸기
puts Dir.pwd

Dir.chdir('src')
 20.times do |n|
   File.open("#{n+1} test.txt", "w") do |f|
     f.write("#{n+1}번째 파일입니다.")
   end
 end
puts Dir.pwd
