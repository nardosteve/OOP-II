public class ObjectsClassesMethods {

    //Main Method
    public static void main(String[] args){

        //Variables
        String name = "Nardosteve";
        char character = 'A';
        float MyNumb = 56.9565435f;
        boolean myBool = true;
        //End of variables

        //Loop
        int x = 0;
        while(x < 11){
            System.out.println("Numbers: "+x);
            x++;
        }
        //End of Loop

        // Cars Array
        String[] Cars = {"Nissan Juke", "Nissan Primera", "Range Rover", "Land Cruiser V8"};
        //System.out.println("Car Type:" +Cars[2]);
        //Looping Through Array
        for(int y = 0; y < Cars.length; y++){
            System.out.print("Cars: " +Cars[y]+ ", ");
            System.out.println();
        }
        //End of Cars Array

        //Creating Instance(Object) of Student Class
        Student stephen = new Student();

        //Initializing through reference
        stephen.name = "Stephen";
        stephen.age = 19;
        stephen.Gender = 'M';

        //Printing results
        System.out.println("Name : " + stephen.name);
        System.out.println("Age : " + stephen.age);
        System.out.println("Gender : "+stephen.Gender);
        //End

    }

    //Creating Class and Methods
    public static class Student{
        String name;
        int age;
        char Gender;
    }
    //End of creating methods
}
