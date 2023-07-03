class Empconstructor {
  String name;
  int age;

  Empconstructor(int age, String name) {
    this.name = name;
    this.age = age;
  }
}

class Employee extends Empconstructor {
  int emp_id;
  int emp_salary;

  Employee(int id, String name, int age, int salary) {
    super(age, name);
    emp_id = id;
    emp_salary = salary;
  }

  void printEmployeeDetails() {
    System.out.println("Employee ID     :  " + emp_id);
    System.out.println("Employee Name   :  " + name);
    System.out.println("Employee Age    :  " + age);
    System.out.println("Employee Salary :  " + emp_salary);
  }
}

public class Empconstructor  {
  public static void main(String[] args) {
    Employee emp = new Employee(101, "Sujay", 32, 22340);
    emp.printEmployeeDetails();
  }
}