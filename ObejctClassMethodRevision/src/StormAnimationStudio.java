public class StormAnimationStudio {

    public static void main(String[] args){

        //Company Name
        Employee CompanyName = new Employee();
        CompanyName.cn = "Storm Animation Studio";

        //Creating Object out of the Employee Class
        Employee AnimationDepartment = new Employee();
        Employee LightingDepartment = new Employee();
        Employee RiggingDepartment = new Employee();

        //Company Name printing
        System.out.println(CompanyName.cn);

        //Creating and Initializing Animation Object name with information
        AnimationDepartment.id = 1;
        AnimationDepartment.name = "Nardosteve";
        AnimationDepartment.department = "Animation Department";
        AnimationDepartment.salary = 350000.00f;

        //Creating and Initializing  Lighting Object name with information
        LightingDepartment.id = 2;
        LightingDepartment.name = "Moses Lee";
        LightingDepartment.department = "Lighting Department";
        LightingDepartment.salary = 150000f;

        //Creating and initializing Rigging Object names with information
        RiggingDepartment.id = 3;
        RiggingDepartment.name = "Jerremy";
        RiggingDepartment.department = "Rigging";
        RiggingDepartment.salary = 20000f;

        //Printing out the Animation objects initialized information
        System.out.println("User ID: "+AnimationDepartment.id);
        System.out.println("Username: "+AnimationDepartment.name);
        System.out.println("Department: "+AnimationDepartment.department);
        System.out.println("Estimated Salary: $"+AnimationDepartment.salary + "\n");

        //Printing out the Lighting objects initialized information
        System.out.println("User ID: "+LightingDepartment.id);
        System.out.println("Username: "+LightingDepartment.name);
        System.out.println("Department: "+LightingDepartment.department);
        System.out.println("Estimated Salary: $"+LightingDepartment.salary + "\n");

        //Printing out the Rigging objects initialized information
        System.out.println("User ID: "+RiggingDepartment.id);
        System.out.println("Username: "+RiggingDepartment.name);
        System.out.println("Department: "+RiggingDepartment.department);
        System.out.println("Estimated Salary: $"+RiggingDepartment.salary + "\n");


    }
}
