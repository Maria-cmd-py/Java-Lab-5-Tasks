class Employee {
    String name;
    int id;
    double basicSalary;
    Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;  }
    double calculateAnnualSalary() {
        return basicSalary * 12;  }
}
class PermanentEmployee extends Employee {
    double bonus;
    PermanentEmployee(String name, int id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;  }
    double calculateTotalSalary() {
        return (basicSalary * 12) + bonus; }
}
public class empSystem {
    public static void main(String[] args) {
        PermanentEmployee emp1 = new PermanentEmployee("Ahmed", 101, 50000, 10000);
        System.out.println("Annual Salary: " + emp1.calculateAnnualSalary());
        System.out.println("Total Salary with Bonus: " + emp1.calculateTotalSalary());
    }
}