public class Employee {
        private int id;
        private String firstName;
        private String lastName;
        private int salary;
    
    
        public Employee(int id, String firstName, String lastName, int salary) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }
    
        public int getID() {
            return id;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public String getName() {
            return firstName + " " + lastName;
        }
    
        public int getSalary() {
            return salary;
        }
    
        public void setSalary(int salary) {
            this.salary = salary;
        }
        public int getAnnualSalary() {
            int AnnualSalary;
            AnnualSalary = salary * 12;
            return AnnualSalary;
        }
    
        public int raiseSalary(int percent) {
            double percentage = percent / 100.0;
            int raisedSalary = (int) (salary + (salary * percentage));
            this.salary = raisedSalary;
            return salary;
        }
    
        public String toString() {
            return ("Employee[id=" + this.id + ",name=" + getName() + ",salary" + salary);
        }
    
    
    }

