package collection.compare.test;

import java.util.Map;

public class CardGameMain {
    /*
    "\u2660" : 스페이드(♠)
    "\u2665" : 하트(♥)
    "\u2666" : 다이아몬드(䡫)
    "\u2663" : 클로버(♣)
     */

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        Player winner = getWinner(player1, player2); {
            if (winner != null) {
                System.out.println(winner.getName() + " 승리!");
            } else {
                System.out.println("무승부");
            }
        }

    }

    public static Player getWinner(Player player1, Player player2) {
        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if (sum1 > sum2) {
            return player1;
        } else if (sum1 < sum2) {
            return player2;
        } else {
            return null;
        }
    }
}
