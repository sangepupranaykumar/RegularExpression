package com.objectorientedprograms;
import java.util.Scanner;
public class PortfolioStock extends StockManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of Stocks");
        setNumOfStocks(sc.nextInt());
        for (int i = 1; i <= getNumOfStocks(); i++) {
            StockManagement st = new StockManagement();
            st.addShare();
            totalValue += stockPrice;
        }
        System.out.println("\nTotal Value is " + totalValue);
    }
}