class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       int [] dayInMonth ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

        int start, together, end;
        start = Math.max(TotalDays(arriveAlice, dayInMonth), TotalDays(arriveBob, dayInMonth));
        end = Math.min(TotalDays(leaveAlice, dayInMonth), TotalDays(leaveBob, dayInMonth));

        together = end - start + 1;

        return Math.max(0, together);
    }

    public int TotalDays(String date, int [] dayInMonth){
        int month =Integer.parseInt(date.substring(0 , 2));
        int day= Integer.parseInt(date.substring(3 , 5));


        int total = day;

        for(int i =  0 ; i< month-1; i++){
            total += dayInMonth[i];
        }
        return total;
    }
}