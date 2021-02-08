package week9;

class football extends Person  {
    String workState;
    public football(String name, int bornYear,String workState){
        super(name,bornYear);
        this.workState = workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a footballplayer and work in "+workState);
    }
}
