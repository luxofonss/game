import java.util.ArrayList;

public class TrongTai {
    public ArrayList<Player> p = new ArrayList<Player>();
    private String name;
    public TrongTai(String name) {
        this.name=name;
    }

    int randomIndex = (int)Math.floor(Math.random()*10)%4 - 1;
    int idd = randomIndex;
    public Player nextPlayer() {
        if (idd == 3)
            idd = 0;
        else
            idd = idd+1;
        System.out.println(p.get(idd).getName() + p.get(idd).getPoint());
        return p.get(idd);
    }
    boolean isEnd = false;
    public void getPoint(Player player) {
        sucsac ss = new sucsac();

        int point = ss.gieo();
        System.out.println("point = " + point);
        int currPoint = player.getPoint();
        if(currPoint + point == 21) {
            isEnd = true;
            player.setPoint(currPoint + point);
            System.out.println(player.getName() + player.getPoint());
            getWinner();
        }
        else if(currPoint + point > 21) {
            player.setPoint(0);
        }
        else {
            player.setPoint(currPoint + point);
        }
    }

    public void getWinner() {
        System.out.println("WINNER");
    }
}
