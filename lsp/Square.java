package lsp;

public class Square implements Shape {

    private int side;

    Square() {
    }

    Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
