public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle("круг", 12 );
        Triangle triangle = new Triangle( "треугольник", 2,3, 4);
        Square square = new Square("квадрат", 5);
        Rectangle rectangle = new Rectangle("прямоугольник", 5, 6);

        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Bars");

        Drawable [] drawables = {circle, triangle, square, rectangle, dog, cat};

        for (int i = 0; i < drawables.length ; i++) {
            drawables[i].draw();

            if (drawables[i] instanceof Figure){
                System.out.println(((Figure) drawables[i]).getName() + " периметр =>" + ((Figure) drawables[i]).calculatePerimeter());
            }
            if ( drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }


            
        }
    }
}