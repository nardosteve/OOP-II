abstract class Vehicle {

    //Creating empty abstract methods with no bodies
    public abstract void accelerate(int acc);
    public abstract void stop(String stp);
    public abstract void gas(float gallons);

    //Methods to Override
    public void MaxSpeed(){
        System.out.println(" Maximum Speed is 100Kp/h");
    }
    public void MinSpeed(){
        System.out.println("Minimum Speed is 10Kp/h");
    }
    public void BrakingDistance(){
        System.out.println("Breaking Distance is 40 metres(m)");
    }
    //Methods to Override

    //Method overloading
    public void accelerate(double SpeedIncrease){
        System.out.println(SpeedIncrease);
    }
    //Methods to overload
    public void accelerate(float finalSpeed, int initialSpeed){
        System.out.println(finalSpeed - initialSpeed);
    }
    //Methods to overload
    public void accelerate(int time, float speed, double distance){
        System.out.println(distance * time + speed);
    }
}

//Driver Class With Methods and bodies
class Driver extends Vehicle{

    //Methods
    @Override
    public void accelerate(int acc) {
        System.out.println("The Driver is accelerating at "+acc+ " kp/h");
    }
    @Override
    public void stop(String stp) {
        System.out.println("The Driver has stopped with a force of "+stp);
    }
    @Override
    public void gas(float gallons) {
        System.out.println("The fuel per Km is "+gallons+ " Litres");
    }

    //set driver name and set driver age
    public void Name(String name){
        System.out.println(name);
    }
    public void age(int age){
        System.out.println(age);
    }
}