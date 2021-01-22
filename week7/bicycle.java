package week7;

public class bicycle {
    private int currentSpeed=10;
    private int speed;
        public void speedUp(int newSpeed){
            if(newSpeed<100){
            speed = currentSpeed+newSpeed;
            System.out.println("The new speed is "+speed);
            System.out.println(" ");
            }else{
                System.out.println("Put new speed !!");
            }
        }
        public void speedDown(int newSpeed){
            if(newSpeed<100){
            speed = currentSpeed-newSpeed;
            System.out.println("The new speed is "+speed);
            System.out.println(" ");
            }else{
                System.out.println("Put new speed !!");
            }
        }
        public static void main(String[] args) {
            bicycle Bike = new bicycle();
            Bike.speedUp(5);
            Bike.speedDown(5);
        }
        
}
