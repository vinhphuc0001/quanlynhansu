package N20DCVT038_OOP_TH4_01;

public class TEST {
	public static void main(String[] args) {
        // Test Employee class
        Employee emp = new Employee("Quang", 22, 1000);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Test Manager class
        Manager manager = new Manager("Phuc", 22, 70000, "HR");
        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager Age: " + manager.getAge());
        System.out.println("Manager Salary: " + manager.getSalary());
        System.out.println("Manager Department: " + manager.getDepartment());
    }

}
