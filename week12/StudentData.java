package week12;

public class StudentData {
    public static void main(String[] args) {
        Student std01 = new Student("Mark",18,4.00);
        Student std02 = new Student("Jane",18,2.20);
        Student std03 = new Student("Peter",19,4.00);
        Student std04 = new Student("Mark",22,1.75);

        System.out.println("The result of the name : ");
        System.out.println(std01.equals(std02));
        System.out.println(std01.equals(std03));
        System.out.println(std02.equals(std04));
        System.out.println(std01.equals(std04));

        System.out.println("The result of age : ");
        System.out.println(std01.equals1(std02));
        System.out.println(std03.equals1(std04));
        System.out.println(std01.equals1(std03));
        
        System.out.println("The result of gpa : ");
        System.out.println(std01.equals2(std03));
        System.out.println(std02.equals2(std04));
        System.out.println(std02.equals2(std03));
    }
}
