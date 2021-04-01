package chapter09_inheritance_and_interfaces;

class Employee {
  private int baseHours = 40;
  private double baseSalary = 40000.0;
  private int baseVacationDays = 10;
  private String baseVacationForm = "yellow";

  public int getHours() {
    return baseHours;                // 40 hours/week
  }

  public double getSalary() {
    return baseSalary;               // $40,000.00
  }

  public int getVacationDays() {
    return baseVacationDays;         // 10 days
  }

  public String getVacationForm() {
    return baseVacationForm;         // yellow
  }

  public final void setBaseHours(int hours) {
    baseHours = hours;
  }

  public final void setBaseSalary(double salary) {
    baseSalary = salary;
  }

  public final void setBaseVacationDays(int days) {
    baseVacationDays = days;
  }

  public final void setBaseVacationForm(String form) {
    baseVacationForm = form;
  }
}

/**
 * BJP3 Exercise 9.1: Marketer
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter9/e1-Marketer
 */
class Marketer extends Employee {
  @Override
  public double getSalary() {
    return super.getSalary() + 10_000;
  }

  public void advertise() {
    System.out.println("Act now, while supplies last!");
  }
}

/**
 * BJP3 Exercise 9.2: Janitor
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter9/e2-Janitor
 */
class Janitor extends Employee {

  // twice as many hours per week as other employees
  public int getHours() {
    return 2 * super.getHours();
  }

  // yhey make $10,000 less than general employees
  public double getSalary() {
    return super.getSalary() - 10_000;
  }

  // they get half as much vacation as other employees
  public int getVacationDays() {
    return super.getVacationDays() / 2;
  }

  public void clean() {
    System.out.println("Workin' for the man.");
  }
}

/**
 * BJP3 Exercise 9.3: HarvardLawyer
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter9/e3-HarvardLawyer
 */
class Lawyer extends Employee {
  private String lawyerVacationForm = "pink";

  public int getVacationDays() {
    return super.getVacationDays() + 5;
  }

  public String getVacationForm() {
    return lawyerVacationForm;
  }

  public final void setVacationForm(String form) {
    lawyerVacationForm = form;
  }

  public void sue() {
    System.out.println("I'll see you in court!");
  }
}


class HarvardLawyer extends Lawyer {
  // make 20% more money than a normal lawyer
  public double getSalary() {
    return 1.20 * super.getSalary();
  }

  // they get 3 days more vacation
  public int getVacationDays() {
    return super.getVacationDays() + 3;
  }

  // they have to fill out four of the lawyer's forms to go on vacation.
  public String getVacationForm() {
    String form = super.getVacationForm();
    return form + form + form + form;
  }
}