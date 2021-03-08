package week12;

public class Student {
    double StudentA;
    double StudentG;
    String student;

    public Student(String name, int age, double gpa){
        this.student = name;
        this.StudentA = age;
        this.StudentG = gpa;
    }
    public String getName(){
        return student;
    }
    public double getAge(){
        return StudentA;
    }
    public double getGpa(){
        return StudentG;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        return this.getName() == ((Student) obj).getName();
    }
    public boolean equals1(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        return this.getAge() == ((Student) obj).getAge();
    }
    public boolean equals2(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        return this.getGpa() == ((Student) obj).getGpa();
    }
}
