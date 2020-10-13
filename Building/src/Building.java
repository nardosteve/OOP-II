public class Building {

    //Array Lists
    public  static  String[] colors = {"Blue","Yellow","Green","Orange"};
    public  static  String [] building_name = {"Stmb", "Phase1", "Phase2", "SBS"};
    public  static int[]  nom = {10,20,30,40};

    //Methods
    //get colors
    public static String getcolor(int colorid)
    {
        return colors[colorid];
    }

    //get building names
    public static String getbuilding_name(int building_id)
    {
        return building_name[building_id];
    }

    //get number of rooms
    public static int getnom(int building_id)
    {
        return nom[building_id];
    }


    public static String printresults(){

        String c;
        String b;
        int n;

        for (int i = 0; i <= building_name.length-1; i++){
               b = getbuilding_name(i);
               c = getcolor(i);
               n = getnom(i);
            System.out.println("The building "+b + " is " +c +" in color and has "+n +" rooms");
        }

         return "Done";

    }

    //Main Method
    public static void main(String[] args){

        //call print method..
         String complete = printresults();

         //print done message..
         System.out.println(complete);
    }
}
