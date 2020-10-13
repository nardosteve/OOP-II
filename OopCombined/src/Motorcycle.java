public class Motorcycle extends Vehicle {
    @Override
    public void accelerate(int acc) {
        System.out.println("Acceleration is : " + acc);
    }

    @Override
    public void stop(String stp) {
        System.out.println("Stopping distance is : " + stp);
    }

    @Override
    public void gas(float gallons) {
        System.out.println("Fuel per Gallon is : " +gallons);
    }

//    public void MaxSpeed(int Max){
//        System.out.println("The Motorcycle's Maximum Speed is : "+Max);
//    }
//    public void MinSpeed(int Min){
//        System.out.println("The Motorcycle's Minimum Speed is : "+Min);
//    }
//    public void BrakingDistance(float Distance){
//        System.out.println("The Motorcycle's Breaking Distance is : "+Distance);
//    }
}
