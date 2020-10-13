    //Superclass(Vehicle)
     class vehicle{
        //Defining motorcycle methods
        public void Colour(){
            System.out.println("The Motorcycles colour is Black");
        }
        public void Speed(){
            System.out.println("The Motorcycles Speed is 100kp/h");
        }

        //Defining bus methods
        public void MaxSpeed(){
            System.out.println("The Maximum Speed of the Bus is 120kp/h");
        }
        public void SeaterNo(){
            System.out.println("The Seat No of the Bus is 70");
        }
    }

    //Creating Subclasses(Motorcycle and Bus)
    class MotorCycle extends vehicle{
    //Methods
        public void Colour(String c){
            System.out.println("The Motorcycle is : "+ c);
        }
        //Method
        public void Speed(float speed){
            System.out.println("The Motorcycle Speed is : " +speed + "Kp/h");
        }
    }

    class Bus extends vehicle{
    //Methods
        public void MaxSpeed(int max){
            System.out.println("The Maximum Speed of the Bus is : "+max+ "Kp/h");
        }
        //Methods
        public void SeaterNo(int seat){
            System.out.println("The seat No of the Bus is : "+seat);
        }
    }

    //Main Method
    public class MainMethod {
        //Main Method
        public static void main(String[] args){

            //Creating an object from the motorcycle class
            MotorCycle motorCycle = new MotorCycle();
            Bus bus = new Bus();
            //Objects

            //Accessing the objects with the Dot operator and the method name
            //ObjectName - MethodName
            motorCycle.Colour("Red");
            motorCycle.Speed(130.005f);
            //ObjectName - MethodName
            bus.MaxSpeed(150);
            bus.SeaterNo(90);
        }

        /*
        So we have created two subclasses that inherit from the super class using the (Extends) feature and for the methods (Bus and motorcycle) we have
        used to same method name for the subclass to override the details in the superclass method
         */
    }
