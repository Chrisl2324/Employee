import java.util.Scanner;
public class Employee {
    Scanner scan = new Scanner(System.in);
    private String name;
    private String id;
    private long salary;

    public void get_info(){
        System.out.print("Enter employee name: ");
        name = scan.next();
        System.out.print("Enter employee id: ");
        id = scan.next();
        System.out.print("Enter salary: ");
        salary = scan.nextLong();
    }

    public double get_annual_Salary(){
        double annual_salary = salary * 12;
        return annual_salary;
    }
    public void display_employee(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    public boolean search(String id_number){
        if(id.equals(id_number)){
            display_employee();
            return true;
        }
        return false;
    }


}
