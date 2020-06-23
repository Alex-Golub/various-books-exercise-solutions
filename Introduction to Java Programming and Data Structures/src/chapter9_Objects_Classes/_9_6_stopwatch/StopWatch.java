package chapter9_Objects_Classes._9_6_stopwatch;

import java.util.Date;

/**
 * Created by ag on 19-May-20 3:15 PM
 */
public class StopWatch {
  private Date startTime;
  private Date endTime;

  public StopWatch() {
    this.startTime = new Date();
  }

  public void start() {
    startTime = new Date();
  }

  public void stop() {
    endTime = new Date();
  }

  public long getElapsedTime() {
    return endTime.getTime() - startTime.getTime();
  }
}
