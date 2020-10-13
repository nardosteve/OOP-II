    //Demonstrate method pverrding and method overloading
    //Class sedan with methods
     class Sedan{
        //Variable declaration
        int Finalspeed;
        int Initialspeed;

        //Method Overriding
        public void accelerate(int FinalSpeed, int InitialSpeed){

            System.out.println(FinalSpeed - InitialSpeed);
        }

        //Method Overloading 1
        static int accelerateTwo(int initialSpeed, int FinalSpeed){
            return FinalSpeed - initialSpeed;
        }
        //Method Overloading 2
        static int accelerateTwo(int initialSpeed, int FinalSpeed, int ThinkingTime){
            return FinalSpeed - initialSpeed + ThinkingTime;
        }
    }
    //End of class sedan

    //Subclass with method overloading
    class Car extends Sedan{

        //Method overriding
        //(Accelerate Method) in Sublclass overrides (Accelerate method) in Superclass
        public void accelerate(int FinalSpeed, int InitialSpeed){

            System.out.println(FinalSpeed - InitialSpeed);
        }
    }

    //Main class
    public class MainMethod {

        //Main method
        public static void main(String[] args){

            //Creating objects
           Car car = new Car();

           //Original Method overriding
            System.out.print("Increase in speed : ");
            car.accelerate(112, 15);

           //Method overriding
            System.out.print("The Final speed is : ");
            car.accelerate(100, 30);

           //Method overloading
            System.out.println("Final Speed - Initial Speed : "+car.accelerateTwo(15, 105));
            System.out.println("Final Speed - Initial Speed + Thinking Time : "+car.accelerateTwo(15,100,30));
        }
    }
