package Example4;

public class Test {
    public static void main(String[] args) {
        Circle c1= new Circle(5);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Circle c2 = new ResizableCircle(4);
        System.out.println(c2);
        ResizableCircle c3 = (ResizableCircle) c2;
        System.out.println(c3);
        c3.resize(10);
        System.out.println(c3);
    }
}
