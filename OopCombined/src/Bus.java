public class Bus extends Driver {

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
}
