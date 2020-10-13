public class Employee {
    //Below are some variables of the employee
    //Properties/Attributes
    int id;
    String name;
    String department;
    float salary;
    String cn;

    //Creating an employee method and initializing through constructors
    public void Stephen(int user_id, String u_name, String u_department, float u_salary){
        id = user_id;
        name = u_name;
        department = u_department;
        salary = u_salary;
    }

    public void Company_name(String c_name){
        cn = c_name;
        System.out.println("Hello world");
    }

}
