package solid.lsp;

public class LSPDemo {
    static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", get " + r.getArea());
    }

    public static void main(String[] args) {
        RectangleFactory factory = new RectangleFactory();
        Rectangle rc = factory.newRectangle(2, 3);
        useIt(rc);

        Rectangle sq = factory.newSquare(10);
//        sq.setHeight(5);
        sq.setWidth(10);
        useIt(sq);
    }


}
