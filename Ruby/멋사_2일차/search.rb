require 'launchy'

url = "http://www.naver.com"
search = "https://search.naver.com/search.naver?query="
keywords = ["kospi", "kosdaq", "nasdaq", "bitcoin"]

#Launchy.open(url)
#Launchy.open(search + keyword)

keywords.each do |key|
	Launchy.open(search + key)
end

