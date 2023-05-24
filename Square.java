//Square in field (Model)

public class Square {

    private int i;
    private int j;
    private int num;

    public Square(int i, int j) {
        this.i = i;
        this.j = j;
        this.num = 0;
    }

    public void setValue(int num) {
        this.num = num;
    }

    public void clear() {
        this.num = 0;
    }

    public int getValue() {
        return this.num;
    }
}