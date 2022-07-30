public class Bot extends Player {

    private int id;
    public Bot(int id, String name, String message) {
        super(id, name);
        this.id = id;
        this.message = message;
    }

    private String message;

    public void lose() {
        System.out.println(message);
    }
}
