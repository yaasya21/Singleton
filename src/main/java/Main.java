public class Main {
    public static void main(String[] args) {
        Manager employee0 = new Manager("Oleksandra Hryshchenko", "Advertisement", 25000, 5000);
        Employee employee1 = new Employee("Dmitriy Bondarev", "Advertisement", 10000);
        Employee employee2 = new Employee("Stanislav Borshch", "IT", 15000);
        Employee employee3 = new Employee("Grigoriy Pivovarow", "IT", 5000);

        Registry registry = Registry.getRegistry();

        try {
            registry.addWorker(employee0);
            registry.addWorker(employee1);
            registry.addWorker(employee2);
            registry.addWorker(employee3);
            registry.printList();
            registry.addWorker(employee3);  // ERROR!

        } catch (EmployeeInRegistryException exp) {
            System.out.println(exp.getMessage());
        }
    }
}
