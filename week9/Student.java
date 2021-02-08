package week9;

public class Student {
   private String  fname  = " hello " ;
   private String  Lname= " world " ;

   public String toString(){
       return "my frist name "+ fname + " last name "+ Lname ;
   }

   public static  void  main (String[]args) {
       Student p= new Student();
       System.out.println(p.toString());     
   }
}
