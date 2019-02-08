package com.lambdaschool;

public class Dime extends AbstractCurrency
{
    public Dime(int modifier)
    {
        super("Dime", 0.1, modifier);
    }
    public Dime()
    {
        super("Dime", 0.1, 1);
    }
}
