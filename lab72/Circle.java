package lab72;

public class Circle {
    private double area;
    private double circumferrence;
    private double radius;
    private double a;
    private double b;

        public Circle (double newRadius,double x, double y){
            radius = newRadius;
            a=x;
            b=y;
        }
        public void Area(int cir) {
                if (radius<0){
                    System.out.println("Area of cir"+cir+ " = "+0);
                }else{
                    this.area = Math.PI*(radius*radius);
                    System.out.println("Area of cir"+cir+ " = "+area);
                }
        }
        public void Circumferrence(int cum){
                if(radius<0){
                    System.out.println("Circumferrence of Cir"+cum+ " = "+0);
                }else{
                    this.circumferrence = Math.PI*2*radius;
                    System.out.println("Circumferrence of Cir"+cum+ " = "+circumferrence);
                }
        }
        public static boolean intersec(Circle cir1,Circle cir2){
            double dist = 0;
            dist = (cir1.a-cir2.a)*(cir1.a-cir2.a)+(cir1.b-cir2.b)*(cir1.b-cir2.b);

            double radsum = 0;
            radsum = (cir1.radius+cir2.radius)*(cir1.radius+cir2.radius);

            if (dist>radsum){
                return false;
            }else{
                return true;
            }
        }
        
}
