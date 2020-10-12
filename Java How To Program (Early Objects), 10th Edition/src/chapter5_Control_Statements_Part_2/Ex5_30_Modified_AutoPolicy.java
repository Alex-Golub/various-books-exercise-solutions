package chapter5_Control_Statements_Part_2;

/**
 * 5.30 (Modified AutoPolicy Class)
 * Modify class AutoPolicy in Fig. 5.11 to validate the two-letter
 * state codes for the northeast states. The codes are:
 * CT for Connecticut, MA for Massachusetts,
 * ME for Maine, NH for New Hampshire, NJ for New Jersey,
 * NY for New York, PA for Pennsylvania
 * and VT for Vermont.
 *
 * Created by ag on 12-Oct-20 2:23 PM 
 */
class Ex5_30_Modified_AutoPolicy {
  private int    accountNumber; // policy account number
  private String makeAndModel; // car that the policy applies to
  private String state; // two-letter state abbreviation

  public Ex5_30_Modified_AutoPolicy(int accountNumber, String makeAndModel, String state) {
    this.accountNumber = accountNumber;
    this.makeAndModel = makeAndModel;
    this.state = state;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setMakeAndModel(String makeAndModel) {
    this.makeAndModel = makeAndModel;
  }

  public String getMakeAndModel() {
    return makeAndModel;
  }

  public void setState(String state) {
    switch (state) {
      case "CT": case "MA": case "ME": case "NH":
      case "NJ": case "NY": case "PA": case "VT":
        this.state = state;
        break;
      default:
        System.out.println("Invalid state code");
    }
  }

  public String getState() {
    return state;
  }

  // predicate method returns whether the state has no-fault insurance
  public boolean isNoFaultState() {
    boolean noFaultState;

    // determine whether state has no-fault auto insurance
    switch (getState()) // get AutoPolicy object's state abbreviation
    {
      case "MA":
      case "NJ":
      case "NY":
      case "PA":
        noFaultState = true;
        break;
      default:
        noFaultState = false;
        break;
    }

    return noFaultState;
  }
}
