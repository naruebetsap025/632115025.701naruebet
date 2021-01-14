package lab8;

public class InheritanceExample {
    public static void main(String[] args) {
        
    
    Artist art = new Artist("Ball", 20,"Male");

    art.genre = "hip hop";
    art.introduce();
    art.playMusic();
    System.out.println(" ");
    Artist art1 = new Artist("Mike", 19,"Male");

    art1.genre = "Doctor";
    art1.introduce();
    art1.doctor();
    System.out.println(" ");
    Artist art2 = new Artist("Plai", 19,"Male");

    art2.genre = "Chef";
    art2.introduce();
    art2.chef();
    System.out.println(" ");
    Artist art3 = new Artist("North", 19,"Male");

    art3.genre = "Freelancer";
    art3.introduce();
    art3.freeLancer();
    System.out.println(" ");
    Artist art4 = new Artist("Owen", 19,"Male");

    art4.genre = "Bartender";
    art4.introduce();
    art4.bartender();
    System.out.println(" ");    
    Artist art5 = new Artist("PP", 19,"Male");

    art5.genre = "Photographer";
    art5.introduce();
    art5.photographer();
    System.out.println(" ");
    }
}