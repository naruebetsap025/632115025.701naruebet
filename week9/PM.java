package week9;

class PM extends Person{
    String workState;
    public PM(String name, int bornYear,String workState){
        super(name,bornYear);
        this.workState = workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a prime minister and work in "+workState+".");
    }
    
}
