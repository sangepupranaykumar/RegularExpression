package com.objectorientedprograms;
import java.util.Scanner;
public class StockPortfolio extends StockAccountManagement{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of Stocks");
        setNumOfStocks(sc.nextInt());
        for (int i = 1; i <= getNumOfStocks(); i++) {
            StockAccountManagement stock = new StockAccountManagement();
            stock.addShare();
            totalValue += stockPrice;
        }
        System.out.println("\nTotal Value is " + totalValue);
    }
}
