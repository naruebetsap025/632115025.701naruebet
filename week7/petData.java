package week7;
public class petData {
    public static void main(String[] args) {
        PET dog = new PET();
        dog.Dog();
        dog.petData("Bizzy", "Pooddle", "Pink", 3);
        dog.run("Bizzy");
        dog.dogSize("small");
        dog.hair("Short");
        
        PET fish = new PET();
        fish.Fish();
        fish.petData("Job", "KingFish", "Blue", 14);
        fish.swim("Big");
        fish.water("swater");

        PET bird = new PET();
        bird.Bird();
        bird.petData("JoJo", "Northern Cardinal", "Redpink", 10);
        bird.flying("small");
        bird.fly("can");
    }
}
