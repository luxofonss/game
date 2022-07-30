public class Player {
    private String name;

    private int id;
    private int point;
    public Player(int id, String name) {
        this.id = id;
        this.point = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
