package chapter3_Intro_Classes_Objects_Methods_Strings._3_16_HeartRate;

import chapter3_Intro_Classes_Objects_Methods_Strings._3_14_Date.Date;

import java.time.Year;

/**
 * Created by ag on 21-Jun-20 12:20 PM
 */
public class HeartRates {

  private String firstName;
  private String lastName;
  private Date dateOfBirth; // using Date class from exercise 3.14

  public HeartRates(String firstName, String lastName, Date dateOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public int personAge() {
    return Year.now().getValue() - this.getDateOfBirth().getYear();
  }

  public int maxHeartRate() {
    // maximum heart rate in beats per minute is 220 minus your age in years
    return 220 - this.personAge();
  }

  public double targetHeartRate() {
    // target heart rate is a range that’s 50–85% of your maximum heart rate
    // return upper bound 85%
    return this.maxHeartRate() * 0.85;
  }

  public void displayDate() {
    System.out.println(
            String.format(
                    "%s %s %s%nAge: %2d, MHR: %d, TARGET: %.2f",
                    this.getFirstName(), this.getLastName(), this.getDateOfBirth().displayDate(),
                    this.personAge(), this.maxHeartRate(), this.targetHeartRate()
            )
    );
  }
}
