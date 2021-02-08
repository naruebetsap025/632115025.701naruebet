package week9;


public class Testoverride1 {

    public static void main(String[] args) {
        Person person1;
        Person person2;
        Person person3;
        Person person4;
        Person person5;
        Person person6;

        person1 = new Person("Mark", 2001);
        person1.introduce();
        
        person2 = new Sheriff("Mateo", 1988, "Californai");
        person2.introduce();
    
        person3 = new Teacher("Ball", 1977, "CMU");
        person3.introduce();

        person4 = new PM("Tu", 1954, "Thailand");
        person4.introduce();

        person5 = new football("Messi", 1987, "Barcelona football club");
        person5.introduce();

        person6 = new Student("Mike", 2002, "CMU");
        person6.introduce();

    }
}
