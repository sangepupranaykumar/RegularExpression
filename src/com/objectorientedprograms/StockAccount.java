package com.objectorientedprograms;

public class StockAccount {
    String stockAccount(String filename)
    {
        return filename;
    }

    double valueof()
    {
        return 89000.00;

    }
    void buy(int amount,String symbol)
    {
        System.out.println("COGNIZANT : "+symbol);
        System.out.println("The Amount invested in Stock Market to get shares : $"+amount);
    }
    void sell(int amount,String symbol)
    {
        System.out.println("Infosys : "+symbol);
        System.out.println("The Amount invested in Stock Market to sell shares : $"+amount);

    }
    void save(String filename)
    {
        System.out.println("Stock Market Share Details:-");
        System.out.println("----------------------------");
        System.out.println(filename);
    }
    void printReport()
    {
        System.out.println("The Transaction Time : \t23:06pm");
        System.out.println("The Transaction Date : \t01-01-2023[dd/mm/yy]");

    }
    public static void main(String[] args)
    {
        StockAccount obj = new StockAccount();
        obj.stockAccount("COGNIZANT");
        obj.buy(1000000, "+CTSH");
        obj.sell(500000,"-INFY");
        obj.save("CognizantStockAccount.pdf");
        obj.printReport();
    }
}
