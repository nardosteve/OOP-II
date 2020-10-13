import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int from, int to, int mn){

        System.out.println("Multiplication table of "+mn);

        //Loop
        for(int x = from; x <= to; x++){
            System.out.println(mn+ "*" +x+ "=" + (mn*x));
        }

    }



    public static void main(String[] args) {
// TODO code application logic here

        //Creating MultiplicationTable object
        MultiplicationTable j = new MultiplicationTable();
        j.printTable(17, 25, 3);

        MultiplicationTable j1 = new MultiplicationTable();
        j1.printTable(3, 49, 17);

        MultiplicationTable j2 = new MultiplicationTable();
        j2.printTable(1, 5, 0);
    }

}
