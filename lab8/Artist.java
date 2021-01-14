package lab8;

public class Artist extends Person {
    String genre;
            public Artist(String name, int age,String gender){
                this.age = age;
                this.name = name;
                this.gender = gender;
            }
            public void playMusic(){
                System.out.println(name+" is playing "+genre+" music.");
            }
            public void doctor(){
                System.out.println(name+" is working a "+genre);
            }
            public void chef(){
                System.out.println(name+" is working a "+genre);
            }
            public void photographer(){
                System.out.println(name+" is working a "+genre);
            }
            public void bartender(){
                System.out.println(name+" is working a "+genre);
            }
            public void freeLancer(){
                System.out.println(name+" is working a "+genre);
            }
}
