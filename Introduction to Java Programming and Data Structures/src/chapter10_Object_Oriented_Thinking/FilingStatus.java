package chapter10_Object_Oriented_Thinking;

/*public*/ enum FilingStatus {
  SINGLE_FILER(0),
  MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(1),
  MARRIED_SEPARATELY(2),
  HEAD_OF_HOUSEHOLD(3);

  private final int filingStatus;

  FilingStatus(int filingStatus) {
    this.filingStatus = filingStatus;
  }

  public int getFilingStatus() {
    return filingStatus;
  }
}
