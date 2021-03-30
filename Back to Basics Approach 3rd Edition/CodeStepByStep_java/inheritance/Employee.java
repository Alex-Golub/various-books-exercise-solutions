package CodeStepByStep_java.inheritance;

/**
 * https://www.codestepbystep.com/problem/view/java/inheritance/Custodian
 * https://www.codestepbystep.com/problem/view/java/inheritance/StanfordLawyer
 *
 * @author Alex Golub
 * @since 29-Mar-21 12:18 PM
 */
class Employee {
  private int baseHours = 40;
  private double baseSalary = 40000.0;
  private int baseVacationDays = 10;
  private String baseVacationForm = "yellow";

  public int getHours() {
    return baseHours;
  }

  public double getSalary() {
    return baseSalary;
  }

  public int getVacationDays() {
    return baseVacationDays;
  }

  public String getVacationForm() {
    return baseVacationForm;
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

class Lawyer extends Employee {
  private String lawyerVacationForm = "pink";

  public int getVacationDays() { return super.getVacationDays() + 5; }
  public String getVacationForm() { return lawyerVacationForm; }
  public String sue() { return "I'll see you in court!"; }
  public final void setVacationForm(String form) { lawyerVacationForm = form; }
}

class StanfordLawyer extends Lawyer {
  @Override
  public double getSalary() {
    return 1.20 * super.getSalary();
  }

  @Override
  public int getVacationDays() {
    return 3 + super.getVacationDays();
  }

  @Override
  public String getVacationForm() {
    String form = super.getVacationForm();
    return form + form + form + form;
  }
}

class Custodian extends Employee {
  public int getHours() { return 2 * super.getHours(); }
  public double getSalary() { return super.getSalary() - 10_000; }
  public int getVacationDays() { return super.getVacationDays() / 2; }
  public String clean() { return "Workin' for the man."; }

}
