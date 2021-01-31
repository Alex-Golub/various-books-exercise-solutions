package chapter6_Methods;

/**
 * **6.24 (Display current date and time)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 10:21 PM
 */
class Ex5_24_currentDateAndTime {
  public static void main(String[] args) {
    System.out.println(currentTime());
    System.out.println(currentDate());
  }

  private static String currentDate() {
    return null; // TODO
  }

  public static String currentTime() {
    long totalSeconds = System.currentTimeMillis() / 1000; // 1/1/1970
    long seconds      = totalSeconds % 60;

    long totalMinutes = totalSeconds / 60;
    long minutes      = totalMinutes % 60;

    long totalHours = 2 + totalMinutes / 60; // Israel time
    long hours      = totalHours % 24;

    return String.format("%02d:%02d:%02d",
                         hours, minutes, seconds);
  }
}
