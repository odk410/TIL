require 'sinatra'
require 'httparty'
require 'nokogiri'
require 'uri'
require 'csv'
require 'date'

get '/' do
  erb :index
end

get '/search' do

  @id =params["id"]

  #한글 검색을 위해 encode해준다. 반대는 decode
  @encoded = URI.encode(@id)
  response = HTTParty.get("http://www.op.gg/summoner/userName=#{@encoded}")

  html = Nokogiri::HTML(response.body)
  @win = html.css('#SummonerLayoutContent > div.tabItem.Content.SummonerLayoutContent.summonerLayout-summary > div.SideContent > div.TierBox.Box > div.SummonerRatingMedium > div.TierRankInfo > div.TierInfo > span.WinLose > span.wins')
  @lose = html.css('#SummonerLayoutContent > div.tabItem.Content.SummonerLayoutContent.summonerLayout-summary > div.SideContent > div.TierBox.Box > div.SummonerRatingMedium > div.TierRankInfo > div.TierInfo > span.WinLose > span.losses')
  @tier = html.css('#SummonerLayoutContent > div.tabItem.Content.SummonerLayoutContent.summonerLayout-summary > div.SideContent > div.TierBox.Box > div.SummonerRatingMedium > div.TierRankInfo > div.TierRank > span')

  # 로그 기록하기
  # 내용 : 아이디, 승, 패, 티어
  # a+ : 읽기/쓰기 이며 추가모드, 파일이 없으면 생성한다.
  File.open("log.txt", "a+") do |f|
    f.write("#{@id} #{@tier.text} #{@win.text} #{@lose.text}\n")
  end

  # CSV는 엑셀로 파일이 열린다.
  CSV.open("log.csv", "a+") do |csv|
    csv << [@id, @tier.text, @win.text, @lose.text, Time.now.to_s]
  end

  erb :search

end
