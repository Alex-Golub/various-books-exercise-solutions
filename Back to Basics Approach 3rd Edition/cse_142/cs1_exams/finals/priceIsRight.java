package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final8/priceIsRight
 *
 * @author Alex Golub
 * @since 15-Apr-21 1:24 PM
 */
class priceIsRight {
  public static void main(String[] args) {
  }

  public static int priceIsRight(int[] bids, int price) {
    int closestBid = -1;

    for (int bid : bids)
      if (price - bid >= 0 && bid > closestBid)
        closestBid = bid;

    return closestBid;
  }
}
