//Class Sportscar
public class SportsCar extends Vehicle implements Automobile {

    //....1
    @Override
    public void CarSpeed(int speed) {
        System.out.println("Bugatti's Speed : "+speed);
    }
    @Override
    public void CarColour(String colour) {
        System.out.println("Bugatti colour is : "+colour);
    }
    @Override
    public void CarMax(int maxSpeed) {
        System.out.println("Bugatii Maximum speed is : "+maxSpeed);
    }

    //....1

    //....2
    @Override
    public void accelerate(int acc) {
        System.out.println("Bugatti Acceleration is : "+acc);
    }
    @Override
    public void stop(String stp) {
        System.out.println("Bugatti Stopping force is : "+stp);
    }
    @Override
    public void gas(float gallons) {
        System.out.println("Bugatti fuel consumption per Kilometre(Km) is : " +gallons);
    }
    //....2
}
