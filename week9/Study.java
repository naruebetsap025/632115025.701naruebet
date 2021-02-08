package week9;

class Study extends Person{
    String workState;
    public Study(String name, int bornYear,String workState){
        super(name,bornYear);
        this.workState = workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a student and study in "+workState+".");
    }
}
