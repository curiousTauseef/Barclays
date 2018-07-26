import java.util.Arrays;

public class Solution2 {
    private static String[] cards = {"2","3","4","5", "6", "7", "8","J", "Q", "K", "A", "T"};

    public static void main(String[] args) {

        String A = "A586QK";
        String B = "JJ653K";
        if(stringContainsCorrectValues(A, cards)&&stringContainsCorrectValues(B,cards)){
            solution(A, B);
        }else System.out.println("Player cards are not correct");
    }

    private static int  solution(String A, String B) {

        int winnings = 0;

        String[] player1 = A.split("");
        String[] player2 = B.split("");
        int index =0 , index2 = 0;

        for(int i=0;i<A.length();i++){
            String a = player1[i];
            String b = player2[i];

            for(int j=0;j<cards.length;j++) {
                if (cards[j].equals(a)) {
                    index = j;
                }
                else if(cards[j].equals(b)){
                    index2 = j;
                }
            }
            int compare = Integer.compare(index, index2);
            if(compare==1) winnings++;
        }
        System.out.println(winnings);
        return winnings;
    }
    private static boolean stringContainsCorrectValues(String playerCards, String[] cards){
        boolean pass = false;
        String[] players = playerCards.split("");
        int count=0;
        for (String a : cards) {
            for (String b : players) {
                if (b.equals(a)) {
                    count++;
                }
            }
        }
        if(count == playerCards.length()){
            pass=true;
        }
        return pass;
    }
}
