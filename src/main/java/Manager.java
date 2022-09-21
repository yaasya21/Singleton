public class Manager extends Employee {
    double bonus;

    Manager(String name,
            String departmentName,
            double salary,
            double bonus) {
        super(name, departmentName, salary);
        this.managerID = nextManagerID++;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    void PrintEmpoyee() {
        System.out.println("ID:" + managerID + " Name: " + name + " Bonus:" + bonus);
    }
}
