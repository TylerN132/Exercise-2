public class TestEmployee {
    
    public static void main(String[] args) {
        
        Employee Alex = new Employee(1, "Alex", "Grambell", 0);
        Employee Ted = new Employee(2, "Ted", "Teddy", 0);

        Alex.setSalary(4500);
        Ted.setSalary(5000);
        System.out.println(" ");
        System.out.println("Alex Salary: $" + Alex.getSalary());
        System.out.println("Ted's Salary: $" + Ted.getSalary());

        System.out.println(" ");
        System.out.println("Alexs Annual Salary: $" + Alex.getAnnualSalary());
        System.out.println("Teds Annual Salary: $" + Ted.getAnnualSalary());

        Alex.raiseSalary(20);
        Ted.raiseSalary(20);
        System.out.println(" ");
        System.out.println("Alex Salary after 20% raise: $" + Alex.getSalary());
        System.out.println("Ted Salary after 20% raise: $" + Ted.getSalary());
        System.out.println(" ");
    }
}
