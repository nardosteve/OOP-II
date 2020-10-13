
public class MainMethod {
    //Main Method
    public static void main(String[] args){

        //Creating Objects
        Driver nardosteve = new Driver();
        Bus scania = new Bus();
        Motorcycle suzuki = new Motorcycle();
        Sedan sedan = new Sedan();
        SportsCar Buggati = new SportsCar();
        //Creating Objects

        //Using object name to access and call methods with their bodies
        //Vehicle(Driver) Class
        System.out.print("Driver Name : ");
        nardosteve.Name("Nardosteve");
        System.out.print("Driver age : ");
        nardosteve.age(19);
        nardosteve.accelerate(10);
        nardosteve.gas(12);
        nardosteve.stop("Fifty Newtons");
        //Driver Class

        //Creating space
        System.out.println();
        //Creating space

        //Bus Class
        scania.accelerate(200);
        scania.stop("100 metres");
        scania.gas(70.0f);
        //Bus Class

        //Creating space
        System.out.println();
        //Creating space

        //Motorcycle Class
        suzuki.accelerate(120);
        suzuki.stop("90 metres");
        suzuki.gas(2);

        //Creating space
        System.out.println();
        //Creating space

        //Sedan Class
        sedan.accelerate(12);
        sedan.CarColour("Blue");
        sedan.CarMax(130);
        sedan.CarSpeed(90);
        sedan.gas(12);
        sedan.stop("Twenty");
        //Sedan CLass

        //Creating space
        System.out.println();
        //Creating space

        //Bugatti class
        Buggati.accelerate(150);
        Buggati.CarColour("Jungle Green");
        Buggati.CarMax(480);
        Buggati.CarSpeed(290);
        Buggati.gas(40);
        Buggati.stop("sixty");

        //using method overloading on the methos accelerate()
        nardosteve.accelerate(12);
        nardosteve.accelerate(150, 23);
        nardosteve.accelerate(60,150,100);




    }
}