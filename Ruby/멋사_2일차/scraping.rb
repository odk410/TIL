require 'httparty'
require 'nokogiri'

url = "http://finance.naver.com/sise/"
url2 = "http://comic.naver.com/index.nhn"

# html소스를 response에 담는다.
response = HTTParty.get(url)
response = HTTParty.get(url2)

html = Nokogiri::HTML(response.body)
html2 = Nokogiri::HTML(response.body)

#CSS SELECTER
kospi = html.css('#KOSPI_now')

#웹툰 Selecter
ranking = html.css('#realTimeRankFavorite > li.rank01 > a')

#코스피 지수만 보고 싶을때 뒤에 .text 붙이기
puts kospi.text

#웹툰 랭킹 보기
puts ranking.text