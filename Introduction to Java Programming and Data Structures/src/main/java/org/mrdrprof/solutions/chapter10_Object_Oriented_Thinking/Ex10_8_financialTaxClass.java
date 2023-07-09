package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import static org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking.FilingStatus.HEAD_OF_HOUSEHOLD;
import static org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking.FilingStatus.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW;
import static org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking.FilingStatus.MARRIED_SEPARATELY;
import static org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking.FilingStatus.SINGLE_FILER;

/**
 * @author Mr.Dr.Professor
 * @since 3/23/2021 7:51 PM
 */
/*public*/ class Ex10_8_financialTaxClass {
  public static void main(String[] args) {
    int[][] bracketsFor2001 = {
            {27_050, 65_550, 136_750, 297_350}, // Single filer
            {45_200, 109_250, 166_500, 297_350}, // married filing jointly
            {22_600, 54_625, 83_250, 148_675}, // married filing separately
            {36_250, 93_650, 151_650, 297_350} // head of household
    };
    double[] ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

    int[][] bracketsFor2002 = {
            {6_000, 27_950, 67_700, 141_250, 307_050}, // Single filer
            {12_000, 46_700, 112_850, 171_950, 307_050}, // married filing jointly
            {6_000, 23_350, 56_425, 85_975, 153_525}, // married filing separately
            {10_000, 37_450, 96_700, 156_600, 307_050} // head of household
    };
    double[] ratesFor2002 = {0.1, 0.15, 0.27, 0.30, 0.35, 0.386};

    Tax taxFor2001 = new Tax(SINGLE_FILER,
                             bracketsFor2001, ratesFor2001, 50_000);
    System.out.println("2001 Tax Table");
    System.out.println("taxable\tSingle\tMarried\tMarried\tHead of");
    System.out.println("Income\tSingle\tJoint\tSeparate\ta House");

    for (int taxableIncome = 50_000; taxableIncome <= 60_000; taxableIncome += 1_000) {
      taxFor2001.setTaxableIncome(taxableIncome);

      taxFor2001.setFilingStatus(SINGLE_FILER);
      int taxForStatus0 = (int) taxFor2001.getTax();

      taxFor2001.setFilingStatus(MARRIED_JOINTLY_OR_QUALIFYING_WIDOW);
      int taxForStatus1 = (int) taxFor2001.getTax();

      taxFor2001.setFilingStatus(MARRIED_SEPARATELY);
      int taxForStatus2 = (int) taxFor2001.getTax();

      taxFor2001.setFilingStatus(HEAD_OF_HOUSEHOLD);
      int taxForStatus3 = (int) taxFor2001.getTax();

      System.out.println(taxableIncome + "\t" + taxForStatus0 + "\t" +
                         taxForStatus1 + "\t" + taxForStatus2 + "\t" +
                         taxForStatus3);
    }

    Tax taxFor2002 = new Tax(SINGLE_FILER, bracketsFor2002, ratesFor2002, 50_000);
    System.out.println("2002 Tax Table");
    System.out.println("taxable\tSingle\tMarried\tMarried\tHead of");
    System.out.println("Income\tSingle\tJoint\tSeparate\ta House");
    for (int taxableIncome = 50_000; taxableIncome <= 60_000; taxableIncome += 1_000) {
      taxFor2002.setTaxableIncome(taxableIncome);
      taxFor2002.setFilingStatus(SINGLE_FILER);
      int taxForStatus0 = (int) taxFor2002.getTax();
      taxFor2002.setFilingStatus(MARRIED_JOINTLY_OR_QUALIFYING_WIDOW);
      int taxForStatus1 = (int) taxFor2002.getTax();
      taxFor2002.setFilingStatus(MARRIED_SEPARATELY);
      int taxForStatus2 = (int) taxFor2002.getTax();
      taxFor2002.setFilingStatus(HEAD_OF_HOUSEHOLD);
      int taxForStatus3 = (int) taxFor2002.getTax();
      System.out.println(taxableIncome + "\t" + taxForStatus0 + "\t" +
                         taxForStatus1 + "\t" + taxForStatus2 + "\t" +
                         taxForStatus3);
    }
  }
}
