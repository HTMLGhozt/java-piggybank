package com.lambdaschool;

import java.util.ArrayList;

public class PiggyBank
{
    private ArrayList<AbstractCurrency> bank = new ArrayList<AbstractCurrency>();
    private double totalValue;

    public void add(AbstractCurrency coin)
    {
        totalValue += coin.getTotalValue();
        bank.add(coin);
    }

    public void print()
    {
        for(AbstractCurrency c: bank) {
            System.out.println(c);
        }
    }

    public void printTotalValue() {
        System.out.println("The piggy bank holds $" + totalValue);
    }
}
