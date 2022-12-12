package com.objectorientedprograms;

public class BankAccountDetails {
    int debitAmount;
    int accBalance;
    BankAccountDetails(int debitAmount, int accBalance)
    {
        this.debitAmount=debitAmount;
        this.accBalance=accBalance;
    }
    /*
     * Checking for Available Balance using Account Balance & Debit Amount
     */
    public void debit()
    {
        int AvailableBalance=accBalance-debitAmount;
        if(accBalance>debitAmount)
            System.out.println("Available Balance: RS."+AvailableBalance);
        else if (accBalance<debitAmount)
            System.out.println("Insufficient Amount");
        else
            System.out.println("YOUR A/C BALANCE IS RS."+accBalance);
    }
    public static void main(String[] args)
    {
        BankAccountDetails obj=new BankAccountDetails(30000,50000);
        System.out.println("ACCOUNT DETAILS");
        System.out.println("===============");
        System.out.println("BANK OF BARODA");
        System.out.println("IFSC Code: BARB0PERUND");
        System.out.println("ACC NO: XXXX XXXX XXXX 7412");
        System.out.println("Account Balance:RS."+obj.accBalance);
        System.out.println("Debit Amount:RS."+obj.debitAmount);
        obj.debit();
    }
}
