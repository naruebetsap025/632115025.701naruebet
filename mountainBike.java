import java.util.Currency;

public class mountainBike {
    private int currentSpeed = 10;
    private int speed;
    public void newSpeed(int newSpeed,int gear){
        speed = currentSpeed+(gear*newSpeed);
        System.out.println("The new speed is "+speed);
    }
        public static void main(String[] args) {
            mountainBike bike = new mountainBike();
            bike.newSpeed(5, 2);
        }

}
