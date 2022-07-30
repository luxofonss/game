public class App {
    public static void main(String args[]) {
        Player player1 = new Player(1,"quyen");
        Player player2 = new Player(2,"alex");
        Player player3 = new Player(3,"john");
        Bot player4 = new Bot(4, "BOT", "BYE");
        TrongTai tt = new TrongTai("Hao");
        tt.p.add(player1);
        tt.p.add(player2);
        tt.p.add(player3);
        tt.p.add(player4);

        while(tt.isEnd == false) {
            tt.getPoint(tt.nextPlayer());
        }
    }
}
