public class VehicleAndPlane extends Planes implements Vehicle {
    String modelName;

    //Plane methods
    @Override
    public void planeModel(String mname) {
        modelName = mname;
        System.out.println("The plane model is : "+modelName);
    }
    @Override
    public void planeMaxSpeed(float maxSpeed) {
        System.out.println(modelName+ " max speed is : "+maxSpeed+ "Kp/h");
    }
    @Override
    public void planeRegNo(int rNo) {

    }

    //Vehicle Methods
    @Override
    public void maxSpeed(float maxSpeed) {

    }
    @Override
    public void Colour(String colour) {

    }
}
