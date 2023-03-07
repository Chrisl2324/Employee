import java.util.Scanner;
public class EmployeeTotals extends Employee {
    static double grand_total = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeTotals one = new EmployeeTotals();
        one.menu();
        System.out.printf("\nTotal Salary is: %.2f", grand_total);

    }
    public double menu() {
        int x;
        System.out.print("Enter number of employees: ");
        x = scan.nextInt();
        Employee[] employees = new Employee[x];

        System.out.println("MENU");
        System.out.println("================");
        System.out.println("1. IT DEPARTMENT");
        System.out.println("2. ACCOUNTING DEPARTMENT");
        System.out.println("3. EXIT");
        System.out.println("================");
        System.out.println("Enter your choice: ");
        int choice = scan.nextInt();
        do {
            if (choice == 1) {
                System.out.println("WELCOME TO IT DEPARTMENT!");
                System.out.println("=========================");
                for (int i = 0; i < employees.length; i++) {
                    employees[i] = new Employee();
                    employees[i].get_info();
                    double y = employees[i].get_annual_Salary();
                    grand_total += y;
                }
            } else if (choice == 2) {
                System.out.println("WElCOME TO ACCOUNTING DEPARTMENT!");
                System.out.println("=================================");
                for (int i = 0; i < employees.length; i++) {
                    employees[i] = new Employee();
                    employees[i].get_info();

                }

            }
            return grand_total;
        } while (choice != 3);
    }
}

