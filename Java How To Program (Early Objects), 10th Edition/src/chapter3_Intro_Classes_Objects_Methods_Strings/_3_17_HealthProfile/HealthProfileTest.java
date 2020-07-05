package chapter3_Intro_Classes_Objects_Methods_Strings._3_17_HealthProfile;

import chapter3_Intro_Classes_Objects_Methods_Strings._3_14_Date.Date;

/**
 * Created by ag on 21-Jun-20 1:02 PM
 */
class HealthProfileTest {
  public static void main(String[] args) {
    HealthProfile profile = new HealthProfile(
            "Alex", "MrDrProfessor", "MALE",
            new Date(7, 18, 1988), 72.0, 140
    );

    profile.printInfo();
  }
}
