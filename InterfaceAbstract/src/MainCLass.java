    //Automobile Interface
    interface Automobile{
        public void CarType(String ct);
        public void NoofCars(int no);
        public void Colour(String cr);
    }

    //Vehicle Abstract
    abstract class Vehicle{
        public abstract void Speed(int speed);
        public abstract void Driver(String dn);
        public abstract void AccidentsNo(int an);

    }

    //Subclasses(Implements the Interface Class "Automobile")
     class Sedan implements Automobile {

        @Override
        public void CarType(String ct) {
            System.out.println("Car Type : "+ct);
        }
        @Override
        public void NoofCars(int no) {
            System.out.println("Total Number of Cars : "+no);
        }
        @Override
        public void Colour(String cr) {
            System.out.println("Car colour : "+cr);
        }
    }
    //Subclasses(Implements the Interface Class "Automobile")
    //Subclasses(extends the Abstract Class "Vehicle")
    class SportsCar extends Vehicle{

        @Override
        public void Speed(int speed) {
            System.out.println("Top Speed : "+speed);
        }
        @Override
        public void Driver(String dn) {
            System.out.println("Driver Name : "+dn);
        }
        @Override
        public void AccidentsNo(int an) {
            System.out.println("No of Accidents : "+an +" Recorded");
        }
    }
    //Subclasses(extends the Abstract Class "Vehicle")


public class MainCLass {
    public static void main(String[] args){

        //Creating an Object of the classes(SportsCar(Abstract) ans SedanCar(Interface))
        Sedan sedan = new Sedan();
        SportsCar sportsCar = new SportsCar();

        //Accessing and passing arguments to the Sedan method
        sedan.CarType("Rolls Royce");
        sedan.Colour("Black");
        sedan.NoofCars(50);
        //Accessing and passing arguments to the Sedan method

        sportsCar.Driver("Jeremy Matayo");
        sportsCar.AccidentsNo(2);
        sportsCar.Speed(124);

    }
}
