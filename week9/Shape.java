package week9;
public class Shape {
       public String Rectangle(double width , double height ){
             return " this is a rectangle with as "+ width + " and  height as "+ height ;
         
      }

       public String Cube(Double length){
          return " this is a  cube with the side of "+ length ;

       }

     public  String toString(){
       return  "this is a shape ";
       }
     public static void main (String[]args) {
            Shape  shape = new  Shape();
             Shape  shape2 = new  Shape();
             Shape  shape3 = new  Shape();

              System.out.println(shape);
              System.out.println(shape2.Rectangle(2.4, 25.2));
              System.out.println(shape3.Cube(1.5));
     }














}