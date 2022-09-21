import java.util.ArrayList;

public class Registry {
    private ArrayList<Employee> workers = new ArrayList<Employee>();

    private static Registry workersRegistry = null;

    private Registry() {
    }

    public static Registry getRegistry() {
        if (workersRegistry == null) {
            workersRegistry = new Registry();
        }
        return workersRegistry;
    }

    public void addWorker(Employee emp) throws EmployeeInRegistryException {
        if (workers.contains(emp)) {
            throw new EmployeeInRegistryException("You entered an employee that have already existed");
        }
        workers.add(emp);
    }

    public void printList() {
        for (Employee emp : workers) {
            emp.PrintEmpoyee();
        }
    }
}
