public class Triangle extends Figure implements Drawable{

    private int a, b, c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int calculatePerimeter() {
        return  a + b + c;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDD3B");
    }
}



