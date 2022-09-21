public class Employee {
    protected int ID;
    protected static int nextID = 0;
    protected String name;
    protected String departmentName;
    protected double salary;
    protected int managerID;
    protected static int nextManagerID = 0;

    public Employee(String name, String departmentName, double salary) {
        this.ID = nextID++;
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public int getManagerID() {
        return managerID;
    }

    void PrintEmpoyee() {
        System.out.println("ID:" + ID + " Name: " + name + " Department: " + departmentName + " Salary: " + salary);
    }

}
