package lab72;

public class CircleAC {
    public static void main(String[] args) {
        Circle cir1 = new Circle(2.0,0.0,0.0);
        cir1.Area(1);
        cir1.Circumferrence(1);

        Circle cir2 = new Circle(3.0,1.0,2.0);
        cir2.Area(2);
        cir2.Circumferrence(2);

        Circle cir3 = new Circle(1.0,3.0,5.0);
        cir3.Area(3);
        cir3.Circumferrence(3);

        Circle cir4 = new Circle(-1.0,-1.0,-10.0);
        cir4.Area(4);
        cir4.Circumferrence(4);

        System.out.println(Circle.intersec(cir1, cir2));
        System.out.println(Circle.intersec(cir1, cir3));
    }
}
