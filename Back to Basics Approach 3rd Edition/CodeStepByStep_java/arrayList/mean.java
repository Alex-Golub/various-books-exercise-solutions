package CodeStepByStep_java.arrayList;

import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/mean
 *
 * @author Alex Golub
 * @since 24-Apr-21, 9:33 PM
 */
class mean {
  public static double mean(List<Double> list) {
    return list.stream().mapToDouble(Double::valueOf).average().orElse(0.0);
  }
}
