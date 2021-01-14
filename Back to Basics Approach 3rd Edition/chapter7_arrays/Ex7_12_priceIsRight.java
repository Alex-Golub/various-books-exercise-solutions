package chapter7_arrays;

/**
 * 12. Write a method called priceIsRight that mimics the guessing rules
 * from the game show The Price Is Right.
 * The method accepts as parameters an array of integers representing
 * the contestants’ bids and an integer representing a correct price.
 * The method returns the element in the bids array that is closest
 * in value to the correct price without being larger than that price.
 * If all bids are larger than the correct price, your method should return –1.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 5:24 PM
 */
class Ex7_12_priceIsRight {
  public static void main(String[] args) {
    int[] bids = {200, 300, 250, 1, 950, 40};
    System.out.println(priceIsRight(bids, 280)); // 250
  }

  public static int priceIsRight(int[] bids, int price) {
    int closestBid = -1;

    for (int bid : bids)
      if (price - bid >= 0 && bid > closestBid)
        closestBid = bid;

    return closestBid;
  }
}
