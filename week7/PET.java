package week7;
public class PET {

    public void Dog() {
        System.out.println("My dog");
    }
    public void Fish() {
        System.out.println("My fish");
    }
    public void Bird() {
        System.out.println("My bird");
    }
    public void petData(String name, String species, String color, int age) {
        System.out.print("Name : "+name+" ");
        System.out.print("Species : "+species+" ");
        System.out.print("Color : "+color+" ");
        System.out.println("Age : "+age);
    }
    public void run(String name) {
        System.out.println("My dog "+name+" is run to the jungle");
    }
    public void swim(String size) {
        System.out.println("My fish size "+size+" swim so fast");
    }
    public void flying(String size){
        System.out.println("My bird "+size+" walk too slow");
    }
    public void dogSize(String size) {
        System.out.println(size+" bark Box Box!!");
    }
    public static boolean hair(String hair){
        if ("short".equalsIgnoreCase(hair)&&"Short".equalsIgnoreCase(hair)){
            System.out.println("Short hair : true");
            return true;
        }
        else{
            System.out.println("Short hair : flase");
            return false; 
        }
    }
    public static boolean water(String water){
        if("swater".equalsIgnoreCase(water)&&"Swater".equalsIgnoreCase(water)){
            System.out.println("Salt water : true");
            return true;
        }
        else{
            System.out.println("Salt water : false");
            return false;
        }
    }
    public static boolean fly(String fly){
        if("can".equalsIgnoreCase(fly)&&"Can".equalsIgnoreCase(fly)){
            System.out.println("Can fly : true");
            return true;
        }
        else{
            System.out.println("Can fly : false");
            return false;
        }
    }
    
}
