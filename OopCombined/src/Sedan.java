//Sedan Class
public class Sedan extends Vehicle implements Automobile{

    //....1
    @Override
    public void CarSpeed(int speed) {
        System.out.println("The Sedan Car speed is : "+speed);
    }
    @Override
    public void CarColour(String colour) {
        System.out.println("Sedan Car colour is : "+colour);
    }
    @Override
    public void CarMax(int maxSpeed) {
        System.out.println("The Maximum Speed of Sedan is : "+maxSpeed);
    }
    //....1

    //....2
    @Override
    public void accelerate(int acc) {
        System.out.println("Sedan Acceleration is : "+acc);
    }
    @Override
    public void stop(String stp) {
        System.out.println("The stopping force of the Sedan is : "+stp);
    }
    @Override
    public void gas(float gallons) {
        System.out.println("Sedan fuel consumption per Kilometre(Km) is : "+gallons);
    }
    //....2
}
