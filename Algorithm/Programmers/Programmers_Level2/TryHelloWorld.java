package Programmers_Level2;

class TryHelloWorld
{
    public String getDayName(int a, int b)
    {
        String answer = " ";
        String day[] ={"THU", "FRI","SAT","SUN", "MON", "TUE", "WED"};
        int date[] = {0, 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int sumDate = 0;
        
        for(int i = 1; i<=a; i++){
        	sumDate += date[i];
        }
        
        sumDate += b;
        
        answer = day[sumDate%7];
        
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int a=1, b=1;
        System.out.println(test.getDayName(a,b));
    }
}