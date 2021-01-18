package CodeStepByStep_java.classes_and_objects;

/**
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 3:19 PM
 */
class Clock {
  private int    hour;
  private int    minute;
  private String amPm;

  public Clock(int hour, int minute, String amPm) {
    this.hour = hour;
    this.minute = minute;
    this.amPm = amPm;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public String getAmPm() {
    return amPm;
  }

  public String toString() {
    return String.format("%d:%02d %s", hour, minute, amPm);
  }

  // moves your object forward in time by that amount of minutes
  // minutes passed could be any non-negative number, even a large number
  // such as 500 or 1000000.
  // If necessary, your object might wrap into the next hour or day,
  // or it might wrap from the morning ("AM")
  // to the evening ("PM") or vice versa.
  public void advance(int mins) {
    minute += mins;
    while (minute >= 60) {
      minute -= 60;
      hour++;
      if (hour == 12) {
        amPm = amPm.equals("AM") ? "PM" : "AM";
      } else if (hour > 12) {
        hour = 1;
      }
    }
  }

//  public void advance(int mins) {
//    int totalMinutes = hour % 12 * 60 + minute; // convert into absolute minutes representation
//    if (amPm.equals("PM")) {
//      totalMinutes += 12 * 60; // add 12 hours for PM
//    }
//    totalMinutes = (totalMinutes + mins) % (24 * 60); // move forward; throw away extra days
//    hour = totalMinutes / 60; // convert back to hour/minute/amPm
//    minute = totalMinutes % 60;
//    if (hour >= 12) {
//      amPm = "PM";
//    } else {
//      amPm = "AM";
//    }
//    if (hour == 0) {
//      hour = 12;
//    } else {
//      hour = hour % 12;
//    }
//  }

  public static void main(String[] args) {
    Clock time = new Clock(6, 27, "PM");
    System.out.println(time);
    time.advance(1);       //  6:28 PM
    System.out.println(time);
    time.advance(30);      //  6:58 PM
    System.out.println(time);
    time.advance(5);       //  7:03 PM
    System.out.println(time);
    time.advance(60);      //  8:03 PM
    System.out.println(time);
    time.advance(128);     // 10:11 PM
    System.out.println(time);
    time.advance(180);     //  1:11 AM
    System.out.println(time);
    time.advance(1440);    //  1:11 AM  (1 day later)
    System.out.println(time);
    time.advance(21075);   //  4:26 PM  (2 weeks later)
    System.out.println(time);

    System.out.println("**********");
    Clock t2 = new Clock(12, 0, "AM");
    t2.advance(67);
    System.out.println(t2);
  }
}
