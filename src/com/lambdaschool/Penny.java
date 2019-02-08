package com.lambdaschool;

public class Penny extends AbstractCurrency
{
    public Penny(int modifier)
    {
        super("Penny", 0.01, modifier);
    }
    public Penny()
    {
        super("Penny", 0.01, 1);
    }
}
