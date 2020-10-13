//Interface
interface Sedan{
    public void sCarSpeed(int sp);
    public void sCarColour(String sc);
    public void sCarMax(int sm);
}
interface SportsCar{
    public void spCarSpeed(int s);
    public void spCarColour(String c);
    public void spCarMax(int m);
}
//Interface

class Interface implements Sedan, SportsCar{
    //Sedan Car methods
    @Override
    public void sCarSpeed(int sp) {
        System.out.println("Sedan Car speed is : "+sp);
    }
    @Override
    public void sCarColour(String sc) {
        System.out.println("Sedan Car colour is : "+sc);
    }
    @Override
    public void sCarMax(int sm) {
        System.out.println("Sedan Car MaxSpeed is : "+sm+ "\n");
    }
    //Sedan Car methods
    //Sports Car methods
    @Override
    public void spCarSpeed(int s) {
        System.out.println("Sports Car speed is : "+s);
    }
    @Override
    public void spCarColour(String c) {
        System.out.println("Sports Car colour is : " + c);
    }
    @Override
    public void spCarMax(int m) {
        System.out.println("Sports Car MaxSpeed is : "+m);
    }
    //Sports Car methods
}

public class Automobile{
    public static void main(String[] args){

        //Object
        Interface i = new Interface();

        //Passing Sedan arguments to paramteres
        i.sCarSpeed(100);
        i.sCarColour("Black");
        i.sCarMax(250);

        //Passing Sedan arguments to paramteres
        i.spCarSpeed(120);
        i.spCarColour("Red");
        i.spCarMax(450);

    }
}