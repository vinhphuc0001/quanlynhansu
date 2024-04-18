package N20DCVT038_OOP_TH4_01;

class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    // Getter method for department
    public String getDepartment() {
        return department;
    }
}

