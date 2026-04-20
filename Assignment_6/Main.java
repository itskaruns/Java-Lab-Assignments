public class Main {
    public static void main(String[] args) {

        try {
            Employee ft1 = new FullTimeEmployee(
                    "Karma", "PAN135", "02-01-2012", "SWE",
                    101, 300000, 100000, 40000, 0, "SWE"
            );

            Employee ct1 = new ContractEmployee(
                    "Kavish", "PAN431", "05-03-2013", "Contract",
                    102, 100, 50
            );

            Employee m1 = new Manager(
                    "Khushboo", "PAN789", "10-06-2020", "Manager",
                    103, 501000, 120300, 80200, 10000,
                    30200, 20200
            );

            Employee[] empList = {ft1, ct1, m1};

            System.out.println("EmpType\tBaseSal\tHealthIns\tBonus\tOptions\tCTC");

            for (Employee e : empList) {
                System.out.println(
                        e.getEmployeeType() + "\t" +
                        e.getBaseSalary() + "\t" +
                        e.getHealthIns() + "\t\t" +
                        e.getBonus() + "\t" +
                        e.getOptions() + "\t" +
                        e.calcCTC()
                );
            }

        } catch (InvalidEmployeeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        }
    }
}