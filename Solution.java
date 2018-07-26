import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String A = "A586QK";
        String B = "JJ653K";
        solution(A, B);
    }

    private static int  solution(String A, String B) {
        // write your code in Java SE 8
        int winnings = 0;
        String[] cards = {"2","3","4","5", "6", "7", "8", "T", "J", "Q", "K", "A"};

        String[] player1 = A.split("");
        String[] player2 = B.split("");

        stringContainsCorrectValues(A, cards);
        stringContainsCorrectValues(B, cards);

        for(int i = 0;i<A.length();i++){
            String a = player1[i];
            String b = player2[i];
            int cardValue = 0;
            int cardValue2 = 0;
            if(a.equals("2")){
                cardValue = 1;
            }
            if(a.equals("3")){
                cardValue = 2;
            }
            if(a.equals("4")) {
                cardValue = 3;
            }
            if(a.equals("5")){
                cardValue = 4;
            }
            if(a.equals("6")){
                cardValue = 5;
            }
            if(a.equals("7")){
                cardValue = 6;
            }
            if(a.equals("8")){
                cardValue = 7;
            }
            if(a.equals("9")){
                cardValue = 8;
            }
            if(a.equals("J")){
                cardValue = 9;
            }
            if(a.equals("Q")){
                cardValue = 10;
            }
            if(a.equals("K")){
                cardValue = 11;
            }
            if(a.equals("A")){
                cardValue = 12;
            }
            if(b.equals("2")){
                cardValue2 = 1;
            }
            if(b.equals("3")){
                cardValue2 = 2;
            }
            if(b.equals("4")){
                cardValue2 = 3;
            }
            if(b.equals("5")){
                cardValue2 = 4;
            }
            if(b.equals("6")){
                cardValue2 = 5;
            }
            if(b.equals("7")){
                cardValue2 = 6;
            }
            if(b.equals("8")){
                cardValue2 = 7;
            }
            if(b.equals("9")){
                cardValue2 = 8;
            }
            if(b.equals("J")){
                cardValue2 = 9;
            }
            if(b.equals("Q")){
                cardValue2 = 10;
            }
            if(b.equals("K")){
                cardValue = 11;
            }
            if(b.equals("A")){
                cardValue2 = 12;
            }
            int compare = Integer.compare(cardValue,cardValue2);
            if(compare==1){
                winnings++;
            }
        }
        System.out.println(winnings);
        return winnings;
    }
    private static void stringContainsCorrectValues(String playerCards, String[] cards){
        System.out.println(Arrays.stream(cards).parallel().anyMatch(playerCards::contains));
    }
}