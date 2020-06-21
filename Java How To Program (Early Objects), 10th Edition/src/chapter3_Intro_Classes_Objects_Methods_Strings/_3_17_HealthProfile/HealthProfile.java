package chapter3_Intro_Classes_Objects_Methods_Strings._3_17_HealthProfile;

import chapter2_Intro_Java_Input_Ouput._2_33_BMI.BMI;
import chapter3_Intro_Classes_Objects_Methods_Strings._3_14_Date.Date;
import chapter3_Intro_Classes_Objects_Methods_Strings._3_16_HeartRate.HeartRates;

/**
 * Created by ag on 21-Jun-20 12:42 PM
 */
public class HealthProfile {

  // We can use 3.16 HeartRate class
  private String firstName;
  private String lastName;
  private Date dateOfBirth;

  // BMI 2.33 will be used with this attributes
  private String gender;
  private double height; // inch's
  private double weight; // pounds

  public HealthProfile(String firstName, String lastName, String gender,
                       Date dateOfBirth, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.dateOfBirth = dateOfBirth;
    this.height = height;
    this.weight = weight;
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

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public int getAge() {
    return new HeartRates(this.getFirstName(), this.getLastName(), this.getDateOfBirth())
            .personAge();
  }

  public int maxHeartRate() {
    return new HeartRates(this.getFirstName(), this.getLastName(), this.getDateOfBirth())
            .maxHeartRate();
  }

  public double targetHeartRate() {
    return new HeartRates(this.getFirstName(), this.getLastName(), this.getDateOfBirth())
            .targetHeartRate();
  }

  public void bmi() {
    BMI.calculateBMI(this.getWeight(), this.getHeight());
  }


  public void printInfo() {
    System.out.println(
            "FULL NAME: " + this.getFirstName() + " " + this.getLastName() + "\n" +
            "GENDER: " + this.getGender() + "\n" +
            "BIRTH DATE: " + this.getDateOfBirth().displayDate() + "\n" +
            "HEIGHT: " + this.getHeight() + " inch's\n" +
            "WEIGHT: " + this.getWeight() + " pounds\n" +
            "AGE: " + this.getAge() + " y\\o\n" +
            "MAX HEART RATE: " + this.maxHeartRate() + "\n" +
            "TARGET HEART RATE: " + this.targetHeartRate() + "\n"
    );
    this.bmi();
  }
}
